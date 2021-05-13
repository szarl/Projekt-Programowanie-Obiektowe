package Jcode;


import java.util.Scanner;

interface Login {
    public void wprowadzLogin();
    public void wprowadzHaslo();
    public void sprawdzStatus();
    public void choose();
    public void rejestruj();
    public void zapisz_dane(String name, String pasname);
}

class log implements Login{
    private String login;
    private String haslo;

    public void wprowadzLogin() {
        System.out.println("Wprowadz login: ");
        Scanner scaner = new Scanner(System.in);
        login = scaner.nextLine();
    }

    public void wprowadzHaslo() {
        System.out.println("Wprowadz haslo: ");
        Scanner scaner = new Scanner(System.in);
        haslo = scaner.nextLine();
    }

    public void sprawdzStatus() {
        System.out.println("Sprawdzono ");
        System.out.println(login);
        System.out.println(haslo);
    }
    public void rejestruj() {

    }

    public void zapisz_dane(String name, String pasname){

    }

    public void choose(){
        System.out.println("Wybierz jeddna z dwoch opcji:");
        System.out.println("1. Zaloguj:");
        System.out.println("2. Rejestracja");
        System.out.println("3. Wyjscie");
        System.out.println("Wpisz odpowiedni numer: ");
        Scanner x = new Scanner(System.in);
        do{
        switch(x.nextShort()) {
            case 1:
                wprowadzLogin();
                wprowadzHaslo();
                sprawdzStatus();
                break;
            case 2:
                rejestruj();
                zapisz_dane(login, haslo);
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

