/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import campeonatofutebol.Arbitro;

/**
 *
 * @author Renan
 */
//<editor-fold defaultstate="collapsed" desc="Classe de controle Arbitro">
public class ControleArbitro {
    public boolean cadastrarArbitro (Arbitro arb){
        
        boolean result = false;
        
        if (arb != null && arb.getCodArbitro()!= 0 &&
                arb.getNomeArbitro().length()>0); {
        
        //Pronto para cadastrar
        result = true;
        
    }
                
                return result;
    }
}
//</editor-fold>
