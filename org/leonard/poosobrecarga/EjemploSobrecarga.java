package org.leonard.poosobrecarga;

public class EjemploSobrecarga {

    public static void main(String[] args) {

        Calculadora cal = new Calculadora();

        System.out.println("sumar int : " + cal.sumar(10,5));
        System.out.println("sumar float : " + cal.sumar(10.0F,5F));
        System.out.println("sumar float-int : " + cal.sumar(10f,5));
        System.out.println("sumar int-float : " + cal.sumar(10.0,5.0F));
        System.out.println("sumar double : " + cal.sumar(10.0,5.0));
        System.out.println("sumar string : " + cal.sumar("10","5"));
        System.out.println("sumar tres int : " + cal.sumar(10,5, 3));

        System.out.println("sumar cuatro int : " + cal.sumar(10,5, 3, 6));
        System.out.println("sumar seis int : " + cal.sumar(10,5, 3, 6, 8, 9));
        System.out.println("sumar float + n int : " + cal.sumar(10.5F,5, 3, 6, 8, 9));
        System.out.println("sumar  cuatro double : " + cal.sumar(10.0, 5.0, 3.5, 4.5, 5.5));

        System.out.println("sumar long: " + cal.sumar(10L, 5L));
        System.out.println("sumar int: " + cal.sumar(10, '@'));
        System.out.println("sumar float-int: " + cal.sumar(10F, '@'));

    }
}
