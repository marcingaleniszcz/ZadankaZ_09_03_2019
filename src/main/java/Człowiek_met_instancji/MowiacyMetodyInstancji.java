package Człowiek_met_instancji;

public class MowiacyMetodyInstancji implements IMowiacy{
    @Override
    public void powiedzCos() {
        new Czlowiek().ziewnij();
    }
}
