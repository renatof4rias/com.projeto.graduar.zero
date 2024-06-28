
package com.desafio.romano;

import java.util.Scanner;

public class RomanoInteiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Conversor de Algarismo Romano para Número Inteiro");
        System.out.println("-------------------------------------------------");
        System.out.print("Digite um valor em algarismos romanos: ");
        String entrada = sc.nextLine();
        int numeroInteiro = romanoInt(entrada);
        System.out.println("O valor em algarismos romanos '" + entrada + "' é: " + numeroInteiro);

        sc.close();
    }

    public static int romanoInt(String s){
        char[] list = s.toCharArray();
        int valor = 0;

        for (int i = 0; i < list.length; i++) {

            if (i+1 < list.length){
                if (list[i+1] == 'V' && list[i] == 'I'){
                    valor+=4;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'X' && list[i] == 'I'){
                    valor+=9;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'L' && list[i] == 'X'){
                    valor+=40;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'C' && list[i] == 'X'){
                    valor+=90;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'D' && list[i] == 'C'){
                    valor+=400;
                    i++;
                    continue;
                }
                else if (list[i+1] == 'M' && list[i] == 'C'){
                    valor+=900;
                    i++;
                    continue;
                }
            }

            if (list[i] == 'I') {
                valor += 1;
            } else if (list[i] == 'V') {
                valor += 5;
            } else if (list[i] == 'X') {
                valor += 10;
            } else if (list[i] == 'L') {
                valor += 50;
            } else if (list[i] == 'C') {
                valor += 100;
            } else if (list[i] == 'D') {
                valor += 500;
            } else if (list[i] == 'M') {
                valor += 1000;
            }
        }
        return valor;
    }
}