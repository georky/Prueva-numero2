/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Georky
 */
public class Llamadas {
    int numer1;
    int num2;

    public Llamadas(int numer1, int num2) {
        this.numer1 = numer1;
        this.num2 = num2;
    }
    public void presentar1()
    {
        System.out.println("EL numero 1 es"+numer1);
    }
     public void presentar2()
    {
        System.out.println("EL numero 2 es"+num2);
    }
}
