package application;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class assistantcontroller{
    @FXML
    private Label aslabel;
    @FXML
    private TextField as_id;
    @FXML
    private TextField as_name;
    @FXML
    private TextField as_phno;
    @FXML
    private PasswordField as_pass;
    @FXML
    private  PasswordField as_pass1;


    public static ArrayList<assistantdetails> a=new ArrayList<>();
    public static Set<String> hash_Set = new HashSet<String>();

    @FXML
    public void check(ActionEvent event)
    {
        assistantdetails b=new assistantdetails();
        b.asid=as_id.getText();
        b.asn=as_name.getText();
        b.aspn=as_phno.getText();
        b.asp=as_pass.getText();
        if(!b.asp.equals(as_pass1.getText()))
        {
            aslabel.setText("PASSWORD DOES'NT MATCH");
        }
        else if(hash_Set.contains(b.asid))
        {
            aslabel.setText("ASSISTANT ALREADY EXISTS");
        }
        else
        {
            try( FileWriter f=new FileWriter("C:\\Users\\SHIVAM MAHESHWARI\\Desktop\\Libmanage\\src\\application\\assistant.txt",true)){
                f.write("\n"+b.asid+" "+b.asn+" "+b.aspn+" "+b.asp);
                a.add(b);
                hash_Set.add(b.asid);
                aslabel.setText("ADDED SUCCESSFULLY");

            }catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }
    @FXML
    public  void back(ActionEvent event)
    {
        Main.pm.setTitle("Library Assistant Menu");
        Main.pm.setWidth(649.0);
        Main.pm.setHeight(448.0);
        Main.pm.setScene(Main.scenel);
        Main.pm.show();
    }
}
