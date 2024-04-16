package composicion;

import java.util.ArrayList;
import java.util.List;

import composicion.Hotel.Habitacion;

public class Composicion {

    public static void main(String[] args) {

        Hotel miHotel = new Hotel();

        // Recepcion mRecepcion = new Recepcion();

        // Habitacion mHabitacion = new Habitacion();

        for (int i = 0; i < 5; i++) {

            miHotel.anadirHabitacion();
            miHotel.getMisHabitaciones().get(i).setAncho(3);
            miHotel.getMisHabitaciones().get(i).setLargo(4);

        }

    }

}

class Hotel {

    private List<Habitacion> misHabitaciones = new ArrayList<Habitacion>();
    private Recepcion miRecepcion;

    public Hotel() {
        this.misHabitaciones = new ArrayList<>();
        this.miRecepcion = new Recepcion();

    }

    public List<Habitacion> getMisHabitaciones() {
        return misHabitaciones;

    }

    public void setMiHabitaciones(List<Habitacion> misHabitaciones) {
        this.misHabitaciones = misHabitaciones;

    }

    public Recepcion getMiRecepcion() {
        return miRecepcion;

    }

    public void setMiRecepcion(Recepcion miRecepcion) {
        this.miRecepcion = miRecepcion;

    }

    public void anadirHabitacion() {

        misHabitaciones.add(new Habitacion());

    }

    class Habitacion extends Estancia {

        private boolean cuartoBano;

        public Habitacion() {
            super();
            this.cuartoBano = false;

        }

        public boolean isCuartoBano() {
            return cuartoBano;

        }

        public void setCuartoBano(boolean cuartoBano) {
            this.cuartoBano = cuartoBano;

        }

        @Override
        public void setAncho(int ancho) { 
            super.setAncho(ancho + 1);
            
        }

    }

}

class Recepcion extends Estancia {

    private int altura;

    public Recepcion() {
        super();
        this.altura = 0;

    }

    public int getAltura() {
        return altura;

    }

    public void setAltura(int altura) {
        this.altura = altura;

    }

    public void entrada() {
        System.out.println("Bienvenido al hotel");

    }

    public void entrada(String idioma) {

        if (idioma == "Inglés") {
            System.out.println("Hello, Welcome to the Hotel");

        }

    }

}

class Estancia {

    private int ancho;
    private int largo;

    public Estancia() {
        this.ancho = 0;
        this.largo = 0;

    }

    public int getAncho() {
        return ancho;

    }

    public void setAncho(int ancho) {
        this.ancho = ancho;

    }

    public int getLargo() {
        return largo;

    }

    public void setLargo(int largo) {
        this.largo = largo;

    }

}
