package Exercicios_Estrutura_While;
import java.util.Scanner;

public class Ex_3_estrutura_While {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("_________________________________");
		System.out.println("  CODIGO     ESPECIFICAÇÃO       ");
		System.out.println("  1          Ácool               ");
		System.out.println("  2          Gasolina            ");
		System.out.println("  3          Diesel              ");
		System.out.println("  4          Fim                 ");
		System.out.println("_________________________________");
		
		System.out.printf("%n%nInsira o o código da sua preferência: %n");
		
		int cod = sc.nextInt();
		int alc=0, gas=0, die=0;
		
		while(cod!=4) {
			System.out.println("Insira o o código da sua preferência: ");
			
			switch(cod){
			case 1: {
				alc +=1;
				cod = sc.nextInt();
				break;
			}
			case 2:{
				gas +=1;
				cod = sc.nextInt();
				break;
			}
			case 3:{
				die +=1;
				cod = sc.nextInt();
				break;
			}
			default: {
				cod = sc.nextInt();
				break;
			}
			}
		}
		
		System.out.println("Muito Obrigada! ");
		System.out.printf("%nAlcool: %d", alc);
		System.out.printf("%nGasolina: %d", gas);
		System.out.printf("%nDiesel: %d", die);
		
		sc.close();
	}

}
