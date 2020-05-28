/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibary;

import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author PC
 */
public class ProjectLibary extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        ControllerLogIN log=new ControllerLogIN();
        log.paneLOgIn = FXMLLoader.load(getClass().getResource("logIN.fxml"));
        Map<String, Pane> mapPanes = new TreeMap<>();
        mapPanes.put("LogIn", log.paneLOgIn);
        Scene scene = new Scene(mapPanes.get("LogIn"));
        primaryStage.setTitle("Lipary *_*");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
