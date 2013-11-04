package campeonatofutebol;

public class Campeonato {
    private int codCamp;
    private int anoCamp;
    private String nomeCamp;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Campeonato(int codCamp, int anoCamp, String nomeCamp) {
        this.codCamp = codCamp;
        this.anoCamp = anoCamp;
        this.nomeCamp = nomeCamp;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getAnoCamp() {
        return anoCamp;
    }
    
    public void setAnoCamp(int anoCamp) {
        this.anoCamp = anoCamp;
    }
    
    public int getCodCamp() {
        return codCamp;
    }
    
    public void setCodCamp(int codCamp) {
        this.codCamp = codCamp;
    }
    
    public String getNomeCamp() {
        return nomeCamp;
    }
    
    public void setNomeCamp(String nomeCamp) {
        this.nomeCamp = nomeCamp;
    }
    //</editor-fold>
}