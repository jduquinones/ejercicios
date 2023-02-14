package com.ejercicios;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenamientoCardinalidad {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(5);
        number.add(31);
        number.add(15);
        number.add(7);
        number.add(3);
        number.add(2);
        cardinalitySort(number);
    }

    public static List<Integer> cardinalitySort(List<Integer> nums) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            Integer sortINt = Integer.valueOf(Integer.toBinaryString(nums.get(i)));
            result.add(sortINt);
        }
        Collections.sort(result);
        List<Integer> dato = new ArrayList<>();
        for (Integer binary :result) {
            int datos = Integer.parseInt(String.valueOf(binary), 2);
            dato.add(datos);
        }
        System.out.println(dato);
        return result;
    }



}

