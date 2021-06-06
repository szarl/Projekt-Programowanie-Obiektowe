package Jcode;

import java.util.Scanner;

public class Rejestracja {
    protected String haslo = new String();
    protected long id;

    private static int stworz_ID(){

            System.out.println("Wprowadz swoje id: ");
            Scanner skanuj = new Scanner(System.in);
            id = skanuj.nextLine();


        return 0;
    }

    private static  String wprowadz_Haslo(){
        System.out.println("Wprowadz nowe haslo: ");
        Scanner skanuj = new Scanner(System.in);
        haslo = skanuj.nextLine();
    }

    private static boolean  utworz_konto(int id, Scanner haslo) {
        user= new User(id, haslo);
        users.add(user);
        return false;
    }
    public Rejestracja (long x, String h){
        id = x;
    }


}
