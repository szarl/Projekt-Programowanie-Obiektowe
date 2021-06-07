package Jcode;

public class Klient extends Osoba{
    private long numerTelefonu;
    private boolean plec; //mezczyzna==true
    private float wzrost; //w metrach
    private float waga;
    private float wagaDocelowa;
    private int zapotrzebowanie;
    private int wiek;
    private float k;    //wspolczynnik aktywnoci
    private String adresEmail= new String();
    private String dataZapisu= new String();
    private String dataKoncowa= new String();

    public Klient(long id, String haslo, String imie, String nazwisko, boolean osobaceck, long numerTelefonu, String adresEmail, boolean plec, float wzrost, float waga, float wagaDocelowa, int wiek, float k, String dataZapisu, String dataKoncowa){

        super(id, haslo, imie, nazwisko, osobaceck);
        this.adresEmail=adresEmail;
        this.dataKoncowa=dataKoncowa;
        this.dataZapisu=dataZapisu;
        this.k=k;
        this.numerTelefonu=numerTelefonu;
        this.plec=plec;
        this.waga=waga;
        this.wiek=wiek;
        this.wzrost=wzrost;
        this.wagaDocelowa=wagaDocelowa;
    }

    @Override
    public String test(){ return nazwisko;}


    private float ObliczBmi(float wzrost, float waga) {
        

        return roundTo2DecimalPlace(waga/(wzrost*wzrost));
    }

    public static float roundTo2DecimalPlace(float value) {
        return (float) (Math.round(value * 100.0)/ 100.0);
    }

    protected double ObliczZapotrzebowanie(float wzrost , float waga, int wiek, boolean plec, float k) {
        double ppm;
        if(plec==true){
            ppm=66.47 + (13.7*waga)+(5 * wzrost *100)- (6.76 *wiek);
        }else{
            ppm=655.1 + (9.567 *waga) + (1.85* wzrost*100)-(4.68* wiek);
        }

        return (int) (ppm*k-500);

    }
    @Override
    protected void edytuj() {

    }

    @Override
    protected void przegladaj() {

    }

    @Override
    protected Trener wyloguj() {

        return null;
    }

}
