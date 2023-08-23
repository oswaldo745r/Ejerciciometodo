/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package d.ejerciciometodo;

/**
 *
 * @author leoda
 */
public class EjercicioMetodo {

    // Método 1: Sumar dos números enteros
    public int sumar(int num1, int num2) {
        return num1 + num2;
    }

    // Método 2: Restar dos números enteros
    public int restar(int num1, int num2) {
        return num1 - num2;
    }

    // Método 3: Multiplicar dos números enteros
    public int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    // Método 4: Dividir dos números enteros
    public double dividir(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("No se puede dividir por cero.");
            return Double.NaN; // NaN representa "No es un número"
        }
        return (double) num1 / num2;
    }

    // Método 5: Imprimir un mensaje
    public void imprimirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        EjercicioMetodo miObjeto = new EjercicioMetodo();

        int resultadoSuma = miObjeto.sumar(5, 3);
        System.out.println("Suma: " + resultadoSuma);

        int resultadoResta = miObjeto.restar(10, 4);
        System.out.println("Resta: " + resultadoResta);

        int resultadoMultiplicacion = miObjeto.multiplicar(6, 7);
        System.out.println("Multiplicación: " + resultadoMultiplicacion);

        double resultadoDivision = miObjeto.dividir(8, 2);
        System.out.println("División: " + resultadoDivision);

        miObjeto.imprimirMensaje("¡Hola, mundo!");
    }
}

