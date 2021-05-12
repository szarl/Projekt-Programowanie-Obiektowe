package Jcode;


import java.util.Scanner;

interface Login {
    public void wprowadzLogin();
    public void wprowadzHaslo();
    public void sprawdzStatus();
}

class log implements Login{
    public void wprowadzLogin() {
        System.out.println("Wprowadz login: ");
        Scanner login = new Scanner(System.in);
    }

    public void wprowadzHaslo() {
        System.out.println("Wprowadz haslo: ");
        Scanner haslo = new Scanner(System.in);
    }

    public void sprawdzStatus() {
        System.out.println("Sprawdzono ");
    }
}

