package logicaNegocio;

public class Leon extends Animal{
    private String TipoHabitat;
    public String Leon;

   public Leon(String TipoHabitat, Leon Leon) {
        this.TipoHabitat = TipoHabitat;
       
        
    }

    public Leon(String TipoHabitat, String Leon) {
        this.TipoHabitat = TipoHabitat;
        this.Leon = Leon;
    }
    public String getTipoHabitat() {
        return TipoHabitat;
    }

    public void setTipoHabitat(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }
    
    
    
    

    @Override
    String emitirSonido() {
        return ("Rugido");
    }

    @Override
    String obtenerDieta() {
        return ("Carnivoro");
    }
    
}
