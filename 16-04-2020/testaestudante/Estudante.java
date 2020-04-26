package testaestudante;
public class Estudante {
    private int codigo;
    private String nome;
    private Data dataNasc;
    private double notaMat;
    private double notaPort;
    private double notaCien;
    private double media;
    private double extra;
    private double total;
 
    public Estudante(int c, String n){
        this.codigo = c;
        this.nome = n;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNotas(double m, double p, double c){
        notaMat = m;
        notaPort = p;
        notaCien = c;
    }
    
    public double calculaMedia(){
        media = ((notaMat+notaPort+notaCien)/3);
        return media;
    }
    
    public double calculaMedia(double e){
        this.extra = e;
        this.total = this.media + e;
        return total;
    }
    
}
