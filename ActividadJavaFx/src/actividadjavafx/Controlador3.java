/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjavafx;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author jcarrero
 */
public class Controlador3 {
    private View3 ventana3;
    private Modelo modelo;
    
    public Controlador3(Modelo modelo){
        this.modelo = modelo;
        this.ventana3 = new View3();
        
        this.ventana3.getGo1().setOnAction(new EventoGo1());
        this.ventana3.getGo2().setOnAction(new EventoGo2());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana3.mostrar(singleton.getStage());
    }
    
    class EventoGo1 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           
            Controlador1 c1 = new Controlador1(modelo);
            c1.mostrarVista();
        }
    }
    
    class EventoGo2 implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           
            Controlador2 c2 = new Controlador2(modelo);
            c2.mostrarVista();
        }
    }
}
