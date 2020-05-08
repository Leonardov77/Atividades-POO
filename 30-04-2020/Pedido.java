package testapedido;
public class Pedido {
    private float valor_total;
    private ItemPedido item;
    
    public void adicionar_item(ItemPedido i){
        this.item = i;
        this.valor_total = this.valor_total + this.item.getValor();
    }
    
    public float obter_total(){
        return this.valor_total;
    }
  
}