package Jcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Katalog {
    public static List<Podzialy> listaPodzialow = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    protected void wybierzDodaj(){
        System.out.println("Wybierz co chcesz zrobic \n 1.Dodaj nowe cwiczenie 2.Dodaj nowy przepis ");
        Scanner x = new Scanner(System.in);
        switch (x.nextInt()) {
            case 1:
                dodajPartia();
                System.out.println("Wybierz ponownie co chcesz zrobic");
                break;
            case 2:
                dodajPoraDnia();
                System.out.println("Wybierz ponownie co chcesz zrobic");
                break;
            default:
                System.out.println("Nie ma takie opcji, wybierz ponownie");
        }
    }
}
    protected void dodajPartia(){
        System.out.println("Podaj nazwe cwiczenia");
        String nazwa = scanner.next();

        System.out.println("Podaj opis cwiczenia");
        String opis = scanner.next();

        System.out.println("Podaj utracone kalorie");
        float kalorieCwiczen = scanner.nextFloat();

        System.out.println("Podaj czas wykonania cwiczenia");
        float czas= scanner.nextInt();

        System.out.println("Podaj na jaka partie jest to cwiczenie");
        String kategoria = scanner.next();

        Podzialy cwiczenie = new Cwiczenie(nazwa,opis, czas, kategoria, kalorieCwiczen);
        listaPodzialow.add(cwiczenie);
    }
    protected void dodajPoraDnia(){
        System.out.println("Podaj nazwe potrawy");
        String nazwa = scanner.next();

        System.out.println("Podaj przepis na potrawe");
        String opis = scanner.next();

        System.out.println("Podaj kalorycznosc dania na 100 gram");
        float kaloriePosilku = scanner.nextInt();

        System.out.println("Podaj czas wykonania potrawy");
        float czas= scanner.nextInt();

        System.out.println("Podaj kategorie przepisu (sniadanie, obiad, przekaska, deser, kolacja");
        String kategoria = scanner.next();

        Podzialy przepis = new Przepis(nazwa,opis, czas, kategoria, kaloriePosilku);
        listaPodzialow.add(przepis);
    }

}
