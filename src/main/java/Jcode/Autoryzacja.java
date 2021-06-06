package Jcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Autoryzacja {
    private String haslo = new String();
    private long id;

    private long wprowadzID(){
        System.out.println("Wprowadz swoje id: ");
        Scanner skanuj = new Scanner(System.in);
        this.id = skanuj.nextInt();
        return id;
    }
    private String wprowadz_haslo(){
        System.out.println("Wprowadz swoje haslo: ");
        Scanner skanuj = new Scanner(System.in);
        this.haslo = skanuj.nextLine();
        return haslo;
    }
    private boolean sprawdzStatus(long x, String haslo){

        Iterator it = Main.listaOsob.iterator();
        while(it.hasNext()){
            Osoba osoba = (Osoba) it.next();
           if(osoba.id == id && osoba.haslo.equals(haslo))
           {
               System.out.println("Zalogowano !!!");
                return true;
           }else
           {
               System.out.println("Nieudana proba logowania !!!");
           }
        }

        return false;
    }
    public Autoryzacja(){
        sprawdzStatus(wprowadzID(), wprowadz_haslo());
    }
}
