package testa_conta;
public class Conta {
    public Data dataDeAbertura;  
    public String titular;
    public int numero;
    public String agencia;
    public double saldo;
    private double rendimento;
    
    private void saca(double valor){
        if (this.saldo > valor) {
            this.saldo -= valor;
        }
    }
    
    public void deposita(double valor){
        this.saldo += valor;
    }
    
    private double calculaRendimento(){
        double rendimento = saldo * 0.1;
        return rendimento;
    }
    
    protected String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nSaldo: " + this.saldo;
        dados += "\nRendimento mensal: " + calculaRendimento();
        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMes: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }
}