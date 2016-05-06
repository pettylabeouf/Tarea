import java.util.Scanner;


public class Main {

	public static void main(String[] args){
		Libro[] libros = new Libro[10];
		
		Libro libro1=new Libro(52.00f,10,"Harry Potter");
		int k=0;
		
		Scanner sc=new Scanner(System.in);
		while(k<10){
			System.out.println("Escribe el nombre del libro "+k+1+": " );
			String nombre=sc.nextLine();
			
			System.out.println("Escribe el precio: " );
			float precio=sc.nextFloat();
			
			System.out.println("Escribe la cantidad: " );
			int cantidad=sc.nextInt();
		
			sc.nextLine();
			Libro l=new Libro(precio, cantidad, nombre);
			libros[k]=l;
			
			k++;
			
			}
		k=0;
		while(k<10){
			System.out.println(libros[k].nombre);
			k++;
		}
		
	}
}
