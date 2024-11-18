package logicaNegocio;

public class Perro extends Animal{
private String TipoHabitat;
    public String Perro;

    public Perro(String TipoHabitat) {
        this.TipoHabitat = TipoHabitat;
    }

    public Perro(String TipoHabitat, String Perro) {
        this.TipoHabitat = TipoHabitat;
        this.Perro = Perro;
    }
    

    
    
    @Override
    String emitirSonido() {
        return ("Ladrido");
    }

    @Override
    String obtenerDieta() {
        return ("Omnívoro");
    }
    
   public String interactuarConHumano(){
       
    return ("El perro mueve la cola y ladra de felicidad");
       
   }
}
