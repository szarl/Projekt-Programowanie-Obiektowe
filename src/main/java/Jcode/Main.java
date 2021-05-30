package Jcode;

import java.util.Scanner;

class Main {
    private Rejestracja add = new Rejestracja();
    private Trener coach = new Trener();
    private Klient client = new Klient();
    protected int id;
    public void main(String[] args){

        System.out.println("Witaj w programie");
        System.out.println("Wybierz co chcesz zrobic: \n 1.Zaloguj \n 2. Zarejestruj \n 3.WYjdz");
        Scanner x = new Scanner(System.in);
        switch (x){
            case 1:
                break;
            case 2:
                dodaj();
        }

    }

    private static boolean usun_uzytkownika(int a){

        return false;
    }
    protected void dodaj(){
        // wykonywanie/wywołanie funkcji
        int x = add.stworz_ID();
        Scanner y = new Scanner(System.in);
        add.wprowadz_Haslo();
        add.utworz_konto(x, y);
    }
}