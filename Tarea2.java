

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


	public class Tarea2 {
		public static void main(String[] args) throws Exception {
			String borrar="";
			String libro="";
			String opcion="";
			String Arreglo[];
			Arreglo= new  String[100];
			int i=0;
			Scanner sc=new Scanner(System.in);
			//File archivo=new File("Libro2.txt");
			//FileWriter escribir=new FileWriter(archivo);
			//FileReader lector=new FileReader("Libro2.txt");
			// BufferedReader contenido=new BufferedReader(lector);
			 //String texto = contenido.readLine();
			 String libronuevo="";
			System.out.println("Escribe el numero de lo que desees hacer:");
			System.out.println("1.-A–adir un libro");
			System.out.println("2.-Listar los libros");
			System.out.println("3.-Borrar un libro");
			System.out.println("4.-Salir");
			boolean salir=false;
			opcion=sc.nextLine();
			
			while (salir==false){
			//System.out.println("tu eleccion fue "+ opcion);
			if(opcion.equals("1")){
				System.out.println("Escribe el nombre de tu libro");
				libro=sc.nextLine();
				//System.out.println("posicion por asignar: " + i+ " con contenido: " + libro);
				Arreglo[i]=libro;
				
				String arreglito="";
				try{
					
					//write es un metodo
						
					 saveArray(Arreglo,"Libro2.txt");
					
				 }
				 
				 catch(Exception e) {
					 System.out.println("Error al escribir:Excepcion E");
	
				 }	
				i++;
			}
			//System.out.println("Escribe el numero de lo que desees hacer:");
			String texto="";
				
			 if(opcion.equals("2")){
				 try{
						
					 FileReader lector=new FileReader("Libro2.txt");

					 BufferedReader contenido=new BufferedReader(lector);
					 
					 i=0;
					 while((texto=contenido.readLine())!=null){ 
						 boolean vacios=true;
						 
						 Arreglo[i]=texto;
						 
						 System.out.println((i+1) + ".-" + texto);
						 i++;
						 
						 int k=1;
						 for(int j=0; j<100; j++){
							 if(!(Arreglo[j]==null)){
								// System.out.println(k+".-"+Arreglo[j]);
								 k++;
								// System.out.println(vacios);
								// System.out.println("imprime el texto");
							 }
						 }
						 for(int j=0; j<100; j++){
							 if(!(Arreglo[j]==null)){
								 vacios=false;
								 //System.out.println(vacios);
							 }
							 else{
								 vacios=true;
							 }
						 }
						 if(vacios==true) {
							 //System.out.println("No tienes ningun libro guardado");
						 }
					 }
					 
				 }
				 catch(Exception a) {
					 System.out.println("Error al leer");
				 }
				
				 
				 
			 }
				if(opcion.equals("3")){
					System.out.println("Escribe la posici—n del libro que quieras borrar");
					borrar=sc.nextLine();
					int nb=0;
					
					boolean fallaConversion=false;
					try{
						nb=(Integer.parseInt(borrar));
					}
					catch(NumberFormatException nfe){
						fallaConversion=true;
					}
					nb=nb-1;
					Arreglo[nb]=null;
					
					saveArray(Arreglo, "Libro2.txt");
				}
				if(opcion.equals("4")){
					salir=true;
				}	 
				
				if((opcion.equals("1") )| (opcion.equals("2") )|(opcion.equals("3") )){
					System.out.println("Escribe el numero de lo que desees hacer:");
					opcion=sc.nextLine();
				}	
				if(!(opcion.equals("1") ) & !(opcion.equals("2") )& !(opcion.equals("3") ) & !(opcion.equals("4") )){
					System.out.println("Por favor escribe una opci—n valida (del 1-4)");
					opcion=sc.nextLine();
				}
			}
		// escribir.close();
		}

		private static void saveArray(String[] arreglo, String filename) throws IOException {
			// TODO Auto-generated method stub
			String arreglito="";
			for(int j=0; j<arreglo.length; j++){
				 
				 if(!(arreglo[j]==null)){
					 arreglito=arreglito + arreglo[j] + "\n";
				 }
			 } 
			 File archivo=new File(filename);
			 FileWriter escribir=new FileWriter(archivo);
			 escribir.write(arreglito);

			 escribir.close();
			
		}
		

}
