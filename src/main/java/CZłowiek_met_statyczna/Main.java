package CZłowiek_met_statyczna;

public class Main {
    public static void main(String[] args) {
        IMowiacy jawna = new MowiacyMetodyStatycznej();
        jawna.powiedzCos();

        IMowiacy wLocie = new IMowiacy() {
            @Override
            public void powiedzCos() {
                Czlowiek.przywitajSie();
            }
        };
        wLocie.powiedzCos();

        IMowiacy lambda = () -> Czlowiek.przywitajSie();
        lambda.powiedzCos();

        IMowiacy methodRef = Czlowiek::przywitajSie;
        methodRef.powiedzCos();
    }
}
