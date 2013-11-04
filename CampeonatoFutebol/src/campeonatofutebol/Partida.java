package campeonatofutebol;

public class Partida {
    private int codPartida;
    private Campeonato oCampeonato;
    private Rodada aRodada;
    private Estadio oEstadio;
    private Time time1;
    private Time time2;
    private Arbitro oArbitro;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Partida(int codPartida, Campeonato oCampeonato, Rodada aRodada, Estadio oEstadio, Time time1, Time time2, Arbitro oArbitro) {
        this.codPartida = codPartida;
        this.oCampeonato = oCampeonato;
        this.aRodada = aRodada;
        this.oEstadio = oEstadio;
        this.time1 = time1;
        this.time2 = time2;
        this.oArbitro = oArbitro;
    }
    //</editor-fold>
       
    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public Rodada getaRodada() {
        return aRodada;
    }
    
    public void setaRodada(Rodada aRodada) {
        this.aRodada = aRodada;
    }
    
    public int getCodPartida() {
        return codPartida;
    }
    
    public void setCod(int codPartida) {
        this.codPartida = codPartida;
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
