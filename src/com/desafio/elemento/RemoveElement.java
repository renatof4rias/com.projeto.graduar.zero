package com.desafio.elemento;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai digitar?");
        int tamanhoArray = sc.nextInt();

        int[] nums = new int[tamanhoArray];

        System.out.println("Digite " + tamanhoArray + " números inteiros:");
        for (int i = 0; i < tamanhoArray; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Digite o valor que deseja remover:");
        int val = sc.nextInt();

        int novoTamanho = removerElemento(nums, val);

        System.out.println("Array após remover o valor " + val + ":");
        for (int i = 0; i < novoTamanho; i++) {
            System.out.print(nums[i] + " ");
        }
    sc.close();
    }

    public static int removerElemento(int[] nums, int val){
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;

                }
            }
            return i;
        }
    }