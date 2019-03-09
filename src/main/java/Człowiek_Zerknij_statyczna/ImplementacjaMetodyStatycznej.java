package Człowiek_Zerknij_statyczna;

public class ImplementacjaMetodyStatycznej implements IPatrzacy {
    @Override
    public void patrzNa(String cos) {
        Czlowiek.zerknijNa(cos);
    }
}
