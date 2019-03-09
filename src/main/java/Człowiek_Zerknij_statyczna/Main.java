package Człowiek_Zerknij_statyczna;

public class Main {
    public static void main(String[] args) {


        IPatrzacy jawna = new ImplementacjaMetodyStatycznej();
        jawna.patrzNa("tablica");

        IPatrzacy wLocie = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                Czlowiek.zerknijNa(cos);
            }
        };
        wLocie.patrzNa("stół");

        IPatrzacy lambda = (przedmiot) -> Czlowiek.zerknijNa(przedmiot);

        IPatrzacy ref = Czlowiek::zerknijNa;
        ref.patrzNa("kabanos");
    }
}
