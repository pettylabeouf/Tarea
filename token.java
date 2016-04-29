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


public class token {
	public static void main(String[] args) throws Exception {
	String oracion="";
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Escribe una oracion");
	oracion=sc.nextLine();		

	StringTokenizer tokens=new StringTokenizer(oracion);

	// while(tokens.hasMoreTokens()) {
		 //	String nombre = tokens.nextToken();

		  // String apellido = tokens.nextToken();

		  // System.out.println(tokens.nextToken(nombre+" "+apellido));

	// }
	 
	 File archivo=new File("oracion2.txt");
	 FileWriter escribir=new FileWriter(archivo);
	 try{
	//write es un metodo
		 escribir.write(oracion);

		 escribir.close();
	
	 }
	 
	 //Si existe un problema al escribir cae aqui
	 catch(Exception e)
	 {
	 System.out.println("Error al escribir");
	 
	 
	 }
	 String texto="";

	 try{
	
	 FileReader lector=new FileReader("oracion2.txt");

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
		
	 System.out.println(texto);
	 System.out.println("imprime el texto 2");
	}
	
	}
