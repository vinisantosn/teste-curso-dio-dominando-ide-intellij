package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a,b;

        System.out.println("digite o valor de a:");
        a = scan.nextDouble();
        System.out.println("digite o valor de b:");
        b=scan.nextDouble();

        double somar = somar(a, b);
        double subtrair = subtrair(a, b);
        double multiplicar = multiplicar(a, b);
        double dividir = dividir(a, b);

        System.out.println("SOMA: "+somar);
        System.out.println("SUBTRAÇÃO: "+subtrair);
        System.out.println("MULTIPLICAÇÃO: "+ multiplicar);
        System.out.println("DIVISÃO: "+ dividir);


    }
    public static double somar( double a, double b){
        return a+b;
    }

    public static double subtrair( double a, double b){
        return a-b;
    }
    public static double multiplicar( double a, double b){
        return a*b;
    }
    public static double dividir( double a, double b){
        return a/b;
    }



}
