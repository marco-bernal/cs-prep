package com.mab.mocks.mxbe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Combination SUm
 * Given an array and a target, find getUsers the combinations that sum the target
 * example:
 * input[10,1,2,6,7,1,5], target 8
 * result:
 * [1,7]
 * [1,2,5]
 * [2,6]
 * [1,1,6]
 */
//TODO: Refactor to a class and unit tests. No main classes
public class Main {

    public static void main(String[] args) {

        List<String> transactions = List.of("John,Doe,john@doe.com,200,TR0001");

        String e = transactions.get(0);

        System.out.println(e);

//
    }

//    static List<Integer[]> combinationSum(Integer[] a, int target) {
//        List<Integer[]> result = new ArrayList<>();
//
//        List<Integer> filtered = new ArrayList<>();
//        //filtering greater values
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < target) {
//                filtered.add(a[i]);
//            }
//        }
//        Collections.sort(filtered);
//        for (int i = a.length; i >= 0; i--) {
//            //int max = a[a.length - 1];
//
//        }
//
//        // Obtener el valor mas grande
//        // Obtener el siguiente valor mas grande
//        // dentro del ciclo verifica los siguientes pasos:
//        // Comparar si la suma de los dos valores es mayor al target
//        // en caso afirmativo no se agrega el valor y se busca el siguiente numero mas grande
//        // en caso de qwue sea menor se agrega al arreglo, hasta que sea igual al taget
//        //cuando el target y la suma de los valores del arreglo son iguales se crea un nuevo arreglo
//        //se agregan los arreglos a la lista de resultados
//        //se retorna la lista
//
//        return result;
//
//    }
}
