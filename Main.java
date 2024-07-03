package task02;

public class Main {
    public static void main(String[] args) {

    try {
        Person person = new Person("Vasilsddasdsaddasdasdssdadasdsadasdasdasdsadasdsadasdsadsadsadsadase", 55);
        System.out.println("Persoana a fost creeata cu succes");
    } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage()); // e folosit sa aruncam o eroare pe fluxul de erori standard (System.err)
    }
    try {
      int data = Calculator.factorial(-10);
        System.out.println(data);
    }catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }
    try{
      int data =  Calculator.binominalCoefficient(9,10);
        System.out.println(data);
    }catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
    }

    }

}
