/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiztraza;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

/**
 *
 * @author lamorenoca
 */
public class ManejoInformacion {
    private String ruta;
    
    public boolean guardar() throws IOException{
        
     File archivo=new File(this.ruta);
        if(!archivo.exists())
            archivo.createNewFile();//le coloca como nombre la ruta de esta clase (this.ruta)
        PrintStream salida=new PrintStream(archivo);
    
    
        salida.flush(); //Hace que la informacion se quede en el archivo
        salida.close();
        return true;
    }
}
