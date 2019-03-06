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
public class Controlador1 {
    private View1 ventana1;
    private Modelo modelo;

    public Controlador1(Modelo modelo) {
        this.modelo = modelo;
        this.ventana1 = new View1();
        
        //adicionar eventos
        
        this.ventana1.getAdd().setOnAction(new EventoBotonList());
        this.ventana1.getNameTF();
        this.ventana1.getAdressT();
        this.ventana1.getPhoneT();
    }
    
    public void mostrarVista(){
        Singleton singleton = Singleton.getSingleton();
        this.ventana1.mostrar(singleton.getStage());
    }
    
    
    //Clase interna - inner class
    class EventoBotonList implements EventHandler<ActionEvent>{

        @Override
        public void handle(ActionEvent t) {
           Controlador2 c2 = new Controlador2(modelo);
           c2.mostrarVista();
        }
        
    }

    public View1 getVentana1() {
        return ventana1;
    }
    
    
    
}
