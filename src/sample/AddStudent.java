package sample;

import com.sun.xml.internal.ws.api.message.Message;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class AddStudent {

    @FXML
    TextField T1;
    @FXML
    TextField T2;
    @FXML
    TextField T3;
    @FXML
    TextField T4;

  static Stage stage;

  /*public void initialize() throws IOException {
      System.out.println("it is initialize");
      stage=new Stage();

  }*/
  public void start() throws IOException {
      stage=new Stage();
      Parent root5 = FXMLLoader.load(getClass().getResource("AddStudent.fxml"));
      Scene scene=new Scene(root5);
      stage.setScene(scene);
      stage.show();
  }
    public void Addstudent(ActionEvent actionEvent)
    {
        Button B = (Button) actionEvent.getSource();
        String txt= B.getId();
        if(txt.equals("Save"))
        {
            Student students = new Student();
            students.Name=T1.getText();
            students.Department=T2.getText();
            students.ID=Integer.parseInt(T3.getText());
            students.E_mail=T4.getText();
            Global.student.add(students);
            Global.c2++;

            T1.clear();
            T2.clear();
            T3.clear();
            T4.clear();
        }

        if (txt.equals("Close"))
        {
            stage.close();

        }
    }

}
