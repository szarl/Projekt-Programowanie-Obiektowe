package Jcode;

public abstract class Osoba {
    protected String imie;
    protected String nazwisko;

    protected abstract void edytuj();
    protected abstract void przegladaj();
    protected abstract void wyloguj();
}
