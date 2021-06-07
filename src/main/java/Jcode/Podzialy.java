package Jcode;

public abstract class Podzialy {

    public Podzialy(String nazwa,String opis ,float czas,  String kategoria){
        this.nazwa=nazwa;
        this.opis=opis;
        this.czas=czas;
        this.kategoriaA=kategoria;

    }
    protected String nazwa;
    protected float czas;
    protected String kategoria;
    protected String opis;

    protected abstract void sprawdz();
}
