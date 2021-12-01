package org.leonard.poosobrecarga;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

//    public long sumar(long a, long b){
//        return a + b;
//    }

    public int sumar(int... argumentos){ // una sobrecarga pero con tipos variables
        int total = 0;
        for(int i: argumentos){
            total += i;
        }
        return total;
    }

    public float sumar(float a, int... argumentos){ // una sobrecarga pero con tipos variables
        float total = a;
        for(int i: argumentos){
            total += i;
        }
        return total;
    }

    public double sumar(double... varargs){ // una sobrecarga pero con tipos variables
        double total = 0.0;
        for(double d: varargs){
            total += d;
        }
        return total;
    }

    public float sumar(float x, float y) {
        return x + y;
    }

    public float sumar(int i, float j) {
        return i + j;
    }

    public float sumar(float i, int j) {
        return i + j;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(String a, String b) {
        int resultado;
        try {
            resultado = Integer.parseInt(a) + Integer.parseInt(b); // convierte el string en entero
        } catch (NumberFormatException e) {  // si pudiera fallar el resultado seria 0
            resultado = 0;  // en caso de error asignamos un cero
        }
        return resultado;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
}
