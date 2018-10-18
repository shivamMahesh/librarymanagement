package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.table.TableCellEditor;
import java.util.Iterator;

public class bookslistcontroller {
@FXML
private Label label1;
@FXML
private Label label2;
    @FXML
    private Label label3;
    @FXML
    private Label label4;
    @FXML
   static String s1,s2,s3,s4;
    public void check(ActionEvent event) {

        s1=s2=s3=s4="";
   //Lambda Expression used
   bookscontroller.a.forEach((bd)->{
      // System.out.println(bd.bookid);
       s1+=bd.bookid+"\n";
       s2+=bd.bookn+"\n";
       s3+=bd.bookauthor+"\n";
       s4+=bd.bookpublication+"\n";
       });
        label1.setText(s1);
        label2.setText(s2);
        label3.setText(s3);
        label4.setText(s4);
    }
    @FXML
    public  void back(ActionEvent event)
    {
        Main.pm.setTitle("Library Assistant Menu");
        Main.pm.setWidth(649.0);
        Main.pm.setHeight(448.0);
        Main.pm.setScene(MainController.scenei);
        Main.pm.show();
    }
}