package Człowiek_met_instancji;

public class Main {
    public static void main(String[] args) {


        IMowiacy jawna = new MowiacyMetodyInstancji();
        jawna.powiedzCos();

        IMowiacy wLocie = new IMowiacy() {
            @Override
            public void powiedzCos() {
                new Czlowiek().ziewnij();
            }
        };
        wLocie.powiedzCos();

        IMowiacy lambda = () -> new Czlowiek().ziewnij();
        lambda.powiedzCos();

        Czlowiek czlowiek = new Czlowiek();
        IMowiacy refl = czlowiek::ziewnij;
        refl.powiedzCos();
        IMowiacy ref2 = new Czlowiek()::ziewnij;
        ref2.powiedzCos();
    }
}

