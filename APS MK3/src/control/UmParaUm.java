
package control;

import java.util.Scanner;
import model.Gerente;
import model.ItemEstoque;
import model.Mercado;
import model.Produto;
import view.Painel;
import view.Login;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class UmParaUm {
    public static void main(String[] args) {
           
           
            
        
            
                
           
    
       
            
          
             
             
             
             
              
    
    }
    public Mercado[] checkMercado(){
            Produto arroz = new Produto();
            arroz.setNomeProduto("arroz");
            arroz.setCodigoProduto(123);
            arroz.setCategoriaProduto("commodities");
            
            
            Produto farinhaTrigo = new Produto();
            farinhaTrigo.setNomeProduto("farinha de trigo");
            
            Produto cafe = new Produto();
            cafe.setNomeProduto("cafe");
            
            Produto leite = new Produto();
            leite.setNomeProduto("leite");
            
            Produto batata = new Produto();
            batata.setNomeProduto("batata");
        
        
            //estoque para o primeiro mercado//
             ItemEstoque[] estoque = new ItemEstoque[15]; //declara array estoque com 15 posiçoes(esse array terá os itens estoques de todos os mercados a princio, caso contrario talvez seja necessario um array para cada mercado)//
             ItemEstoque estoque1 = new ItemEstoque();  //declara um objeto de ItemEstoque, neste caso estoque1//
             estoque1.setQuantidade(2);
             estoque1.setProduto(arroz); //liga o ItemEstoque ao produto//
             estoque[0] = estoque1;         //posiciona o estoque1 no array estoque[] na posiçao [0]//
              
             ItemEstoque estoque2 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque2//
                estoque2.setQuantidade(3);
                estoque2.setProduto(farinhaTrigo);
                estoque[1] = estoque2;
                
            ItemEstoque estoque3 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque3//
                estoque3.setQuantidade(4);
                estoque3.setProduto(cafe);
                estoque[2] = estoque3;  
                
            ItemEstoque estoque4 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque4//
                estoque4.setQuantidade(5);
                estoque4.setProduto(leite);
                estoque[3] = estoque4;     
                
            ItemEstoque estoque5 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque5.setQuantidade(6);
                estoque5.setProduto(batata);
                estoque[4] = estoque5;     
                
                
            //estoque para o segundo mercado//    
            ItemEstoque estoque6 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque6.setQuantidade(2);
                estoque6.setProduto(arroz);
                estoque[5] = estoque6; 
                
            ItemEstoque estoque7 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque7.setQuantidade(6);
                estoque7.setProduto(farinhaTrigo);
                estoque[6] = estoque7; 
                
            ItemEstoque estoque8 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque8.setQuantidade(6);
                estoque8.setProduto(cafe);
                estoque[7] = estoque8; 
                
            ItemEstoque estoque9 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque9.setQuantidade(6);
                estoque9.setProduto(leite);
                estoque[8] = estoque9;     
            
            ItemEstoque estoque10 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque5//
                estoque10.setQuantidade(1);
                estoque10.setProduto(batata);
                estoque[9] = estoque10;   
            
                
            //estoque para o terceiro mercado //
            
            ItemEstoque estoque11 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque11//
                estoque11.setQuantidade(2);
                estoque11.setProduto(arroz);
                estoque[10] = estoque11; 
                
            ItemEstoque estoque12 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque12//
                estoque12.setQuantidade(6);
                estoque12.setProduto(farinhaTrigo);
                estoque[11] = estoque12; 
                
            ItemEstoque estoque13 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque13//
                estoque13.setQuantidade(2);
                estoque13.setProduto(cafe);
                estoque[12] = estoque13; 
                
            ItemEstoque estoque14 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque14//
                estoque14.setQuantidade(2);
                estoque14.setProduto(leite);
                estoque[13] = estoque14;     
            
            ItemEstoque estoque15 = new ItemEstoque(); //declara um objeto de ItemEstoque, neste caso estoque15//
                estoque15.setQuantidade(1);
                estoque15.setProduto(batata);
                estoque[14] = estoque15;  
        
        
             Mercado ricoy = new Mercado(); //declara os objetos de mercado, neste caso ricoy//
            Mercado sonda = new Mercado();
            Mercado carrefur = new Mercado();
            
             ricoy.setNomeMercado("Ricoy");  //coloca nome no atributo nomeMercado//
             ricoy.setCnpj(10);
             ricoy.setItemEstoque(estoque);
             
             sonda.setNomeMercado("sonda");
             sonda.setCnpj(11);
             sonda.setItemEstoque(estoque);
             
             carrefur.setNomeMercado("carrefur");
             carrefur.setCnpj(12);
             carrefur.setItemEstoque(estoque);
             
             Mercado[] mercado = new Mercado[5]; // condiçao for mercados, declara um array mercado que tem 5 posiçoes//
             mercado[0] = ricoy;
             mercado[1] = sonda;
             mercado [2] = carrefur;
             
             return (mercado);
    }
      
    
    
}
