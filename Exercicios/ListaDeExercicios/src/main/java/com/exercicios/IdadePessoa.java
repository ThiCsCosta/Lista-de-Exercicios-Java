package com.exercicios;

/*
1. Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */


import java.util.Scanner;

public class IdadePessoa {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int idadeAnos, idadeMeses, idadeDias,totalIdade;

        System.out.println("Digite o ano:");
        idadeAnos = scan.nextInt();

        System.out.println("Digite os meses:");
        idadeMeses = scan.nextInt();

        System.out.println("Digite os dias:");
        idadeDias = scan.nextInt();

        totalIdade =  (idadeAnos * 365) + (idadeMeses * 30) + idadeDias;
        System.out.println(totalIdade);


    }
}