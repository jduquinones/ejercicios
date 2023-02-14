package com.ejercicios;

import org.json.JSONArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Enunciado: Crea una función que sea capaz de detectar y retornar todos los
 * handles de un texto usando solamente Expresiones Regulares.
 * Debes crear una expresión regular para cada caso:
 * - Handle usuario: Los que comienzan por "@"
 * - Handle hashtag: Los que comienzan por "#"
 * - Handle web: Los que comienzan por "www.", "http://", "https://"
 *   y finalizan con un dominio (.com, .es...)
 */
public class DetectorHandle {
    public static void main(String[] args) throws IOException {
        handle();
    }

    public  static void handle() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String scanner = br.readLine();

        String web = "http?://[a-zA-Z0-9./]+|https?://[a-zA-Z0-9./]+|www?.[a-zA-Z0-9./]+|[@#][a-zA-Z0-9./]+|([a-zA-Z0-9]+\\.[a-zA-Z]+)";
        Pattern patternWeb = Pattern.compile(web);
        Matcher matcherWeb = patternWeb.matcher(scanner);
        JSONArray jsonObjectWeb = new JSONArray();
        for (int i = 0; i < scanner.length(); i++) {
            if (matcherWeb.find()){
                jsonObjectWeb.put(matcherWeb.group());
            }
        }
        System.out.println("Handles WEB" + jsonObjectWeb);
    }
}
