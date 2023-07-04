package br.com.victor;

import java.util.Scanner;

public class ClassRoom {

    public static void main(String[] args) {
        returnAverage();
    }

    private static void returnAverage () {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua 1º nota: ");
        double num1 = s.nextDouble();

        System.out.println("Digite sua 2º nota: ");
        double num2 = s.nextDouble();

        System.out.println("Digite sua 3º nota: ");
        double num3 = s.nextDouble();

        System.out.println("Digite sua 4º nota: ");
        double num4 = s.nextDouble();

        double avg = (num1 + num2 + num3 + num4) / 4;

        String isApproved = avg >= 7 ? "Aprovado" : avg >= 5 ? "Recuperação" : "Reprovado";

        System.out.println("Olá sua média foi: " + avg + "." + " Você está " + isApproved);
    }

}
