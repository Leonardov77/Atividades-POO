package testapedido;

import java.util.Scanner;

public class TestaPedido {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Produto pr[] = new Produto[10];
        
        pr[0] = new Produto(1, 4.55f, "Gel para cabelos");
        pr[1] = new Produto(2, 9.99f, "Maionese");
        pr[2] = new Produto(3, 1.99f, "Extrato de Tomate");
        pr[3] = new Produto(4, 2.99f, "Creme de Leite");
        pr[4] = new Produto(5, 5.99f, "Cotonetes");
        pr[5] = new Produto(6, 1.49f, "Detergente");
        pr[6] = new Produto(7, 6.99f, "Amaciante");
        pr[7] = new Produto(8, 3.99f, "Leite");
        pr[8] = new Produto(9, 4.99f, "Refrigerante");
        pr[9] = new Produto(10, 7.99f, "Pasta de Dente");
        
        int num = 0;
        int j = 0;
        int qtd;
        
        System.out.println("------------------------------");
        System.out.println("Menu de opções: ");
        System.out.println("1 - Adicionar item ao pedido.");
        System.out.println("2 - Apresentar o total pedido.");
        System.out.println("Escolha: ");
        num = sc.nextInt();
        
        Pedido ped = new Pedido();
        
        while(1 == 1){
            if(num == 1){
                System.out.println("Digite o vetor do produto: ");
                j = sc.nextInt();
                System.out.println("Quantidade do produto: ");
                qtd = sc.nextInt();
                ItemPedido p = new ItemPedido(pr[j], qtd);
                ped.adicionar_item(p);
                System.out.println("------------------------------");
                System.out.println("Menu de opções: ");
                System.out.println("1 - Adicionar item ao pedido.");
                System.out.println("2 - Apresentar o total pedido.");
                System.out.println("Escolha: ");
                num = sc.nextInt();
            }else if(num == 2){
                System.out.println("Valor total: " + ped.obter_total());
                break;
            }else{
                System.out.println("Código inválido! ");
                break;
            }
        }
        
    }
}