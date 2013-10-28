package campeonatofutebol;

public class Partida {
    private int cod;
    private Campeonato oCampeonato;
    private Rodada aRodada;
    private Estadio oEstadio;
    private Time time1;
    private Time time2;
    private Arbitro oArbitro;

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public Rodada getaRodada() {
        return aRodada;
    }
    
    public void setaRodada(Rodada aRodada) {
        this.aRodada = aRodada;
    }
    
    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public Arbitro getoArbitro() {
        return oArbitro;
    }
    
    public void setoArbitro(Arbitro oArbitro) {
        this.oArbitro = oArbitro;
    }
    
    public Campeonato getoCampeonato() {
        return oCampeonato;
    }
    
    public void setoCampeonato(Campeonato oCampeonato) {
        this.oCampeonato = oCampeonato;
    }
    
    public Estadio getoEstadio() {
        return oEstadio;
    }
    
    public void setoEstadio(Estadio oEstadio) {
        this.oEstadio = oEstadio;
    }
    
    public Time getTime1() {
        return time1;
    }
    
    public void setTime1(Time time1) {
        this.time1 = time1;
    }
    
    public Time getTime2() {
        return time2;
    }
    
    public void setTime2(Time time2) {
        this.time2 = time2;
    }
    //</editor-fold>
        
}
