package Jcode;

import java.util.Scanner;

public class Przepis extends Podzialy {
    private float kaloriePosilku ;


    public Przepis(String nazwa, String opis, float czas, String kategoria, float kaloriePosilku){
        super(nazwa, opis, czas, kategoria);

    }

    @Override
    protected void sprawdz() {

    }
}
