package sample;

import com.sun.xml.internal.ws.api.message.Message;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ViewTeacher {

    @FXML
    TextField T1;
    @FXML
    TextArea TA1;

    public void Viewteacher(ActionEvent actionEvent)
    {

        Button B =(Button) actionEvent.getSource();
        String txt = B.getId();
        String Target;
        if(txt.equals("Search"))
        {
            Target= T1.getText();
            TA1.setText(Global.teacher.get(0).search(Target,Global.student,Global.teacher,Global.c3));
        }

    }
}
