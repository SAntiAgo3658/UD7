package teoriaUnidad;

public class Herencia {
   public static void main(String[] args) {
      // crear un objeto AAA.
      AAA aaa = new AAA();
   }
}

// creamos tres clases: A, AA, AAA, AA hereda de A, AAA hereda de AA.
// cada clase tiene un constructor sin parámetros y saca por pantalla el nombre de la clase.

class A {
   public A(int numero){
      System.out.println("A: "+ numero);
   }
   public A(){
      System.out.println("A: ");
   }
}

class AA extends A  {
   public AA() {
      super(56);
      System.out.println("AA");
   }
}

class AAA extends AA {
   public AAA(){
      System.out.println("AAA");
   }
}


