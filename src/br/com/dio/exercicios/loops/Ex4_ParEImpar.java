package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numeros;
        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Quantos números serao? ");
        int count = scan.nextInt();

        do {
            System.out.println("Digite o número: ");
            numeros = scan.nextInt();
            if (numeros % 2 == 0)
                numerosPares++;
            else
                numerosImpares++;

            count--;
        } while (count > 0);

        System.out.println("A quantidade de numeros pares foi de " + numerosPares);
        System.out.println("A quantidade de numeros impares foi de " + numerosImpares);
    }
}
