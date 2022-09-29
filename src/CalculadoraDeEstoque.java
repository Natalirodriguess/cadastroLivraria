public class CalculadoraDeEstoque {

    public static void main(String [] args){
        double livroJava8;
        double livroTDD;

        livroJava8 = 58.50;
        livroTDD = 60.10;

        double soma;
        soma = livroJava8 + livroTDD;

        System.out.println("O estoque é de R$"+ soma+" em livros");
    }
}
