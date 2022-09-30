public class OutrasAtividades {
    public static void main (String [] args){
        // Primitivos:
        byte inteiro = 10;
        System.out.println("O número inteiro byte é "+ inteiro);
        short numero1 = 15;
        System.out.println("O número inteiro short é "+ numero1);
        long numero2 = 16;
        System.out.println("O número inteiro long é "+ numero2);
        int numero3 = 22;
        System.out.println("O número inteiro int é "+ numero3);

        //Não primitivos:
        String texto = "Sou uma String e sou um tipo não primitivo";
        System.out.println(texto);


        //Realizando Casting
        double valorDoLivro = 60;
        int novoValor =  (int) valorDoLivro;
        System.out.println(novoValor);

        //Operador ternário:
        double v1 = 10;
        double v2 = 20;
        double valor = v1 > v2 ? 100 :0;

        /* if (v1>v2){
            valor = 100;
        } else{
            valor = 0;
        }*/

        System.out.println("O valor é "+ valor);

    }
}
