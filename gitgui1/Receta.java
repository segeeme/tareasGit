/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitgui1;

/**
 *
 * @author alumnociclo
 */
public class Receta {
    
   private String nombre;
   private String ingredientes;
   private String preparacion;
   
   Receta(){
       
   }
    
    Receta(String nombre,String ingredientes,String preparacion){
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

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
    
    
    
    
}
