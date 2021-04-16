/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author PREMz ,Pollapatronum
 */
public class StudyJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent startRoot = FXMLLoader.load(getClass().getResource("StartGUI.fxml"));
        Scene scene = new Scene(startRoot);
        primaryStage.setScene(scene);
        primaryStage.setTitle("EE-KAE-CARDGAME");
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
