package U5.Tarea1.Ej4;

import U5.Tarea1.Ej1.Hora;

public class HoraExacta extends Hora {
    protected int segundos;

    // Constructor
    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos=segundos;
    }
    //Metodos
    public void setSegundos(int segundos) {
        if (segundos>=0 && segundos<60) {
            this.segundos=segundos;
        }

    }

    @Override
    public boolean equals(Object o) {
        HoraExacta horaComprobar = (HoraExacta) o;
        boolean igual;
        if (this.hora==horaComprobar.hora && this.minuto==horaComprobar.minuto && this.segundos==horaComprobar.segundos) {
            igual=true;
        } else {
            igual=false;
        }
        return igual;
    }

    @Override
    public void inc() {
        segundos+=1;
    }

    @Override
    public String toString() {
        return (super.toString() + ":" + segundos);
    }
}
