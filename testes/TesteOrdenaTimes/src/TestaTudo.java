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
        String[] vetor = new String[]{"Time1", "Time2", "Time3", "Time4"};
        int rodadas = ((vetor.length * (vetor.length - 1) / 2));
        int cont = 1;
       
        String[] vetorAux = new String[vetor.length];
        System.arraycopy(vetor, 0, vetorAux, 0, vetor.length);
        
        //TURNO
        //System.out.print("...........TURNO........\n");
        
        while (cont <= (rodadas / 2)){
            System.out.println(cont + "ª RODADA...... \n");
            
            for (int i = 0; i < vetorAux.length; i++){
                if ((i % 2) != 0){
                    System.out.print(" X " + vetorAux[i] + "\n");
                } else{
                    System.out.print(vetorAux[i]);
                }
            }
            
            System.out.println("\n");


            //rotaciona elementos para próxima rodada
            int esq = 1;
            int dir = (vetorAux.length - 1);
            while (esq < dir){
                String temp = vetorAux[esq]; 
                vetorAux[esq]  = vetorAux[dir];
                vetorAux[dir] = temp;

                //esq++;
                dir--;
            }
            cont++;
        }
        
        
     
        //RETURNO
        String[] vetorAuxI = new String[vetor.length];
        System.arraycopy(vetor, 0, vetorAuxI, 0, vetor.length);
        
        //inverte o vetor
        int inicio = 0;
        int fim = (vetorAux.length - 1);
        while (inicio < fim){
            String temp = vetorAuxI[inicio]; 
            vetorAuxI[inicio]  = vetorAuxI[fim]; 
            vetorAuxI[fim] = temp;
            inicio++;
            fim--;
            }// final da inversão do vetor
        
        System.out.print("\n...........RETURNO........\n");
        while (cont <= rodadas){
            System.out.println(cont + "ª RODADA...... \n");
            
            for (int i = 0; i < vetorAuxI.length; i++){                
                if ((i % 2) != 0){
                    System.out.print(" X " + vetorAuxI[i] + "\n");
                } else{
                    System.out.print(vetorAuxI[i]);
                }
            }
            
            System.out.println("\n");


            //rotaciona elementos para próxima rodada
            int esq = 1;
            int dir = (vetorAuxI.length - 1);
            while (esq < dir){
                String temp = vetorAuxI[esq]; 
                vetorAuxI[esq]  = vetorAuxI[dir]; 
                vetorAuxI[dir] = temp;

                //esq++;
                dir--;
            }
            cont++;
        }

    
    }//fim main
}//fim classe
