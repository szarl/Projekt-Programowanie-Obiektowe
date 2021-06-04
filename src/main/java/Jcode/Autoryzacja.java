package Jcode;
import java.util.Scanner;

public class Autoryzacja {
    private String haslo = new String();
    private long id;
    private Main osoba = new Main();

    protected void wprowadzID(){
        System.out.println("Wprowadz swoje id: ");
        Scanner skanuj = new Scanner(System.in);
        id = skanuj.nextInt();
    }
    protected void wprowadz_haslo(){
        System.out.println("Wprowadz swoje haslo: ");
        Scanner skanuj = new Scanner(System.in);
        haslo = skanuj.nextLine();
    }
    private boolean sprawdzStatus(int x, String haslo){
        return false;                   // trzeba wymyslec sposob na sprawdzenie czy jest taki byt w talibyc w mainie lsita<Osoby>
    }
    public Autoryzacja(long id, String haslo){
        wprowadzID();
        wprowadz_haslo();
    }
}
