package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int maiorNum = 0;
        int somaMedia = 0;
        double media;

        int count = 1;
        do {
            System.out.println("Digite o " + count + "° número: ");
            num = scan.nextInt();
            somaMedia = somaMedia + num;
            if (num > maiorNum) maiorNum = num;
            
            count++;
        } while (count < 6);

        media = somaMedia / 5;

        System.out.println("O maior número digitado foi " + maiorNum);
        System.out.println("A média desses números é igual a " + media);
    }
}
