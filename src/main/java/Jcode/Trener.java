package Jcode;

public class Trener extends Osoba {
    protected Katalog katalog= new Katalog();

    public Trener(long a) {
        super(a);
    }

    private void ModyfikujPrzepis(){

    }

    private void ModyfikujCwiczenie(){


    }

    @Override
    public void edytuj(){

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

@Override
    public String test(){ return nazwisko;}


    public Trener(long id, String haslo, String imie, String nazwisko, boolean osobacheck){
        super(id, haslo, imie, nazwisko, osobacheck);
    }

}
