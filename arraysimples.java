/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3;

/**
 *Array Simples
 * @author Daniele Barbosa Gutinik
 */
import java.util.Arrays;
public class arraysimples {
    public static void main (String[] args){
        String[] paises = {"BRASIL", "RUSSIA","INDIA","CHINA"};
        
        System.out.println(paises[0]);
        System.out.println(Arrays.toString(paises));
        
        int posicao = Arrays.binarySearch(paises, "BRASIL");
        System.out.println(posicao);
        
        Arrays.sort (paises, 0, paises.length);// ordena o nosso array iniciando em zero
        System.out.println(Arrays.toString(paises));// imprime o resultado em tela
    }    
}
