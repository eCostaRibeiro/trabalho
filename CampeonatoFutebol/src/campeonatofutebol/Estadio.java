package campeonatofutebol;

public class Estadio {
    private int codEstadio;
    private String nomeEstadio;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Estadio(int codEstadio, String nomeEstadio) {
        this.codEstadio = codEstadio;
        this.nomeEstadio = nomeEstadio;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getCodEstadio() {
        return codEstadio;
    }
    
    public void setCodEstadio(int codEstadio) {
        this.codEstadio = codEstadio;
    }
    
    public String getNomeEstadio() {
        return nomeEstadio;
    }
    
    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }
    //</editor-fold>
    
}
