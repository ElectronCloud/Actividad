/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class View1 {
   private Scene scene;
   private GridPane grid;
   private Text scenetitle;
   private Label name;
   private TextField nameTF;
   private Label adress;
   private TextField adressT;
   private Label phone;
   private TextField phoneT;
   private Button add;
   private Button list;
   private HBox hbBtn;
   
   private Text messageT;
   
    
   public View1(){
    
    grid = new GridPane();
    grid.setAlignment(Pos.CENTER);
    grid.setHgap(10);
    grid.setVgap(10);
    grid.setPadding(new Insets(25,25,25,25));
    
    scenetitle = new Text("Contact");
    grid.add(scenetitle, 0, 0, 2, 1);
    
    name = new Label ("Name: ");
    grid.add(name, 0, 1);
    
    nameTF = new TextField ();
    grid.add(nameTF, 1, 1);
    
    adress = new Label("Adress: ");
    grid.add(adress, 0, 2);
    
    adressT = new TextField();
    grid.add(adressT, 1, 2);
    
    phone = new Label ("Phone: ");
    grid.add(phone, 0, 3);
    
    phoneT = new TextField();
    grid.add(phoneT, 1, 3);
    
    add = new Button("Add");
    list = new Button ("List");
    
    list.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            View2 v2 = new View2();
            v2.show(new Stage());
            
        }
    });
    
    hbBtn = new HBox(10);
    hbBtn.setAlignment(Pos.CENTER);
    hbBtn.getChildren().add(add);
    hbBtn.getChildren().add(list);
    grid.add(hbBtn, 1, 4);
    
    
    messageT = new Text("Hellous");
    grid.add(messageT, 1, 6);
 
    scene = new Scene(grid, 300, 300);
    
}   
   
   public void show(Stage stage) {
      stage.setTitle("Actividad");
      stage.setScene(scene);
      stage.show();
   }

    public TextField getNameTF() {
        return nameTF;
    }

    public TextField getAdressT() {
        return adressT;
    }

    public TextField getPhoneT() {
        return phoneT;
    }

    public Button getAdd() {
        return add;
    }

    public Text getMessageT() {
        return messageT;
    }
   
}


