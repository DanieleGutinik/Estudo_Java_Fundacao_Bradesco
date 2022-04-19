/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modulo3;
/**
 * FLUXO CONDICIONAL
 * UTILIZAÇÃO DO IF,ELSE,IF,ELSE
 * @author Daniele Barbosa Gutinik
 */
public class fluxo_condicional_IF_ELSE_IF_ELSE {
    /* metodo principal da classe*/
    public static void main (String []args){
        int idade = 19;
            if(idade <= 7) // a idade é menor ou igual a 7?
                System.out.println("Ainda é uma criança"); // Se verdadeiro, imprima
               else if(idade >7 && idade <=18) //a idade é maior que 7 e menor ou igual a 18 ?
                System.out.println("É um Adolescente");//se verdadeiro, imprima
            else if(idade > 18 && idade <= 60)// a idade é maior que 18 e menor ou igual a 60 ?
                System.out.println("É um Adulto");// se verdadeiro , imprima
            else
                System.out.println("Esta na melhor idade!");// senão imprima
    
    }// Fim do método
 } //fim da Classe
