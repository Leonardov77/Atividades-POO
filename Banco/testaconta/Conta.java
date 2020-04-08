package testaconta;
public class Conta {
    Data dataDeAbertura;  
    String titular;
    int numero;
    String agencia;
    double saldo;
    double rendimento;
    
    void saca(double valor){
        if (this.saldo > valor) {
            this.saldo -= valor;
        }
    }
    
    void deposita(double valor){
        this.saldo += valor;
    }
    
    double calculaRendimento(){
        double rendimento = saldo * 0.1;
        return rendimento;
    }
    
    String recuperaDadosParaImpressao(){
        String dados = "Titular: " + this.titular;
        dados += "\nNúmero: " + this.numero;
        dados += "\nDia: " + this.dataDeAbertura.dia;
        dados += "\nMes: " + this.dataDeAbertura.mes;
        dados += "\nAno: " + this.dataDeAbertura.ano;
        return dados;
    }
    
}
