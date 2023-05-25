package model;



public class ItemEstoque {
    int quantidade;
    
    float valorItem;
    Produto produto;

        public Produto getProduto() {
            return produto;
        }

        public void setProduto(Produto produto) {
            this.produto = produto;
        }

       
        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public float getValorItem() {
            return valorItem;
        }

        public void setValorItem(float valorItem) {
            this.valorItem = valorItem;
    }


    
    
       
          
}
