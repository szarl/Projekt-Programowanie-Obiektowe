package Jcode;

import java.util.Scanner;

class main{
    public static void main(String[] args) {
        log user= new log();
        System.out.println("Wybierz jeddna z dwoch opcji:");
        System.out.println("1. Zaloguj:");
        System.out.println("2. Rejestracja");
        System.out.println("3. Wyjscie");
        System.out.println("Wpisz odpowiedni numer: ");
        Scanner x = new Scanner(System.in);
        do{
            switch(x.nextShort()) {
                case 1:
                    user.wprowadzLogin();
                    user.wprowadzHaslo();
                    user.sprawdzStatus();
                    break;
                case 2:
                    user.rejestruj();
                    user.zapisz_dane(user.login, user.haslo);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takiej opcji, wpisz jeszcze raz");
            }
        }while(true);
    }
}