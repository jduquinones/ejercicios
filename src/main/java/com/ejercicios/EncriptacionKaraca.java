package com.ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/*
 * Enunciado: Crea una función que sea capaz de encriptar y desencriptar texto
 * utilizando el algoritmo de encriptación de Karaca
 * (debes buscar información sobre él).
 */
public class EncriptacionKaraca {
    public static void main(String[] args) {
        Encription();
        Desencription();
    }

    public static void Encription(){
        try {
            System.out.println("Ingrese el texto a encriptar:  ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] texto =reader.readLine().split("");

            Map<String, String> charReplace = new HashMap();
            charReplace.put("a","0");
            charReplace.put("e","1");
            charReplace.put("i","2");
            charReplace.put("o","3");
            charReplace.put("u","4");

            String construirTexto;
            String resultado = "";

            for (int i = 0; i < texto.length; i++) {
                switch (texto[i]){
                    case "a" : construirTexto = "0"; break;
                    case "e" : construirTexto = "1"; break;
                    case "i" : construirTexto = "2"; break;
                    case "o" : construirTexto = "3"; break;
                    case "u" : construirTexto = "4"; break;
                    default: construirTexto = texto[i];
                }
               resultado += construirTexto;
            }
            System.out.println(resultado);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void Desencription(){
        try {
            System.out.println("Ingrese el texto a desencriptar:  ");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] texto =reader.readLine().split("");

            Map<String, String> charReplace = new HashMap();
            charReplace.put("0","a");
            charReplace.put("1","e");
            charReplace.put("2","i");
            charReplace.put("3","o");
            charReplace.put("4","u");

            String construirTexto;
            String resultado = "";

            for (int i = 0; i < texto.length; i++) {
                switch (texto[i]){
                    case "0" : construirTexto = "a"; break;
                    case "1" : construirTexto = "e"; break;
                    case "2" : construirTexto = "i"; break;
                    case "3" : construirTexto = "o"; break;
                    case "4" : construirTexto = "u"; break;
                    default: construirTexto = texto[i];
                }
                resultado += construirTexto;
            }
            System.out.println(resultado);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
