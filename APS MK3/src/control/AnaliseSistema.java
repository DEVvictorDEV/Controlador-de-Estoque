
package control;
import model.Mercado;


public class AnaliseSistema {
 
String[] retornos = new String[15];
    
    
           
          
    public String[] analiseMercado(Mercado[]lm){    //Criando array lm=lista mercado
        try{ 
        for(int i=0; i<=2; i++){
            
            //System.out.println("Nome: " + lm[i].getNomeMercado());
            if(i==0){
                for(int r=0; r<=4; r++){
                    if(lm[i].getItemEstoque()[r].getQuantidade()<10){
                        retornos[r]=(lm[i].getNomeMercado()+ " estoque baixo: "+ " - "+lm[i].getItemEstoque()[r].getQuantidade()+ " - "+lm[i].getItemEstoque()[r].getProduto().getNomeProduto());
                    }
                }   
            }
            if (i==1){
                for(int r=5; r<=9; r++){
                    if(lm[i].getItemEstoque()[r].getQuantidade()<10){
                        retornos[r]=(lm[i].getNomeMercado()+" estoque baixo "+ " - "+lm[i].getItemEstoque()[r].getQuantidade()+ " - "+lm[i].getItemEstoque()[r].getProduto().getNomeProduto());
                    }
                }  
            
            
            } 
            if (i==2){
                for(int r=10; r<=14; r++){
                    if(lm[i].getItemEstoque()[r].getQuantidade()<10){
                        retornos[r]=(lm[i].getNomeMercado()+" estoque baixo "+ " - "+lm[i].getItemEstoque()[r].getQuantidade()+ " - "+lm[i].getItemEstoque()[r].getProduto().getNomeProduto());
                    }
                }  
            
            
            } 
         
            }
        }
        catch (NullPointerException e) {
        System.out.println("erro: " + e);
    }
        return retornos ;   
            
        
        }
    
    
    
}      
     
    
    
    
    
    
    
