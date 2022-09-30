public class CalculadoraDeEstoque {

    public static void main(String [] args){
        double livroJava8 = 58.50;
        double livroTDD = 60.23;
        double soma = livroJava8 + livroTDD;

        System.out.println("O estoque é de R$"+ soma +" em livros");

        if (soma < 150) {
            System.out.println("O estoque de livro está baixíssimo!");
        } else if (soma > 2500) {
            System.out.println("O seu estoque de livro está muito alto!");
        } else {
            System.out.println("O seu estoque está ok.");
        }
    }
}
