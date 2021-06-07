package Jcode;

import java.util.*;

class Main {
    public static long id;
    public static String haslo;
    public static List<Osoba> listaOsob = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("-----------Witaj w programie-------------");
        System.out.println("Wybierz co chcesz zrobic: \n 1.Zaloguj \n 2.Zarejestruj \n 3.WYjdz");
        Scanner x = new Scanner(System.in);
        while (true) {
            switch (x.nextInt()) {
                case 1:
                    Autoryzacja logowanie = new Autoryzacja();
                    if (logowanie.sprawdzStatus(id, haslo))
                    {
                        exeTrener();
                    }
                    else if (logowanie.sprawdzStatus(id, haslo) == false)
                    {
                        exeClient();
                    }
                    else
                    {
                        System.out.println("Blad programu, sprobuj uruchomic ponownie");
                        System.exit(0);
                    }
                break;
                case 2:
                    dodaj();
                    System.out.println("Wybierz ponownie co chcesz zrobic");
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie ma takie opcji, wybierz ponownie");
            }
        }

    }
    private static boolean usun_uzytkownika(int a){


        return false;
    }
    public static boolean dodaj() {
        while(true){
        System.out.println("1. Stworz konto dla klienta");
        System.out.println("2. Stworz konto dla trenera");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        if (y == 1) {

            System.out.println("Wprowadz  id: ");
            Scanner skan = new Scanner(System.in);
            id = skan.nextLong();

            System.out.println("Wprowadz  haslo: ");
            Scanner skanuj = new Scanner(System.in);
            haslo = skanuj.nextLine();

            System.out.println("Wprowadz  imie: ");
            Scanner a = new Scanner(System.in);
            String imie = a.nextLine();

            System.out.println("Wprowadz  nazwisko: ");
            Scanner b = new Scanner(System.in);
            String nazwisko = b.nextLine();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj numer telefonu");
            long numerTelefonu = scanner.nextLong();

            boolean plec = false;
            System.out.println("Wybierz plec: \n 1.Mezczyzna \n 2.Kobieta");
            switch (x.nextInt()){
                case 1:
                    plec=true;
                    break;
                case 2:
                    plec=false;
                    break;
                default:
                    System.out.println("Nie ma takie opcji, wybierz ponownie");
            }

            float wzrost;
            System.out.println("Podaj wzrost w metrach");
            wzrost = scanner.nextFloat();
            while (wzrost>3){
                System.out.println("Zla jednostka, podaj wzrot w metrach");
                wzrost = scanner.nextFloat();
            }


            System.out.println("Podaj wage");
            float waga = scanner.nextFloat();


            System.out.println("Podaj wage docelowa");
            float wagaDocelowa = scanner.nextFloat();

            System.out.println("Podaj wiek");
            int wiek = scanner.nextInt();

            System.out.println("Wybierz wpolczynnik aktywnosci:  \n 1,2 	dla osoby chorej, leżącej w łóżku \n 1,4 	dla niskiej aktywności fizycznej i pracy siedzącej \n 1,6 	dla umiarkowanej aktywności fizycznej i pracy stojącej \n 1,75 	dla aktywnego trybu życia (regularne ćwiczenia) \n 2 	dla bardzo aktywnego trybu życia (codzienne ćwiczenia lub calodzienna praca fizyczna) \n ");
            float k = scanner.nextFloat();

            System.out.println("Podaj adres email");
            String adresEmail = scanner.next();

            System.out.println("Podaj date zapisu");
            String dataZapisu = scanner.next();

            System.out.println("Podaj przewidywana date koncowa");
            String dataKoncowa = scanner.next();

            Osoba klient = new Klient(id, haslo, imie, nazwisko, false, numerTelefonu, adresEmail, plec, wzrost, waga, wagaDocelowa, wiek, k, dataZapisu, dataKoncowa);
            listaOsob.add(klient);
            return false;

        }else if(y==2){
            System.out.println("Wprowadz  id: ");
            Scanner skan = new Scanner(System.in);
            id = skan.nextLong();

            System.out.println("Wprowadz  haslo: ");
            Scanner skanuj = new Scanner(System.in);
            haslo = skanuj.nextLine();

            System.out.println("Wprowadz  imie: ");
            Scanner a = new Scanner(System.in);
            String imie = a.nextLine();

            System.out.println("Wprowadz  nazwisko: ");
            Scanner b = new Scanner(System.in);
            String nazwisko = b.nextLine();

            Osoba klient = new Trener(id, haslo, imie, nazwisko, true);
            listaOsob.add(klient);
            return false;

        }
        else
        {
            System.out.println("Nie ma takiej opcji! Wybierz jeszcze raz. ");
        }}
    }
    private static void exeTrener(){
        Scanner x = new Scanner(System.in);
        System.out.println("Wybierz co zamierzasz zrobic: \n 1.Przegladaj dane osob pod twoja opieka \n 2. \n 3. \n 4. \n 5. \n 6. \n");
        switch (x.nextInt()){
            case 1:
                for(int i=0; i<=listaOsob.size();i++) {
                    System.out.println(listaOsob.get(i));
                }
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:
                Trener q = new Trener(0,null,null,null,false).wyloguj();
                break;
            default:
                System.out.println("Nie ma takie opcji, wybierz ponownie");
        }


    }
    private static void exeClient(){

    }

}