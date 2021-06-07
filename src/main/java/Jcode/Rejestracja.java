package Jcode;

import java.util.Iterator;
import java.util.Scanner;

public class Rejestracja {
    private String haslo = new String();
    private long id ;
    Osoba osoba = null;

    private long stworz_ID() {

        System.out.println("Wprowadz  id: ");
        Scanner skan = new Scanner(System.in);
        id = skan.nextLong();
        return id;
    }

    private String wprowadz_Haslo() {

        System.out.println("Wprowadz  haslo: ");
        Scanner skanuj = new Scanner(System.in);
        haslo = skanuj.nextLine();
        return haslo;
    }

    public boolean utworz_konto(long id){

        return true;
    }

    public Rejestracja(long id){
            utworz_konto(id);
        }
}
