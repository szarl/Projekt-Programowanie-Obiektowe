package Jcode;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static long id;
    public static String haslo;
    public static List<Osoba> listaOsob = new ArrayList<>();
    static Rejestracja check = new Rejestracja(id);
    static Katalog katalog = new Katalog();

    public static void main(String[] args) {

        System.out.println("-----------Witaj w programie-------------");
        System.out.println("Wybierz co chcesz zrobic: \n 1.Zaloguj \n 2.Zarejestruj \n 3.WYjdz");
        Scanner x = new Scanner(System.in);
        while (true) {
            switch (x.nextInt()) {
                case 1:
                    if(listaOsob.isEmpty()) break;

                    Autoryzacja logowanie = new Autoryzacja();
                    if (logowanie.sprawdzStatus(id, haslo)){
                        System.out.println("Zalogowano!!!");
                        if (true)
                    {
                        exeTrener();
                    }
                    else if (false)
                    {
                        exeClient();
                    }
                    else
                    {
                        System.out.println("Blad programu, sprobuj uruchomic ponownie");
                        System.exit(0);
                    }} else
                        System.out.println("Nieudana proba logowania!");
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
    private static void usun_uzytkownika(){
        listaOsob.clear();
        System.out.println("Pomyślnie usunieto trenera i jego podopiecznych!");
    }

    private static boolean usun_uzytkownika(long a){
        listaOsob.remove(new Trener(a));
        System.out.println("Pomyślnie usunieto klienta");
        return true;
    }

    public static boolean dodaj() {
        while(true){
        System.out.println("1. Stworz konto dla klienta");
        System.out.println("2. Stworz konto dla trenera");
        Scanner x = new Scanner(System.in);
        int y = x.nextInt();
        if (y == 1) {

            System.out.println("Wprowadz  id (cyfry 0-9): ");
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
            System.out.println(listaOsob.get(0).id);
            return false;
        }else if(y==2){
            System.out.println("Wprowadz  id (cyfry 0-9): ");
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

            Osoba coach = new Trener(id, haslo, imie, nazwisko, true);
            listaOsob.add(coach);
            return false;

        }
        else
        {
            System.out.println("Nie ma takiej opcji! Wybierz jeszcze raz. ");
        }
        }
    }
    private static void exeTrener(){
            Scanner x = new Scanner(System.in);
        System.out.println("Wybierz co zamierzasz zrobic: \n 1.Przegladaj dane osob pod twoja opieka \n 2. Edytuj dane klientow \n 3. Dodaj przepisy i cwiczenia  \n 4. Edytuj przepisy i cwiczenia \n 5.Usun uzytkownika \n 6. Wyloguj \n");
        switch (x.nextInt()){
            case 1:
                for(int i=0; i<=listaOsob.size(); i++) {
                    System.out.println(listaOsob);
                }
                break;
            case 2:
                // trzeba wrocic
                for(Osoba klient : listaOsob) {
                    System.out.println(klient.test());
               }
                System.out.println("Wybierz numer ktory chcesz edytowac: ");
                Scanner x = new Scanner(System.in);
                System.out.println("Wybierz co chcesz edytowac: \n 1.Imie \n 2.Nazwisko \n 3.Numer telefonu  \n 4.Wzrost \n 5.Wage \n 6.Wage docelowa \n 7.Wiek \n 8.Wspolczynnik aktywnosci \n 9.Adres email \n 10.Date zapisu \n 11.Date koncowa \n");
                switch (x.nextInt()){
                    case 1:
                        System.out.println("Podaj nowe imie");
                        imie = x.nextLine();
                        break;
                    case 2:
                        System.out.println("Podaj nowe nazwisko");
                        nazwisko = x.nextLine();

                        break;
                    case 3:
                        System.out.println("Podaj nowy numer telefonu");
                        numerTelefonu = x.nextLine();

                        break;
                    case 4:
                        System.out.println("Podaj nowy wzrost");
                        wzrost = x.nextLine();

                        break;
                    case 5:
                        System.out.println("Podaj nowa wage");
                        waga = x.nextLine();

                        break;
                    case 6:
                        System.out.println("Podaj nowa wage docelowa");
                        wagaDocelowa = x.nextLine();

                        break;
                    case 7:
                        System.out.println("Podaj nowy wiek");
                        wiek = x.nextLine();

                        break;
                    case 8:
                        System.out.println("Podaj nowy wspolczynnik aktywnosci");
                        k = x.nextLine();

                        break;
                    case 9:
                        System.out.println("Podaj nowy adres email");
                        adresEmail = x.nextLine();

                        break;
                    case 10:
                        System.out.println("Podaj nowa date koncowa");
                        dataKoncowa = x.nextLine();

                        break;

                    default:
                        System.out.println("Nie ma takie opcji, wybierz ponownie");
                }
                break;
            case 3:
                katalog.wybierzDodaj();
                break;
            case 4:

                break;
            case 5:
                System.out.println("Wybierz kogo chcesz usunac: \n 1.Trenera \n 2.Klienta");
                switch (x.nextInt()){
                    case 1:
                        usun_uzytkownika();
                        break;
                    case 2:
                        System.out.println("Podaj id klienta ktorego chcesz usunac: ");
                        Scanner a = new Scanner(System.in);
                        long id = a.nextLong();
                        usun_uzytkownika(id);
                        break;
                    default:
                        System.out.println("Nie ma takie opcji, wybierz ponownie");
                }

                break;
            case 6:
                Trener q = new Trener(0,null,null,null,false).wyloguj();
                break;
            default:
                System.out.println("Nie ma takie opcji, wybierz ponownie");
        }


    }
    private static void exeClient(){
            Scanner x = new Scanner(System.in);
            System.out.println("Wybierz co zamierzasz zrobic: \n 1.Przegladaj swoje dane \n 2. Oblicz BMI \n 3.Oblicz zapotrzebowanie \n 4.Edytuj dane \n");
            switch (x.nextInt()){
                case 1:

                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                     System.out.println("");
                    break;

                default:
                    System.out.println("Nie ma takie opcji, wybierz ponownie");
            }
    }

}