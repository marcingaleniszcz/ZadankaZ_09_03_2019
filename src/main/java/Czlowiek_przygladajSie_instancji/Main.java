package Czlowiek_przygladajSie_instancji;

public class Main {
    public static void main(String[] args) {
        IPatrzacy jawna = new PatrzacyImplementacjeDlaMetodyInstancji();
        jawna.patrzNa("stół");

        IPatrzacy patrzacyNiejawna = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                new Czlowiek().przygladajSie(cos);

            }
        };
        Czlowiek czlowiek = new Czlowiek();
        patrzacyNiejawna.patrzNa("stół");
        IPatrzacy lambda = (costam) -> czlowiek.przygladajSie(costam);
        IPatrzacy ref = czlowiek::przygladajSie;
        ref.patrzNa("stół");
     }
}
