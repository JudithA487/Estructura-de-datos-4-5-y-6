/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _ejemplo_burbuja;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author judith acosta alvarez
 * 23550398
 * estructura de datos
 */
public class _ejemplo_burbuja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Ingresa números para agregar a la lista. Escribe 'salir' para finalizar.");

        // Captura de datos
        while (true) {
            System.out.print("Número: ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("salir")) {
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                list.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido o 'salir' para terminar.");
            }
        }

        // Ordenamiento burbuja
        bubbleSort(list);

        // Impresión de la lista ordenada
        System.out.println("Lista ordenada: " + list);
    }

    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Intercambio
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    
}
