package U4.Tarea1.EJ9;

public class Jefe {
	
	//atributos
		String nombre;
		String dni;

	//constructor
	public Jefe (String nombre, String dni){
		this.nombre=nombre;
		this.dni=dni;
	}	
	
	//metodos
		public void mostrarInfo(){
			System.out.println(this.nombre+" "+this.dni);
			}
}
