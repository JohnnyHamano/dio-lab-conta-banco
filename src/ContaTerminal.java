import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal
{
	public static void main(String[] args) throws Exception
	{
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Olá! Seja bem-vindo(a) ao nosso banco.");

		System.out.println("Digite o seu nome completo: ");
		String nomeCliente = scanner.next();

		System.out.println("Digite sua agência bancária: ");
		String agencia = scanner.next();

		int numero;
		do {
			System.out.println("Por favor, digite o número de sua conta bancária: ");

			while (!scanner.hasNextInt()) {
				System.out.println("Digite apenas os números de sua conta: ");
				scanner.next();
			}

			numero = scanner.nextInt();
		} while (numero <= 0);
		
		double saldo;
		do {
			System.out.println("Digite o valor de seu saldo bancário: ");

			while (!scanner.hasNextDouble()) {
				System.out.println("Digite apenas o valor numérico de seu saldo: ");
				scanner.next();
			}

			saldo = scanner.nextDouble();
		} while (saldo <= 0);

		scanner.close();

		System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$%.2f já está disponível para saque.", saldo);
	}
}