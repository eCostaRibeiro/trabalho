/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controles;

import campeonatofutebol.Campeonato;

/**
 *
 * @author Renan
 */
public class ControleCampeonato {
    public boolean cadastrarCampeonato (Campeonato camp){
        
        boolean result = false;
        
        if (camp != null && camp.getCodCamp()!= 0 &&
                camp.getNomeCamp().length()>0 && camp.getAnoCamp() != 0); {
        
        //Pronto para cadastrar
        result = true;
        
    }
        
        return result;
    }
}
