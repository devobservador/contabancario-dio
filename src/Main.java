import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    Scanner entradas = new Scanner(System.in);
        double saldo_= 237.48;

        System.out.println("Por favor, digite o número da Agência !");
        int numero_agencia = entradas.nextInt();

        System.out.println("Digite a sua agência agora!!");
        String agencia = entradas.next();

        System.out.println("Digite o seu nome !");
        String nome = entradas.next();

        System.out.println("Olá " +nome+ ",obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ",  conta "+numero_agencia+ " e seu saldo  " +saldo_+" já está disponível para saque");





    }
}