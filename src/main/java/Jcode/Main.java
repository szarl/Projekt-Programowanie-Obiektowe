package Jcode;

import java.util.*;

class Main {
    public static long id;
    public static String haslo;
    public static List<Osoba> listaOsob = new ArrayList<>();

    public static void main(String[] args){

        System.out.println("-----------Witaj w programie-------------");
        System.out.println("Wybierz co chcesz zrobic: \n 1.Zaloguj \n 2.Zarejestruj \n 3.WYjdz");
        Scanner x = new Scanner(System.in);
        while(true) {
        switch (x.nextInt()) {
            case 1:
                Autoryzacja logowanie = new Autoryzacja(86, "ptaki");
                break;
            case 2:
                dodaj();
                System.out.println("Wybierz ponownie co chcesz zrobic");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Nie ma takie opcji, wybierz ponownie");
        }
    }
    }
    private static boolean usun_uzytkownika(int a){


        return false;
    }
    public static void dodaj(){
        System.out.println("Wprowadz  id: ");
        Scanner skan = new Scanner(System.in);
        id = skan.nextLong();

        System.out.println("Wprowadz  haslo: ");
        Scanner skanuj = new Scanner(System.in);
        haslo = skanuj.nextLine();

        Osoba coach = new Klient(id, haslo);
        listaOsob.add(coach);
        System.out.println(listaOsob.get(0).test());

    }
    public Main(){

    }
}