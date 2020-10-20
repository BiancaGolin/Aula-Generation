import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String item;
		int opcao;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> estoque = new ArrayList();
		
		System.out.println("==Controle de Estoque==");
		
		do {
			System.out.println("--Menu--");
			System.out.println("1 - Adicionar item\n2 - Remover item\n3 - Atualizar item\n4 - Apresentar item\n0 - Sair");
			opcao = sc.nextInt();
		
			switch(opcao) {
			case 1:
				System.out.println("Item: ");
				item = sc.next();
				estoque.add(item);
				break;
			case 2:
				System.out.println("Item a ser removido: ");
				item = sc.next();
				if (estoque.contains(item)) {
					estoque.remove(item);
					System.out.println(item + " foi removido da sua sacola de compras!");
				}
				else {
					System.out.println("Item não encontrado na lista");
				}
				break;
			case 3:
				System.out.println("Deseja atualizar qual item?");
				
				for (String itens : estoque) {							
					System.out.println("Item: " + itens);
				}
				
				item = sc.next();
				
				if (estoque.contains(item)) {
					System.out.println("Insira o novo item: ");
					String item2 = sc.next();
					estoque.add(estoque.indexOf(item), item2);;
					System.out.println(item2 + " foi atualizado em sua sacola de compras!");
				}
				else {
					System.out.println("Item não encontrado na lista");
				}
				
				break;
			case 4:
				System.out.println("Sacola");
				for (String itens : estoque) {
					
					System.out.println("Item: " + itens);
				}
				break;
			default:
				if (opcao > 0) {
					System.out.println("Opção inválida");
				}
				
				
			}
			
		} while(opcao != 0);
		
		
		
		
		
	}

}
