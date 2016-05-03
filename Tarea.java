

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


	public class Tarea {
		public static void main(String[] args) throws Exception {
		String borrar="";
		String libro="";
		String opcion="";
		
		int i=1;
		Scanner sc=new Scanner(System.in);

		 File archivo=new File("Libro2.txt");
		 FileWriter escribir=new FileWriter(archivo);
		//FileReader lector=new FileReader("Libro2.txt");
		// BufferedReader contenido=new BufferedReader(lector);
		 //String texto = contenido.readLine();
		 String libronuevo="";
		System.out.println("Escribe el numero de lo que desees hacer:");
		System.out.println("1.-A–adir un libro");
		System.out.println("2.-Listar los libros");
		System.out.println("3.-Borrar un libro");
		System.out.println("4.-Salir");
		while (!(opcion=="4")){
	
		opcion=sc.nextLine();	
		//System.out.println("tu eleccion fue "+ opcion);
		
		if(opcion.equals("1")){
			System.out.println("Escribe el nombre de tu libro");
			
			
			libro=sc.nextLine();
			libro=i+".-  "+libro;
			i++;
			
			 try{
				libronuevo=(libronuevo+"\n"+libro);
				// System.out.println("libro nuevo "+ libronuevo);
				 if(i==2) {
					 escribir.write(libronuevo);
					 //System.out.println("entra al texto==null");
					// texto=contenido.readLine();
					// System.out.println(libro);
					 //System.out.println(texto);
				 }
				 if(!(i==2)){
					 //texto = (contenido.readLine()+texto);
					 //System.out.println("entra al else");
					 escribir.write(libronuevo);
					 //System.out.println(texto);
				 }
				//System.out.println(texto+" "+ libro);
			
			
			 }
			 
			 catch(Exception e)
			 {
			 System.out.println("Error al escribir");

			 }	
		}
		System.out.println("Escribe el numero de lo que desees hacer:");

		
		//System.out.println(texto+" texto y libro "+ libro);
		String texto="";
			
			 if(opcion.equals("2")){
				 try{
						
					 FileReader lector=new FileReader("Libro2.txt");

					 BufferedReader contenido=new BufferedReader(lector);

					 while((texto=contenido.readLine())!=null){ 
						 
								 System.out.println(texto);
								 System.out.println("imprime el texto");
					 }
					 
					 
					 }
					 catch(Exception a)
					 {
					 System.out.println("Error al leer");
					 }
				 
					System.out.println("Lista de libros");
					 if(!(libronuevo==null)) {
					 System.out.println(libronuevo);
					  }
					 if(libronuevo==null) {
						 System.out.println("No tienes ningun libro guardado");
					 }
				}
				if(opcion.equals("3")){
					System.out.println("Escribe la posici—n del libro que quieras borrar");
					borrar=sc.nextLine();
				}
				if(opcion.equals("4")){
					
				}	 
		 
		}
		 escribir.close();
		}
		

}
