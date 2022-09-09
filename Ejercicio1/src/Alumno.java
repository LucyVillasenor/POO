
public class Alumno {
	//Atributos
	public String nombre;
	public int cal;
	
	//Constructor
	public Alumno(String nombre, int cal) {
		super();
		this.nombre = nombre;
		this.cal = cal;
	}
	
	//Metodo que calcula si el alumno esta reprobado o no
	public String nota() {
		String nota;
		if(cal <= 5) {
			nota = "Lo siento mucho estas reprobado :(, estudia más para la próxima";
		}else
			nota = "Felicidades estas aprobado";
		return nota;
	}
	
	//Los getters
	public String getNombre() {
		return nombre;
	}

	public int getCal() {
		return cal;
	}

}//class Alumno
