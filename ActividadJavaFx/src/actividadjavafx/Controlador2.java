/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadjavafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

/**
 *
 * @author jcarrero
 */
public class Controlador2 {
    
private View2 ventana2;
    private Modelo modelo;

    public Controlador2(Modelo modelo) {
        this.modelo = modelo;
        this.ventana2 = new View2();
        
        //adicionar eventos
        
        this.ventana2.getNext().setOnAction(new EventoBotonNext());
        this.ventana2.setNameTF(new Controlador1(modelo).getVentana1().getNameTF());
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana2.mostrar(singleton.getStage());
    }
    
    //Clase interna - inner class
    class EventoBotonNext implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           Controlador3 c3 = new Controlador3(modelo);
           c3.mostrarVista();
        }
        
    }
    
    
    
}
