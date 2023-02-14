package com.ejercicios;

import java.util.*;

public class Heisonh {
    public static void main(String[] args) {
        Ejercicio1();
        Ejercicio2();
        Ejercicio3();
        Ejercicio4();
    }

    /*Escriba una función que recibe 2 parámetros:
    - Un array de valores enteros entre 0 y 1 de cualquier tamaño
    - Un valor entero indicando el número de permutaciones a ejecutar
    El resultado de la función es un ArrayList de enteros que contiene el resultado del
    algoritmo.
    Por cada permutación se debe revisar cada elemento del array, si cada uno de sus valores
    adyacentes, es decir el digito anterior y el digito posterior son iguales (ambos 0, o ambos
    1) el valor del dígito que se está revisando se convierte en 0, en caso contrario se
    convierte en 1. Dado que el primer elemento del array no tiene un elemento anterior y
    el último elemento del array no tiene un elemento posterior, se asume siempre que el
    elemento faltante es 0.
    Ejemplo 1:
    array de enteros: [1,0,1,0,0,0,1,1]
    número de permutaciones: 1
    Resultado: [0,0,0,1,0,1,1,1]
    Ejemplo 2:
    array de enteros: [1,0,1,0,0,0,1,1]
    número de permutaciones: 2
    Resultado: [0,0,1,0,0,1,0,1]
  */

    public static ArrayList<Integer> Ejercicio1(){
        int[] array = {1,0,1,0,0,0,1,1};
        int numero = 1;

        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = 0; i < numero; i++) {
            int[] copia = new int[array.length];
            for (int j = 0; j < array.length; j++) {
                int numeroAnterior = j - 1 >= 0 ? array[j - 1] : 0;
                int numeroPosterior = j + 1 < array.length ? array[j + 1] : 0;

                if (numeroAnterior == numeroPosterior) {
                    copia[j] = 0;
                } else {
                    copia[j] = 1;
                }
            }
            array = copia;
        }
        for (int value : array){
            resultado.add(value);
        }
        System.out.println(resultado);
        return resultado;
    }

    /*Escriba una f u n c i ó n en JAVA que en 10 o menos sentencias compare tres
    números: numero1, numero2 y numero3 y que imprima el mayor de ellos. Ejemplo
    de tres sentencias son: (if( ){, else{, System.out.print), las llaves de cierre “}” no
    cuentan como sentencias y no se acepta más de una sentencia por línea.
    */
    public static void Ejercicio2() {
       int a = 2;
       int b = 1;
       int c = 3;

       List<Integer> resultado = new ArrayList<>();

      if (a<b){
          if (a<c){
              resultado.add(a);
              if (b<c){
                  resultado.add(b);
                  resultado.add(c);
              }else {
                  resultado.add(c);
                  resultado.add(b);
              }

          }else {
              resultado.add(c);
              resultado.add(a);
              resultado.add(b);

          }
      } else if (a<c) {
          if (b<c){
              resultado.add(b);
              resultado.add(a);
              resultado.add(c);
          }else {
              resultado.add(b);
              resultado.add(c);
              resultado.add(a);
          }
      }else if (c<b){
          resultado.add(c);
          resultado.add(b);
          resultado.add(a);
      }else {
          resultado.add(b);
          resultado.add(c);
          resultado.add(a);      }
        System.out.println(resultado);
    }


    /* Se tiene un Vector con números enteros en cualquier orden, se requiere que elabore
    una función en java que imprima de menor a mayor los números pares y posterior a
    esto imprima de menor a mayor los números impares.
    Ejemplo:
    V1 = {15,7,2,1,5,9,8,7,24,50}
    Resultado: 2,8,24,50,1,5,7,7,9,15
    */
    public static void Ejercicio3(){
        int[] v1 = {15,7,2,1,5,9,8,7,24,50};
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();
        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < v1.length; i++) {
            if (v1[i] % 2 == 0){
                par.add(v1[i]);
                Collections.sort(par);
            }else if (v1[i] % 2 == 1) {
                impar.add(v1[i]);
                Collections.sort(impar);
            }
        }
        resultado.addAll(par);
        resultado.addAll(impar);

        System.out.println(resultado);
    }

    /**
     * Escriba el código que permita extraer de la variable “nombreEmpresa” las letras “soh”
     * sabiendo que esta variable tiene asignada como valor la palabra “Heinsohn”, y compare
     * la igualdad de lo extraído con el valor “soh”, para verificar que el resultado fue exitoso.
     */
    public static void Ejercicio4(){
        String nombreEmpresa = "Heinsohn";
        String comparar = "soh";
        String extraer = nombreEmpresa.replaceAll("[Heinn]", "");

        if (comparar.equals(extraer)){
            System.out.println("Las letras extraidas fueron: " + extraer);
        }
    }
}
