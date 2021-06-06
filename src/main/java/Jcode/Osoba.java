package Jcode;

public abstract class Osoba {

    public Osoba(long id, String haslo){
        this.id=id;
        this.haslo=haslo;
    }

    protected String imie;
    protected String nazwisko;
    protected String haslo;
    protected long id;


    protected abstract void edytuj();
    protected abstract void przegladaj();
    protected abstract void wyloguj();


public abstract String test();

}
