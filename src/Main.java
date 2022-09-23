import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Insira o codigo da peça");
		int code1 = sc.nextInt();
		System.out.println("Insira quantas peças está no carrinho");
		int quant1 = sc.nextInt();
		System.out.println("Insira o valor da peça");
		double price1 = sc.nextDouble();
		
		double pricefinal = quant1 * price1;
		
		System.out.println("O valor a pagar e de R$: " + pricefinal);
				

	}

}
