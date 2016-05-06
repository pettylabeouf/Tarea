//el constructor es un metodo que se llama igual que la clase 
// solo se pone public y el nombre 

public class Libro {
	public float precio;
	public int cantidad;
	public String nombre;
	
	public Libro(float precio, int cantidad, String nombre){
		this.precio=precio;
		this.cantidad=cantidad;
		this.nombre=nombre;
	}

	public String toString(){
		return "Nombre del libro: "+this.nombre + "	" + "Cantidad: " + this.cantidad + "  Precio: "+ this.precio ;
	}
	
}
