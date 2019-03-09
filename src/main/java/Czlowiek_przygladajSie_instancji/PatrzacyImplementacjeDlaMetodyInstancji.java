package Czlowiek_przygladajSie_instancji;

public class PatrzacyImplementacjeDlaMetodyInstancji implements IPatrzacy {
    @Override
    public void patrzNa(String cos) {
        new Czlowiek().przygladajSie(cos);
    }

};


