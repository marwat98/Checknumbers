package checknumbers;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        System.out.println("Sprawdź znak w systemie dziesiętnym oraz szesnastkowym");
        System.out.println();
        System.out.println("1.Sprawdź znak w systemie dziesiętnym");
        System.out.println("2.Sprawdź znak w systemie szesnastkowym");
        System.out.println();
        System.out.println("Wybierz opcje: ");
        choose = scanner.nextInt();

       switch (choose){
           case 1 -> option1();
           case 2 -> option2();
       }
    }

    static void option1 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź znak: ");
        char znak = scanner.next().charAt(0);
        if(Character.digit(znak, 10) == -1){
            System.out.println("Podana wartość nie jest liczbą");
        } else{
            System.out.println("Znak w systemie dziesiętnym to: " + Character.digit(znak, 10));
        }
    }
    static void option2 (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź znak: ");
        char znak2 = scanner.next().charAt(0);
        if(Character.digit(znak2, 16) == -1){
            System.out.println("Podana wartość nie jest liczbą");
        } else{
            System.out.println("Znak w systemie szesnastkowym to: " + Character.digit(znak2, 16));
        }
    }


    }

