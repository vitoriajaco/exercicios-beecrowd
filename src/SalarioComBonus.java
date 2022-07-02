import java.util.Scanner;

public class SalarioComBonus {
    public static void main(String[] args) {
        System.out.println("Digite seu nome: ");
        Scanner input = new Scanner(System.in);
        String seuNome = input.next();

        System.out.println("Digite seu salario: ");
        Scanner input2 = new Scanner(System.in);
        double salario = input.nextDouble();
        System.out.println("Valor total de vendas efetuadas: ");

        Scanner input3 = new Scanner(System.in);
        double vendas = input.nextDouble();
        double comissao = 0.15;

        System.out.println(seuNome);
        System.out.println(salario);
        System.out.println(vendas);
        System.out.println("TOTAL = R$" + ((vendas * comissao) + salario));

    }
}
