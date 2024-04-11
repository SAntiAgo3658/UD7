package composicion;

import java.util.ArrayList;
import java.util.List;

public class Composicion {

    class Hotel {

        private List<Habitacion> misHabitaciones = new ArrayList<Habitacion>();
        private Recepcion miRecepcion;

        public Hotel() {

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

        class Habitacion {

            private int ancho;
            private int largo;

            public Habitacion() {

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

    }

    class Recepcion {

        private int ancho;
        private int largo;

        public Recepcion() {

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

}
