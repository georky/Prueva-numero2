
public class Metodos {
int num1;
int num2;

    public Metodos(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }


    public void suma ()
    {
        int total = num1+num2;
        System.out.println("la suma es de dos numeros"+total);
    }
     public void Resta ()
    {
        int total = num1-num2;
        System.out.println("la Resta "+total);
    }
      public void Multiplicacion ()
    {
        int total = num1*num2;
        System.out.println("la Multiplicacion "+total);
    }

}
