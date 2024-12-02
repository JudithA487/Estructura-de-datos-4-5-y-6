/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _busqueda_binaria;

import java.util.Scanner;

/**
 *
 * @author Judith Acosta Alvarez
 * 23550398
 * Estructura de datos
 */

        public class Busqueda_binaria {

    static int lista[]={4,5,6,1,2,3,7,8,9};
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Esto es busqueda binaria");
        System.out.println("la secuencia de numero que buscaremos sera: 456123789");
        System.out.println("Que numero deseas buscar:");
        int numero=entrada.nextInt();
        entrada.nextLine();
        orden();
        
         System.out.println("Nueva lista");
       for(int o=0;o<lista.length;o++){
                System.out.print(lista[o]);
       }
        busqueda(numero);
    }
    
    public static void orden(){
        boolean x=false;
        int n=lista.length;
          for (int i = 0; i < n - 1; i++) {
            x = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    int temp = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temp;
                    x = true;
                }
            }
            if (!x) {
                break;
            }
        }
}

    public static void busqueda(int numero) {
        int inicio=0,fin=(lista.length-1),medio;
        
        boolean x=false;
        medio=(inicio+fin)/2;
        System.out.println(lista[fin]);
        while(x==false){
            if(lista[medio]==numero){
                System.out.println("se encontro tu numero en el indice:"+medio);
                x=true;
            }else if(lista[fin]==numero){
                System.out.println("se encontro tu numero en el indice:"+fin);
                x=true;
            }else if(lista[inicio]==numero){
                System.out.println("se encontro tu numero en el indice:"+inicio);
                x=true;
            }else if(lista[medio]>numero){
                fin=medio-1;
                medio=(fin+inicio)/2;
            }else if(lista[medio]<numero){
                inicio=medio+1;
                medio=(inicio+fin)/2;
                
            }
        
        }
        
    }
}
    
    

