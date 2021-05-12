package Jcode;

import java.util.Scanner;

public interface guest {
    public void rejestruj();
    public void zaloguj();
    public void choose();
}
class first_step implements guest{

    public void choose(){
        System.out.println("Wybierz jeddna z dwoch opcji:");
        System.out.println("1. Zaloguj:");
        System.out.println("2. Rejestracja");
        Scanner x = new Scanner(System.in);
        switch(x.nextShort()) {
            case 1:

                break;
            case 2:

                break;

            default:
        }

    }

    public void rejestruj() {

    }

    public void zaloguj() {

    }


}