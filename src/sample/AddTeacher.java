package sample;

import com.sun.xml.internal.ws.api.message.Message;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddTeacher {

    @FXML
    TextField T1;
    @FXML
    TextField T2;
    @FXML
    TextField T3;
    @FXML
    TextField T4;


    public void Addteacher(ActionEvent actionEvent)
    {
        Button B = (Button) actionEvent.getSource();
        String txt= B.getId();
        if(txt.equals("Save"))
        {
            Teacher teachers = new Teacher();
            teachers.Name=T1.getText();
            teachers.Department=T2.getText();
            teachers.ID=Integer.parseInt(T3.getText());
            teachers.E_mail=T4.getText();
            Global.teacher.add(teachers);
            Global.c3++;

            T1.clear();
            T2.clear();
            T3.clear();
            T4.clear();
        }

        if (txt.equals("Close"))
        {
            Platform.exit();
        }
    }

}
