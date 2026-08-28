import java.util.Scanner;

public class Comissao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double salario;
        double vendas;
        String nome;

        System.out.print("Qual seu nome? ");
        nome = entrada.nextLine();

        System.out.print("Qual seu salario fixo? ");
        salario = entrada.nextDouble();

        System.out.print("Valor de vendas totais do mes? ");
        vendas = entrada.nextDouble();

        System.out.println(nome + ", seu salario total, com a comissao ficara em: "
                + (vendas * 0.15 + salario)
                + ". Agradecemos pelo seu contato.");

        entrada.close();
    }
}
