
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
	//abrir un programa y que a–ada un libro 

	//cerrar el programa 
	//listar libros y que aparezca el libro que a–adiste 

	//que se puedan borrar los libros 

	//que pueda listar libros y a–adirlos 


	public class Problemalibros {
		
		public static void main(String[] args) throws Exception {
		String borrar="";
		String libro="";
		String opcion="";
		String borrar2="";
		int i=1;
		Scanner sc=new Scanner(System.in);
Libro[] libros = new Libro[10];
		
		//Libro libro1=new Libro(52.00f,10,"Harry Potter");
		int k=0;
		String kl="";
		
		Scanner sc1=new Scanner(System.in);

			

		 File archivo=new File("Libro2.txt");
		 FileWriter escribir=new FileWriter(archivo);
		//FileReader lector=new FileReader("Libro2.txt");
		// BufferedReader contenido=new BufferedReader(lector);
		 //String texto = contenido.readLine();
		 String libronuevo="";
		System.out.println("Escribe el numero de lo que desees hacer:");
		System.out.println("1.-A–adir un libro");
		System.out.println("2.-Listar los libros");
		System.out.println("3.-Realizar una venta");
		System.out.println("4.-Salir");
		while (!(opcion=="4")){
	
		opcion=sc1.nextLine();	
		//System.out.println("tu eleccion fue "+ opcion);
		
		if(opcion.equals("1")){
			
			System.out.println("Escribe el nombre del libro "+k+1+": " );
			String nombre=sc1.nextLine();
			
			System.out.println("Escribe el precio: " );
			float precio=sc1.nextFloat();
			
			System.out.println("Escribe la cantidad: " );
			int cantidad=sc1.nextInt();
		
			sc1.nextLine();
			Libro l=new Libro(precio, cantidad, nombre);
			libros[k]=l;
			
			k++;
			
		}
		System.out.println("Escribe el numero de lo que desees hacer:");

		
		//System.out.println(texto+" texto y libro "+ libro);
		String texto="";
			
			 if(opcion.equals("2")){
				 
					 while(k<10){
							System.out.println(libros[k].nombre);
							k++;
						}
				}
			 
				if(opcion.equals("3")){
					System.out.println("Escribe la posicion del libro");
					borrar=sc1.nextLine();
					System.out.println("Escribe cuantos ejemplares se vendieron");
					borrar2=sc1.nextLine();
					
				}
				if(opcion.equals("4")){
					
				}	 
		 
		}
		 escribir.close();
		}
		

}
