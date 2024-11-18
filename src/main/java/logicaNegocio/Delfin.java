package logicaNegocio;

public class Delfin extends Animal {

    private String TipoHabitat;
    public String Delfin;

    public Delfin(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }

    public Delfin(String TipoHabitat, String Delfin) {
        this.TipoHabitat = TipoHabitat;
        this.Delfin = Delfin;
    }

    public String getTipoHabitat() {
        return TipoHabitat;
    }

    public void setTipoHabitat(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }

    @Override
    String emitirSonido() {
        return ("Chirrido");
    }

    @Override
    String obtenerDieta() {
        return ("Pescado");
    }
}
