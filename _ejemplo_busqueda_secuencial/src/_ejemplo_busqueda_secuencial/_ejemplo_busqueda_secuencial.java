/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _ejemplo_busqueda_secuencial;

/**
 *
 * @author judith acosta alvarez
 * 23550398
 * estructura de datos
 */
public class _ejemplo_busqueda_secuencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arreglo = {5, 3, 8, 4, 2, 7, 1, 10};
        int numero = 1;
        int resultado = busquedaSecuencial(arreglo, numero);
        if (resultado != -1) {
            System.out.println("Elemento encontrado en el índice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado en el arreglo.");
        }
    }

    private static int busquedaSecuencial(int[] arreglo, int numero) {
        
        return 0;
        
    }
    
}
