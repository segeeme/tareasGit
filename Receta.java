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
	ArrayList<String> preparacion = new ArrayList<String>();
	ArrayList<Ingredientes> Ingredientes = new ArrayList<Ingredientes>();
	private int personas = 4;
	private String autor;

	public Receta(String nombre) {
		this.nombre = nombre;
	}

	Receta(String nombre, ArrayList<Ingredientes> Ingredientes, ArrayList<String> preparacion) {

		this.nombre = nombre;
		this.Ingredientes = Ingredientes;
		this.preparacion = preparacion;

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

	public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
		this.Ingredientes = Ingredientes;
	}

	public ArrayList<String> getPreparacion() {
		return preparacion;
	}

	public void setPreparacion(ArrayList<String> preparacion) {
		this.preparacion = preparacion;
	}

	public void addIngrediente(Ingredientes ingredientes) {
		this.Ingredientes.add(ingredientes);
	}

	public void addPreparacion(String preparacion) {
		this.preparacion.add(preparacion);
	}

	public int getPersonas() {
		return personas;
	}

	public void setPersonas(int personas) {
		this.personas = personas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String listarIngredientes() {
		String lista = "";
		for (Ingredientes in : Ingredientes) {
			lista += in.toString() + "\n";
		}
		return lista;
	}

	public String listarPreparacion() {
		String lista = "";
		for (int i = 0; i < preparacion.size(); i++) {
			int pasar = i + 1;
			lista += "Pasar " + pasar + " : " + preparacion.get(i) + "\n";
		}
		return lista;
	}

	public String toString() {
		return "Receta: " + nombre.toUpperCase() + "\n\nIngredientes\n" + listarIngredientes() + "\nPreparacion\n"
				+ listarPreparacion();
	}

	public static void main(String[] args) {
		Ingredientes ingrediente1 = new Ingredientes(3, "kg", "tomates");
		Ingredientes ingrediente2 = new Ingredientes(3, "kg", "macarrones");
		Receta r = new Receta("macarrones");
		r.setNombre("macarrones con Tomate");
		r.addIngrediente(ingrediente1);
		r.addIngrediente(ingrediente2);
		r.addPreparacion("Cortar los Tomates");
		r.addPreparacion("Calentar los macarrones en olla");
		System.out.println(r.toString());
	}

	public Receta recetaPara(int personas) {
		Receta nueva = new Receta(this.getNombre());

		nueva.setAutor(this.getAutor());

		nueva.setPersonas(personas);

		nueva.setPreparacion(this.getPreparacion());

		ArrayList<Ingredientes> ingredientes = this.getIngredientes();

		double todo = personas / this.getPersonas();
		for (Ingredientes i : ingredientes) {
			i.setCantidad((float) (i.getCantidad() * todo));
		}
		nueva.setIngredientes(ingredientes);
		return nueva;
	}

}
