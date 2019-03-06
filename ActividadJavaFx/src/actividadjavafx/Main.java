/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjavafx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author Juan
 */
public class Main extends Application{

    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Registrar la variable en el singleton
        Singleton singleton = singleton = Singleton.getSingleton();
        singleton.setStage(primaryStage);
        
        //Modelo en memoria
        Modelo modelo = new Modelo();
        
        //Invocar el controlador de la vista que se quiere visualizar
        Controlador1 ventana1 = new Controlador1(modelo);
        ventana1.mostrarVista();
    }
    
}

//Pasar los datos que se escriben en un textfield a la otra ventana