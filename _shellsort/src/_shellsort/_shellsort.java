/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _shellsort;

import java.util.Scanner;

/**
 *
 * @author judith acosta alvarez 
 * 23550398
 * estructura de datos
 */
public class _shellsort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa los numeros que deseas ordenar, separados por espacios:");
        String input = scanner.nextLine();

        String[] tokens = input.split(" ");
        int[] arr = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }

        System.out.println("\nArreglo original:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        shellSort(arr);

        System.out.println("\n\nArreglo ordenado:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
     
    public static void shellSort(int[] arr) {
        int n = arr.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
            }
        }
    }
    
}
