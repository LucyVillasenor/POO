import java.util.HashMap;
import java.util.Scanner;
public class Agenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//HashMap
	    HashMap<String, Integer> agenda = new HashMap<String, Integer>();
	    //metodo put para agregar informacion
	    //calificaciones1.put("Felipe", 5);
	    //calificaciones1.put("Jaciel", 10);
	    //calificaciones1.put("Edwin", 10);
	    //calificaciones1.put("Gabriel", 9);
	    //calificaciones1.put("Fernando1", 9);
	    //calificaciones1.put("Fernando2", 7);
	    //calificaciones1.put("Fernando3", 0);
	    //System.out.println(calificaciones1);
	    //for(String recorrido: calificaciones1.keySet()) {
	    	//System.out.println(recorrido);
	    //}
		
		
	   boolean salir = false;
       int opcion,tel; 
       String nombre, busqueda;
       
       while(salir){
    	   //imprimimos el menú:
           System.out.println("1. Añadir contacto");
           System.out.println("2. Lista de contactos");
           System.out.println("3. Buscar contato");
           System.out.println("4. Editar contacto");
           System.out.println("5. Cerrar Agenda");
            
           System.out.println("Escribe una de las opciones");
           opcion = sc.nextInt(); //Guardaremos la opcion del usuario
            
           switch(opcion){
               case 1:
                   System.out.println("1. Añadir contacto: ");
                   System.out.println("Ingresa el nombre del contacto: ");
                   nombre = sc.nextLine();
                   System.out.println("Ingresa el telefono del contacto:  ");
                   sc.nextLine();
                   tel = sc.nextInt();
                   agenda.put(nombre, tel);
                   System.out.println("Contacto agregado (: ");
                   break;
               case 2:
                   System.out.println("2. Lista de contactos: ");
                   for(String recorrido: agenda.keySet()) {
           	    	System.out.println(recorrido);
           	    	}
          
                   break;
                case 3:
                	System.out.println("3. Buscar contato:  ");
                    System.out.println("Ingresa el nombre del contacto: ");
                   break;
                case 4:
                    System.out.println("4. Editar contacto");
                    break;
                case 5:
                   salir=false;
                   break;
                default:
                   System.out.println("Ingresa números entre 1 y 5");
           }
            
       }
		
		
	}//main
}//Agenda
