package Exercicio_Estrutura_Condicional;
import java.util.Locale;
import java.util.Scanner;

public class Ex_5_estrutura_condicional {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod, qtd;
		double total=0;

		// Tabela de preços
		System.out.println("________________________________________________");
		System.out.println("  CODIGO     ESPECIFICAÇÃO        PREÇO         ");
		System.out.println("  1          Cachorro quente      R$ 4.00       ");
		System.out.println("  2          X-Salada             R$ 4.50       ");
		System.out.println("  3          X-Bacon              R$ 5.00       ");
		System.out.println("  4          Torrada Simples      R$ 2.00       ");
		System.out.println("  5          Refrigerante         R$ 1.50       ");
		System.out.println("________________________________________________");
		
		System.out.printf("%nInsira o código que deseja: %n");
		cod = sc.nextInt();
		System.out.printf("Insira a quantidade que deseja: %n");
		qtd = sc.nextInt();
		
		switch (cod) {
		case 1: {
			total = 4.0 * qtd;
			break;
		}
		case 2: {
			total = 4.50 * qtd;
			break;
		}
		case 3: {
			total = 5.0 * qtd;
			break;
		}
		case 4: {
			total = 2.0 * qtd;
			break;
		}
		case 5: {
			total = 1.50 * qtd;
			break;
		}
		default: {
			System.out.println("Insira um número correto!");
		}
		}
		
		System.out.printf("%nTotal: R$ %.2f", total);
		sc.close();
	}

}
