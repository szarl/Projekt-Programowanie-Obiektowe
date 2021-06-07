package Jcode;

public abstract class Osoba {

    public Osoba(long id, String haslo, String imie, String nazwisk, boolean osobacheck){
        this.id=id;
        this.haslo=haslo;
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.osobacheck=osobacheck;
    }

    protected String imie;
    protected String nazwisko;
    protected String haslo;
    protected long id;
    protected boolean osobacheck;

    public Osoba(long id) {
        this.id = id;
    }


    public abstract String test();
    protected abstract void edytuj();
    protected abstract void przegladaj();
    protected abstract Trener wyloguj();




}
