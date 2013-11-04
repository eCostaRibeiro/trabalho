
package campeonatofutebol;

public class Jogador {
    private int codJogador;
    private String nomeJogador;

    //<editor-fold defaultstate="collapsed" desc="Construtor">
    public Jogador(int codJogador, String nomeJogador) {
        this.codJogador = codJogador;
        this.nomeJogador = nomeJogador;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters e Setters">
    public int getCodJogador() {
        return codJogador;
    }
    
    public void setCodJogador(int codJogador) {
        this.codJogador = codJogador;
    }
    
    public String getNomeJogador() {
        return nomeJogador;
    }
    
    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    //</editor-fold>
}
