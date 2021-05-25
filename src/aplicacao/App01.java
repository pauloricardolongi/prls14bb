package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

public class App01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);		
		List<Funcionario>lista= new ArrayList<>();
		
		System.out.print("Entre com o número de funcionários?");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + " dados:");
			System.out.print("Tercerizado (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Adicionar Gastos: ");
				double adicionarGastos = sc.nextDouble();
				Funcionario func = new FuncionarioTercerizado(nome, horas, valorPorHora, adicionarGastos);
				lista.add(func);
			
			}
			else {
				
				Funcionario func= new Funcionario(nome,horas,valorPorHora);
				lista.add(func);
			}
		}
		System.out.println();
		System.out.println("PAGAMENTO:");
		for (Funcionario func : lista) {
			System.out.println(func.getNome()+ "- $"
		    + String.format("%.2f",func.pagamento()));
		}
		
		sc.close();

	}


	}


