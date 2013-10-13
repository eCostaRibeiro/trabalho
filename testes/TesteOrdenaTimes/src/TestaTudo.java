/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stwuart
 */
public class TestaTudo {
    public static void main(String[] args){
        String[] vetor = new String[]{"Time1", "Time2", "Time3", "Time4", "Time5", "Time6", "Time7", "Time8"};
        int rodadas = ((vetor.length * (vetor.length - 1) / (vetor.length / 2)));
        int cont = 1;
       
        String[] vetorAux = new String[vetor.length];
        System.arraycopy(vetor, 0, vetorAux, 0, vetor.length);
        
        //TURNO
        System.out.print("...................TURNO\n");
        
        while (cont <= (rodadas / 2)){
            System.out.println(cont + "ª RODADA...... \n");
            
            for (int i = 0; i < (vetorAux.length / 2); i++){
                    System.out.println(vetorAux[i] + " X " + vetorAux[(vetorAux.length - 1) - i]);
            }
            
            //pula linha entre rodadas
            System.out.println("\n");


            //rotaciona elementos para próxima rodada
            int esq = 1;
            int dir = (vetorAux.length - 1);
            
            while (esq < dir){
                String temp = vetorAux[esq]; 
                vetorAux[esq]  = vetorAux[dir];
                vetorAux[dir] = temp;
                dir--;
            }//fim while ordenação
            
            cont++;
        }//fim while da rodada
        
        
        //RETURNO
        System.out.print("...................RETURNO\n");
        
        while (cont <= rodadas){
            System.out.println(cont + "ª RODADA...... \n");
            
            for (int i = 0; i < (vetorAux.length / 2); i++){
                    System.out.println(vetorAux[(vetorAux.length - 1) - i] + " X " + vetorAux[i]);
            }
            
            System.out.println("\n");


            //rotaciona elementos para próxima rodada
            int esq = 1;
            int dir = (vetorAux.length - 1);
            
            while (esq < dir){
                String temp = vetorAux[esq]; 
                vetorAux[esq]  = vetorAux[dir];
                vetorAux[dir] = temp;
                dir--;
            }//fim while ordenação
            
            cont++;
        }//fim while da rodada

    
    }//fim main
}//fim classe