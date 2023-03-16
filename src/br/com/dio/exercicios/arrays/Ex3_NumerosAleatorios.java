package br.com.dio.exercicios.arrays;

import java.util.Random;

import javax.swing.BoundedRangeModel;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = random.nextInt(100);
            //int numero = random.nextInt(100);
        }

        System.out.println("Números aleatórios ");
        for (int elemento : numerosAleatorios) {
            System.out.print(elemento + " ");
        }

        System.out.println("\nAntecessores dos números aleatórios ");
        for (int elemento : numerosAleatorios) {
            System.out.print((elemento - 1) + " ");
        }

        System.out.println("\nSucessores dos números aleatórios ");
        for (int elemento : numerosAleatorios) {
            System.out.print((elemento + 1) + " ");
        }
    }

}
