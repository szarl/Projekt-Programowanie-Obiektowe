package Jcode;

import java.util.Scanner;

public class Rejestracja {
    protected String haslo = "";
    protected long id = 0;
    Osoba osoba = null;

    public long stworz_ID(){

        System.out.println("Wprowadz  id: ");
        Scanner skan = new Scanner(System.in);
        id = skan.nextLong();
        return id;
    }

    public String wprowadz_Haslo(){

        System.out.println("Wprowadz  haslo: ");
        Scanner skanuj = new Scanner(System.in);
        haslo = skanuj.nextLine();
        return haslo;
    }

    private  boolean  utworz_konto(long id, String x) {
        return false;
    }
    public Rejestracja (long id, String haslo){
        haslo = wprowadz_Haslo();
        id = stworz_ID();
    }

    public Rejestracja(){
        stworz_ID();
        wprowadz_Haslo();
    }
}
