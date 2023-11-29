
public class Persona {
	public String nombre = "";
	public String apellidos = "";
	public int edad;
	
	public Persona(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}
	
	public void cumpleanyos() {
		this.edad = edad +1;
		System.out.println(this.edad);
	}

}
