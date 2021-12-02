package org.leonard.poosobrecarga;
import static org.leonard.poosobrecarga.Calculadora2.*; // se importa todos los metodos de la calculadora
public class EjemploSobrecarga2 {
    public static void main(String[] args) {

        // solo quedan con "sumar" porque se esta importando los mmetodos
        System.out.println("sumar int : " + sumar(10,5));
        System.out.println("sumar float : " + sumar(10.0F,5F));
        System.out.println("sumar float-int : " + sumar(10f,5));
        System.out.println("sumar int-float : " + sumar(10.0,5.0F));
        System.out.println("sumar double : " + sumar(10.0,5.0));
        System.out.println("sumar string : " + sumar("10","5"));
        System.out.println("sumar tres int : " + sumar(10,5, 3));

        System.out.println("sumar cuatro int : " + sumar(10,5, 3, 6));
        System.out.println("sumar seis int : " + sumar(10,5, 3, 6, 8, 9));
        System.out.println("sumar float + n int : " + sumar(10.5F,5, 3, 6, 8, 9));
        System.out.println("sumar  cuatro double : " + sumar(10.0, 5.0, 3.5, 4.5, 5.5));

        System.out.println("sumar long: " + sumar(10L, 5L));
        System.out.println("sumar int: " + sumar(10, '@'));
        System.out.println("sumar float-int: " + sumar(10F, '@'));

    }
}
