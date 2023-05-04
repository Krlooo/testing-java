// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Coche mercedes = new Coche(5, "Rojo", 5);
        mercedes.escribi();
        mercedes.ruedas[0].pinchar();
        if(mercedes.esCoche()){
            System.out.println("Claaaaro");
        }
    }

}
