/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import campeonatofutebol.Time;

/**
 *
 * @author Renan
 */
//<editor-fold defaultstate="collapsed" desc="Classe de controle Time">
public class ControleTime {
    public boolean cadastrarTime (Time time){
        
        boolean result = false;
        
        if (time != null && time.getCodTime() != 0 &&
                time.getNomeTime().length()>0); {
        
        //Pronto para cadastrar
        result = true;
        
    }
                
                return result;
    }
}
//</editor-fold>
