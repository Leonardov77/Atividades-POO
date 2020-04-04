/*
 * @description Classe principal para teste da classe 'Veiculo'.
 * @license GPLv2
 */
package veiculoteste;

/**
 *
 * @author samuel
 */
public class VeiculoTeste {

    public static void mostraMensagem() {
        System.out.println("-------------------------------");
        System.out.println("Sistema de Veiculos");
        System.out.println("-------------------------------");
    }
    
    /**
     * @param args Não utilizado neste exemplo.
     */
    public static void main(String[] args) {
        
        Veiculo carro1 = new Veiculo();
        
        carro1.marca = "VW";
        carro1.modelo = "Gol";
        carro1.nrPortas = 4;
        
        carro1.ligarVeiculo();
        
        carro1.dirigir();
        
        Veiculo carro2 = new Veiculo();
        
        carro2.marca = "Ford";
        carro2.modelo = "Fusion";
        carro2.nrPortas = 4;
        
        carro2.dirigir();
        
    }
    
}