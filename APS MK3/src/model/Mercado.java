package model;

import java.util.ArrayList;


public class Mercado {
    String nomeMercado;
    float cnpj;
    ItemEstoque[] estoque;
 
    
    
    
    public ItemEstoque[] getEstoque() {
        return estoque;
    }

    public void setEstoque(ItemEstoque[] estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    public Mercado() { //cria array 5 produtos//
        this.estoque = new ItemEstoque[5];
    }

    public ItemEstoque[] getItemEstoque() {
        return estoque;
    }

    
    public void setItemEstoque(ItemEstoque[] estoque) {
        this.estoque = estoque;
    }
    
    
    
    
    
    public String getNomeMercado() {
        return nomeMercado;
    }

    public void setNomeMercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
    }

    public float getCnpj() {
        return cnpj;
    }

    public void setCnpj(float cnpj) {
        this.cnpj = cnpj;
    }
    
  
    }
    

