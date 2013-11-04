/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import campeonatofutebol.Estadio;

/**
 *
 * @author Renan
 */
//<editor-fold defaultstate="collapsed" desc="Classe de controle Estadio">
public class ControleEstadio {
    public boolean cadastrarEstadio (Estadio etd){
        
        boolean result = false;
        
        if (etd != null && etd.getCodEstadio()!= 0 &&
                etd.getNomeEstadio().length()>0); {
        
        //Pronto para cadastrar
        result = true;
        
    }
                
                return result;
    }
    //</editor-fold>
}
