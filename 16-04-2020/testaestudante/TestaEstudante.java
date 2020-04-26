package testaestudante;
public class TestaEstudante {
    public static void main(String[] args) {
        
        Estudante e1 = new Estudante(1, "José");
        
        e1.setNotas(6, 8, 7);
        e1.calculaMedia(2);
        
        System.out.println("Nome: " +e1.getNome());
        System.out.println("Código: " +e1.getCodigo());
        System.out.println("Media: " +e1.calculaMedia());
    }
}