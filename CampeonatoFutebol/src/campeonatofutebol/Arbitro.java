package campeonatofutebol;

public class Arbitro {
    private int codArbitro;
    private String nomeArbitro;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Arbitro(int codArbitro, String nomeArbitro) {
        this.codArbitro = codArbitro;
        this.nomeArbitro = nomeArbitro;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getCodArbitro() {
        return codArbitro;
    }
    
    public void setCodArbitro(int codArbitro) {
        this.codArbitro = codArbitro;
    }
    
    public String getNomeArbitro() {
        return nomeArbitro;
    }
    
    public void setNomeArbitro(String nomeArbitro) {
        this.nomeArbitro = nomeArbitro;
    }
    //</editor-fold>
  
}
