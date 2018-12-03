
public class Main {
    public static void main(String[] args) {
        Metodos met = new Metodos(10, 800);
        Llamadas metr = new Llamadas(1, 2);
        met.suma();
        met.Resta();
        met.Multiplicacion();
        metr.presentar1();
        metr.presentar2();
    }
}
