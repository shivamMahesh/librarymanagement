package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class interfacecontroller {

	
	public void interfere(ActionEvent event) throws Exception {
		String value = ((Button) event.getSource()).getText();
		if (value.equals("ADD BOOK")) {

			Parent root = FXMLLoader.load(getClass().getResource("/application/main.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Add New Book");
			Main.pm.setWidth(574.0);
			Main.pm.setHeight(385.0);
			Main.pm.setMaxWidth(574.0);
			Main.pm.setMaxHeight(385.0);
			Main.pm.setScene(scene);
			Main.pm.show();

		} else if (value.equals("ADD MEMBER")) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/member.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Add New Member");
			Main.pm.setWidth(574.0);
			Main.pm.setHeight(385.0);
			Main.pm.setMaxWidth(574.0);
			Main.pm.setMaxHeight(385.0);
			Main.pm.setScene(scene);
			Main.pm.show();
		} else if (value.equals("ISSUE BOOK")) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/issue.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Book Issue");
			Main.pm.setWidth(574.0);
			Main.pm.setHeight(385.0);
			Main.pm.setMaxWidth(574.0);
			Main.pm.setMaxHeight(385.0);
			Main.pm.setScene(scene);
			Main.pm.show();

		} else if (value.equals("RETURN BOOK")) {
			Parent root = FXMLLoader.load(getClass().getResource("/application/return.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Book Return");
			Main.pm.setWidth(574.0);
			Main.pm.setHeight(385.0);
			Main.pm.setMaxWidth(574.0);
			Main.pm.setMaxHeight(385.0);
			Main.pm.setScene(scene);
			Main.pm.show();

		} else if (value.equals("BOOKS LIST")) {

			Parent root = FXMLLoader.load(getClass().getResource("/application/bookslist.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Book List");
			Main.pm.setWidth(574.0);
			Main.pm.setHeight(385.0);
			Main.pm.setMaxWidth(574.0);
			Main.pm.setMaxHeight(385.0);
			Main.pm.setScene(scene);
			Main.pm.show();


		} else if (value.equals("SEARCH MEMBER")) {

			Parent root = FXMLLoader.load(getClass().getResource("/application/memberlists.fxml"));
			Scene scene = new Scene(root, 400, 400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Main.pm.setTitle("Search Member");
			Main.pm.setWidth(650);
			Main.pm.setHeight(458);
			Main.pm.setMaxWidth(650);
			Main.pm.setMaxHeight(458);
			Main.pm.setScene(scene);
			Main.pm.show();


		} else {
			issuecontroller.hash_Set.clear();
			issuecontroller.a.clear();
			membercontroller.hash_Set.clear();
			membercontroller.a.clear();
			bookscontroller.hash_Set.clear();
			bookscontroller.a.clear();
			Main.pm.setTitle("Library Assistant Menu");
			Main.pm.setWidth(649.0);
			Main.pm.setHeight(448.0);
			Main.pm.setScene(Main.scenel);
			Main.pm.show();
				}
			}

	}