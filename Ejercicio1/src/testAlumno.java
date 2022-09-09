import java.util.Scanner;
public class testAlumno {

	
	public static void main(String[] args) {
		//declaración del scanner
		Scanner sc = new Scanner(System.in);

		//se alamcena el nombre del alumno
		System.out.println("Ingrese el nombre del alumno: ");
		String nomAlumno = sc.nextLine();

		//se alamcena la calificación del alumno
		System.out.println("Ingrese la calificación del alumno: ");
		int cal = sc.nextInt();
		
		//se crea el alumno con la info pedida:
		Alumno alumno = new Alumno(nomAlumno,cal);
		
		//se imprimen los resultados:
		System.out.println("La calificacion del alumno: " + alumno.getNombre() + " es de: " + alumno.getCal());
		System.out.println(alumno.nota());
	}

}
