package checknumbers;

import java.util.Scanner;

public class CheckNumbers {

    static Scanner scanner = new Scanner(System.in);
    static char sign;
    public static void main(String[] args) {
        CheckNumbers check = new CheckNumbers();
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
           case 1 -> check.option1(sign);
           case 2 -> check.option2(sign);
       }
    }

    public int option1 (char sign){

        CheckNumbers.sign = sign;
        System.out.println("Wprowadź znak: ");
        char znak = scanner.next().charAt(0);
        if(Character.digit(znak, 10) == -1){
            System.out.println("Podana wartość nie jest liczbą");
            return -1;
        } else{
            System.out.println("Znak w systemie dziesiętnym to: " + Character.digit(znak, 10));
            return znak;
        }
    }
    public int option2 (char sign){

        CheckNumbers.sign = sign;
        System.out.println("Wprowadź znak: ");
        char znak2 = scanner.next().charAt(0);
        if(Character.digit(znak2, 16) == -1){
            System.out.println("Podana wartość nie jest liczbą");
            return -1;
        } else{
            System.out.println("Znak w systemie szesnastkowym to: " + Character.digit(znak2, 16));
            return znak2;
        }
    }
}

