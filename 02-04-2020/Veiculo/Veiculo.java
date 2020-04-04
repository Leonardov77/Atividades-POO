/*
 * @description Classe de exemplo representando um veículo, com atributos
 *              e métodos
 * @license GPLv2
 */
package veiculoteste;

/**
 *
 * @author Samuel da Silva Feitosa
 * @date 26-03-2020
 */
public class Veiculo {
    
    String marca;
    String modelo;
    int nrRodas;
    int nrPortas;
    double consumoCidade;
    double consumeEstrada;
    boolean ligado;
 
    public String toString() {
        return "Marca: " + this.marca + " Modelo: " + this.modelo + " Nr. Portas: " + nrPortas;
    }
    
    public void ligarVeiculo() {
        this.ligado = true;
    }
    
    public void desligarVeiculo() {
        this.ligado = false;
    }
    
    public void dirigir() {
        if (this.ligado) {
            System.out.println("Estou dirigindo o carro " + this.modelo);
        }
        else {
            System.out.println("O carro " + this.modelo + " está desligado. Impossível dirigir!");
        }
    }        
    
}