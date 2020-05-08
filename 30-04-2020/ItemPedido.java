package testapedido;
public class ItemPedido {
    private int quantidade;
    private Produto produto;
    private float valor;
    
    public ItemPedido(Produto pr, int qtd){
        this.produto = pr;
        this.quantidade = qtd;
    }
    
    public float getValor(){
        this.valor = this.produto.getValor() * this.quantidade;
        return this.valor;
    }
    
}