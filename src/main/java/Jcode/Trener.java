package Jcode;

public class Trener extends Osoba {
    protected Katalog katalog= new Katalog();

    private void ModyfikujPrzepis(){

    }

    private void ModyfikujCwiczenie(){


    }

    @Override
    protected void edytuj() {

    }

    @Override
    protected void przegladaj() {
        for(Osoba i : Main.listaOsob) {
            System.out.println(i);
        }

    }

    @Override
    protected Trener wyloguj() {
        Main.main(null);
        return null;
    }

    public Trener(long id, String haslo, String imie, String nazwisko, boolean osobacheck){
        super(id, haslo, imie, nazwisko, osobacheck);
        wyloguj();
    }

}
