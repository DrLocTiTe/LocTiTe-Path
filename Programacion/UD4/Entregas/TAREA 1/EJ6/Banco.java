package U4.Tarea1.EJ6;

public class Banco {

    //Atributos:
    private String nombre;
    private double capital;
    private String direccionCentral;

    //Contructor:
    public Banco(String nombre, String direccionCentral) {
        this.capital = 5200000  ;
        this.nombre = nombre;
        this.direccionCentral = direccionCentral;
    }

    //Metodos:
    public double modificarCapital(double nuevoCapital) {
        capital = nuevoCapital;
        return capital;
    }

    public String modificarDireccion(String nuevaDireccion) {
        direccionCentral = nuevaDireccion;
        return "Nueva dirección: " + direccionCentral;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre del banco: " + nombre
                + "\n"
                + "Capital: " + capital
                + "\n"
                + "Dirección central: " + direccionCentral);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }



}
