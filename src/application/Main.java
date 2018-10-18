package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

import java.io.BufferedReader;
import java.io.FileReader;


public class Main extends Application {
	static Stage pm;
	static Scene scenel;
	@Override
	public void start(Stage primaryStage) {
		String line;
		try (
				FileReader isr = new FileReader("C:\\Users\\SHIVAM MAHESHWARI\\Desktop\\Libmanage\\src\\application\\assistant.txt");
				BufferedReader br1 = new BufferedReader(isr)) {
			while ((line = br1.readLine()) != null) {
				String[] str = line.split(" ");
				assistantdetails ad = new assistantdetails();
				ad.asid = str[0];
				ad.asn = str[1];
				ad.aspn = str[2];
				ad.asp = str[3];
				//System.out.println(ad.asid+"\t"+ad.asp);
				assistantcontroller.a.add(ad);
				assistantcontroller.hash_Set.add(ad.asid);
			}
			Parent root = FXMLLoader.load(getClass().getResource("/application/login1.fxml"));
			Scene scene = new Scene(root, 1000, 1000);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			pm = primaryStage;
			scenel = scene;
			primaryStage.setTitle("Library Assisstant Login");
			primaryStage.setWidth(649.0);
			primaryStage.setHeight(448.0);
			primaryStage.setScene(scene);
			primaryStage.show();
		}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
