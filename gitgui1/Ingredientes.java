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
	
  private String nombre; 
  private float cantidad;
  private String unidad;
  
  Ingredientes(String cantidad,String nombre){
    this.nombre=nombre;
    this.cantidad=cantidad;
    
  }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    public void getUnidad(){
    	return unidad;
    }	
    public void setUnidad(String unidad){
    	this.unidad=unidad;
    }
    public String toString() {
		return cantidad + " " + unidad + " de " + nombre;
    }
    
    public static void main(String[] args) {
		Ingredientes ingrediente = new	Ingredientes(3, "Kg","de","tomates");
		System.out.println(ingrediente.toString());
		
	}
    
    }
    

