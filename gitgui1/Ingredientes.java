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
public class Ingredientes {
   
  private String cantidad;
  private String nombre;
  
  Ingredientes(String cantidad,String nombre){
    this.nombre=nombre;
    this.cantidad=cantidad;
    
  }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
    
}
