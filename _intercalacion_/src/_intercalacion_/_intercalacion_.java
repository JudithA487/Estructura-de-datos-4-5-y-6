/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _intercalacion_;

import java.util.Arrays;

/**
 *
 * @author judith acosta alvarez
 * 23550398
 * estructura de datos
 */
public class _intercalacion_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Dos arreglos ordenados
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};

        // Intercalar ambos arreglos
        int[] resultado = intercalar(arr1, arr2);

        // Mostrar el resultado
        System.out.println("Arreglo intercalado: " + Arrays.toString(resultado));
    }

    public static int[] intercalar(int[] arr1, int[] arr2) {
        int n1 = arr1.length; // Tamaño del primer arreglo
        int n2 = arr2.length; // Tamaño del segundo arreglo
        int[] resultado = new int[n1 + n2]; // Arreglo resultado con la suma de tamaños

        int i = 0, j = 0, k = 0; // Índices para recorrer los arreglos

        // Mientras haya elementos en ambos arreglos
        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                resultado[k++] = arr1[i++]; // Copiar el elemento de arr1
            } else {
                resultado[k++] = arr2[j++]; // Copiar el elemento de arr2
            }
        }

        // Copiar los elementos restantes de arr1 (si los hay)
        while (i < n1) {
            resultado[k++] = arr1[i++];
        }

        // Copiar los elementos restantes de arr2 (si los hay)
        while (j < n2) {
            resultado[k++] = arr2[j++];
        }

        return resultado; // Retornar el arreglo intercalado
    }
    }
    

