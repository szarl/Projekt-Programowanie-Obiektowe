package Jcode;

public class Klient extends Osoba{
    private long numerTelefonu;
    private boolean plec;
    private float wzrost;
    private float waga;
    private float wagaDocelowa;
    private int zapotrzebowanie;
    private int wiek;
    private String adresEmail;
    private String dataZapisu;
    private String dataKoncowa;

    private float ObliczBmi(float wzrost, float waga, int wiek, boolean plec) {

        return 0;
    }

    protected int ObliczZapotrzebowanie(float wzrost , float waga, int wiek, boolean plec, float wagaDocelowa) {

        return 0;
    }

    @Override
    protected void edytuj() {

    }

    @Override
    protected void przegladaj() {

    }

    @Override
    protected void wyloguj() {

    }

    public Klient(){

    }
}
