package testapedido;
public class Produto {
    private int codigo;
    private float valor;
    private String descricao;
    
    public Produto(int c, float v, String d){
        this.codigo = c;
        this.valor = v;
        this.descricao = d;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public float getValor(){
        return this.valor;
    }
    
    public String getDescricao(){
        return this.descricao;
    }
    
}