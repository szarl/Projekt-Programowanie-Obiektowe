package Jcode;

import java.util.List;
import java.util.Scanner;

class Main {
    private Rejestracja add = new Rejestracja(24785, "haslohaslo");
    private Trener coach = new Trener();
    private Klient client = new Klient();
    protected int id;
    private Osoba[] tablicaOsob;
    public static void main(String[] args){

        System.out.println("Witaj w programie");
        System.out.println("Wybierz co chcesz zrobic: \n 1.Zaloguj \n 2. Zarejestruj \n 3.WYjdz");
        Scanner x = new Scanner(System.in);
        switch (x.nextInt()){
            case 1:
                Autoryzacja logowanie = new Autoryzacja(86, "ptaki");
                break;
            case 2:
                dodaj();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Nie ma takie opcji, wybierz ponownie");
        }

    }

    private static boolean usun_uzytkownika(int a){

        return false;
    }
    protected static void dodaj(){
    }
}