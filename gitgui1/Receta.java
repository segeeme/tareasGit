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
   ArrayList<Ingredientes> Ingredientes = new ArrayList<Ingredientes>();
   private String preparacion;
   
   Receta(){
       
   }
    
    Receta(String nombre,ArrayList<Ingredientes>Ingredientes,String preparacion){
      this.nombre=nombre;
      this.Ingredientes=Ingredientes;
      this.preparacion=preparacion;
      
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return Ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.Ingredientes = Ingredientes;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
    
    
    
    
}
