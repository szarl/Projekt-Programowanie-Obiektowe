package Jcode;


import java.util.Scanner;

interface Login{
    public void wprowadzLogin();
    public void wprowadzHaslo();
    public void sprawdzStatus();
    public void rejestruj();
    public void zapisz_dane(String name, String pasname);
    public void aasdfg();
}

class log implements Login{
    protected String login;
    protected String haslo;

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

}

