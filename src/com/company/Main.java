package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float numberA;
        float numberB;
        String operator;
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Ingrese el primer numero");
            numberA = leer.nextFloat();
            System.out.println("Ingrese el segundo numero");
            numberB = leer.nextFloat();
            System.out.println("Ingrese el operador + - * / %");
            operator = leer.next();

            switch (operator) {
                case "+":
                    System.out.println(numberA + numberB);
                    break;
                case "-":
                    System.out.println(numberA - numberB);
                    break;
                case "*":
                    System.out.println(numberA * numberB);
                    break;
                case "/":
                    if (numberB == 0)
                        System.out.println("undefined");
                    else
                        System.out.println(numberA / numberB);
                    break;
                case "%":
                    System.out.println(numberA % numberB);
                    break;
            }
            System.out.println("Desea continuar? [si] [no]");
            isContinue = leer.next().toLowerCase().equals("si") ? true : false;
        }
    }

}
