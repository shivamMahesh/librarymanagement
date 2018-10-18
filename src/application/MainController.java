package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;

import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ProgressBar;
import javafx.stage.Stage;

public class MainController  {

	@FXML
	private Label lLogin;
	@FXML
	private TextField tfUserid;
	
	@FXML
	private TextField tfPassword;

static Scene scenei;
	
	public void login(ActionEvent event) throws Exception
    {
    	String id=tfUserid.getText();
    	String ps=tfPassword.getText();
    	int flag=0;
    	if(assistantcontroller.hash_Set.contains(id))
		{
			Iterator<assistantdetails> itr=assistantcontroller.a.iterator();
			while(itr.hasNext())
			{
				assistantdetails ad=itr.next();
				if(ad.asid.equals(id) && ad.asp.equals(ps))
					flag=1;
			}
		}
		if(flag==1)
		{
			lLogin.setText("Login Succesful!");

			String line;

	    	try (
	    	    FileReader isr = new FileReader("C:\\Users\\SHIVAM MAHESHWARI\\Desktop\\Libmanage\\src\\application\\books.txt");
	    	    BufferedReader br = new BufferedReader(isr)) {
	    	    while ((line = br.readLine()) != null) {
	    	    	String[] str=line.split(" ");
						booksdetails bd=new booksdetails();
	    	    	bd.bookid=str[0];
	    	    	bd.bookn=str[1];
	    	    	bd.bookauthor=str[2];
	    	    	bd.bookpublication=str[3];
	    	    	bookscontroller.a.add(bd);
	    	    	bookscontroller.hash_Set.add(str[0]);


	    	    }}
				catch(Exception e)
	    	{
	    		System.out.println(e);
	    	}

	    	try (
		    	    FileReader isr = new FileReader("C:\\Users\\SHIVAM MAHESHWARI\\Desktop\\Libmanage\\src\\application\\membersid.txt");
		    	    BufferedReader br2 = new BufferedReader(isr)) {

				while ((line = br2.readLine()) != null) {
					String[] str = line.split(" ");
					memberdetails  mem=new memberdetails();
					mem.memberid = str[0];
					mem.membername = str[1];
					mem.memberphone = str[2];
					mem.memberemail = str[3];
					membercontroller.a.add(mem);
					membercontroller.hash_Set.add(str[0]);

				}

			}catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}
				


	    	
	    	try (
		    	    FileReader isr = new FileReader("C:\\Users\\SHIVAM MAHESHWARI\\Desktop\\Libmanage\\src\\application\\issue.txt");
		    	    BufferedReader br1 = new BufferedReader(isr)) {
		    	    while ((line = br1.readLine()) != null) {
		    	    	String [] str=line.split(" ");
						issuedetails isue=new issuedetails();
		    	    	isue.bookid=str[0];
		    	    	isue.memberid=str[1];
		    	    	issuecontroller.a.add(isue);
		    	    	issuecontroller.hash_Set.add(isue.bookid);
		    	    }

		    	}catch(Exception e)
		    	{
		    		System.out.println(e);
		    	}


		    	Parent root = FXMLLoader.load(getClass().getResource("/application/interface.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			scenei=scene;
			Main.pm.setTitle("Library Assistant Menu");
			Main.pm.setWidth(649.0);
			Main.pm.setHeight(448.0);
			Main.pm.setScene(scene);
			Main.pm.show();

			
			
		}
		else {
			lLogin.setText("Login Failed!");
		}
	}
@FXML
	public void signup(ActionEvent event)
{
	try {
		issuecontroller.hash_Set.clear();
		issuecontroller.a.clear();
		membercontroller.hash_Set.clear();
		membercontroller.a.clear();
		bookscontroller.hash_Set.clear();
		bookscontroller.a.clear();
		Parent root = FXMLLoader.load(getClass().getResource("/application/assistant.fxml"));
		Scene scene = new Scene(root,400,400);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Main.pm.setTitle("Libarary Assistant Signup");
		Main.pm.setWidth(570);
		Main.pm.setHeight(395);
		Main.pm.setScene(scene);
		Main.pm.show();
	} catch (Exception e)

	{
		System.out.println(e.getMessage());
	}
}
}
