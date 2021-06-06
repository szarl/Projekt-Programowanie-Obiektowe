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

    }

    @Override
    protected void wyloguj() {

    }

    @Override
    public String test(){
        return this.haslo;
    }

    public Trener(long id, String haslo){
        super(id, haslo);
    }
}
