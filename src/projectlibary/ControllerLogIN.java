/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibary;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXML;
import static javafx.application.ConditionalFeature.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class ControllerLogIN {

    @FXML
    private TextField textFiledUser;

    @FXML
    private Label labelPass;

    @FXML
    private Button buttonSign;

    @FXML
    private VBox vBox;

    @FXML
    private Label labelLog;

    @FXML
    private PasswordField textFieldPass;

    @FXML
    private Label labelUser;

    @FXML
    public FlowPane paneLOgIn;
    private Stage primaryStage;

    @FXML
    private void signInHandel(ActionEvent event) throws IOException {
        if (textFiledUser.getText().equals("Aisha")) {
             ControllerSignIN c1=new ControllerSignIN();
                      paneLOgIn  = c1.paneSignIN;
                      Scene scene=new Scene(paneLOgIn);
                      primaryStage.show();
            
        }
    }
}
