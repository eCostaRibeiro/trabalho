
package campeonatofutebol;

public class Time {
    private int codTime;
    private String nomeTime;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Time(int codTime, String nomeTime) {
        this.codTime = codTime;
        this.nomeTime = nomeTime;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getCodTime() {
        return codTime;
    }
    
    public void setCodTime(int codTime) {
        this.codTime = codTime;
    }
    
    public String getNomeTime() {
        return nomeTime;
    }
    
    public void setNomeTime(String nomeTime) {
        this.nomeTime = nomeTime;
    }
    //</editor-fold>

}
