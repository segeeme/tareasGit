/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitgui1;

import java.util.ArrayList;

/**
 *
 * @author alumnociclo
 */
public class Receta {
    
   private String nombre;
   private String ingredientes;
   ArrayList<String> preparacion = new ArrayList<String>();
   
   Receta(){
       
   }
    
    Receta(String nombre,String ingredientes,ArrayList<String> preparacion){
      this.nombre=nombre;
      this.ingredientes=ingredientes;
      this.preparacion=preparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public ArrayList<String> getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(ArrayList<String> preparacion) {
        this.preparacion = preparacion;
    }
    
    
    
    
}
