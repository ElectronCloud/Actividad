/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjavafx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 *
 * @author jcarrero
 */
public class View3 {
    private Scene scene;
    private HBox hbox;
    private Button go1;
    private Button go2;
    
    public View3(){
        
        hbox = new HBox(20);
        hbox.setAlignment(Pos.CENTER);
        go1 = new Button("Back View 1");
        hbox.getChildren().add(go1);
        go2 = new Button ("Back View 2");
        hbox.getChildren().add(go2);
        scene = new Scene(hbox,300,300);
    }
    
    public void mostrar(Stage stage){
        stage.setTitle("Ventana 3");
        stage.setScene(scene);
        stage.show();
    }

    public Button getGo1() {
        return go1;
    }

    public Button getGo2() {
        return go2;
    }
    
    
}
