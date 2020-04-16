package testa_conta;
public class Testa_Conta {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        
        c1.titular = "Hugo";
        c1.numero = 123;
        c1.agencia = "45678-9";
        c1.saldo = 50.0;
        Data datac1 = new Data();
        c1.dataDeAbertura = datac1;
        datac1.dia = 21;
        datac1.mes = 11;
        datac1.ano = 1998;
        
        c1.deposita(100.0);
        
        System.out.println(c1.recuperaDadosParaImpressao());
    }
}