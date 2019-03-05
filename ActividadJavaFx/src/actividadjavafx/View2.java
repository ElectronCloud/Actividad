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
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class View2 {
    
   private Scene scene;
   private GridPane grid;
   private Text scenetitle;
   private ListView<String> list;   
   private Button back;
   private HBox hbBtn;
   
   public View2(){
       grid = new GridPane();
       grid.setAlignment(Pos.CENTER);
       grid.setHgap(10);
       grid.setVgap(10);
       grid.setPadding(new Insets(25,25,25,25));
       
       scenetitle = new Text("Directory");
       grid.add(scenetitle, 0, 0, 2, 1);
       
       list = new ListView<>();
       list.setMaxWidth(200);
       grid.add(list, 0, 1);
       
       back = new Button ("Back");
       back.setOnAction(new EventHandler<ActionEvent>() {
           @Override
           public void handle(ActionEvent event) {
               View1 v1 = new View1();
               v1.show(new Stage());
           }
       });
       
       hbBtn = new HBox(10);
       hbBtn.setAlignment(Pos.CENTER);
       hbBtn.getChildren().add(back);
       grid.add(hbBtn, 0, 2);
       
       scene = new Scene(grid, 300, 300);
   }
   
   public void show(Stage stage) {
      stage.setTitle("Actividad");
      stage.setScene(scene);
      stage.show();
   }

    public ListView<String> getList() {
        return list;
    }
   
   
}
