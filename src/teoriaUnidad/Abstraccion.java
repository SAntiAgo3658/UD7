package teoriaUnidad;

import java.beans.PropertyEditorManager;

public class Abstraccion {

    abstract class Primera {

        private String nombre;
        private int num;

        public Primera() {

        }

        public String getNombre() {
            return nombre;

        }

        public void setNombre(String nombre) {
            this.nombre = nombre;

        }

        public int getNum() {
            return num;

        }

        public void setNum(int num) {
            this.num = num;

        }

        public abstract void incrementaUno();

        public void incrementa(int num) {
            this.num = this.num + num;

        }

    }

    class Segunda extends Primera {
        public void incrementaUno() {
            setNum(getNum() + 1);

        }

    }

}

// creamos una clase abstracta llamada primera.
// atributos dos: nombre:String, numero:int
// constructor sin atributos.
// getter y setters
// un metodo abstracto: incrementaUno q no devuelve nada (incrementa numero en
// uno);
// un metodo normal: incrementa q toma como parámetro un int e incrementa número
// con el parametro

// una clase normal llamada segunda que hereda de primera.
