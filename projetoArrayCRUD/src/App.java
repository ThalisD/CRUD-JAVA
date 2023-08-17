import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        int fim = 0;
        int atu = 0;
        int del = 0;
        int opcao = 0;
        int id = 0;
        int i = 0;
        char ctz = 'n';
        String nome;
        String cpf;
        String[][] clientes = new String [100][10];
        while (opcao !=  6) {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner	

          
            switch (opcao) {
                case 1:
                	//Registrar
                    System.out.println("\n===---===			Cadastro de Cliente			===---===");
                    System.out.println("\nDigite o Nome do Cliente: ");
                    nome = scanner.nextLine();
                    System.out.println("Digite o CPF do Cliente:");
                    cpf = scanner.nextLine();
                    id = i;
                    clientes[i][0] = "ID: " + Integer.toString(id);
                    clientes[i][1] = "Nome: " + nome;
                    clientes[i][2] = "CPF: " + cpf;
                    i++;
                    fim = 1;
                    System.out.println("\n====	Cliente Cadastrado	====");
                    System.out.println("------------------------------------\n");
                    break;
                case 2:
                	//Listar
                    System.out.println("\n===---===			Listagem			===---===\n");
                    for(int l = 0; l < clientes.length; l++) {
                    	for(int c = 0; c < clientes[c].length; c++) {
                    		if(clientes[l][c] != null) {
                    			if(c < 6) {
                    				System.out.println("- " + clientes[l][c]);                    				
                    			}
                    		}else {
                    	}
                    }                    
                    fim = 2;                  	
                    } break;                  
                case 3:
             
                	//Alterar
                    System.out.println("\n===---===		Informe o ID a ser Alterado		---===\n");
                    atu= scanner.nextInt();
                    scanner.nextLine();
                    if(atu < i) {
                    	 System.out.println("Nome");
                    	 System.out.print("->");
                    	 nome = scanner.nextLine();
                    	 System.out.println("CPF");
                    	 System.out.print("->");
                    	 cpf = scanner.nextLine();
                    	 clientes[atu][0] = "ID: " + Integer.toString(atu);
                         clientes[atu][1] = "Nome: " + nome;
                         clientes[atu][2] = "CPF: " + cpf;
                         System.out.println("===		Informações atualizadas		===");
                    }else {
                    	 System.out.println("== ID não existente ==");
                    }
                    fim = 3;
                    break;
                case 4:
                	//Deletar
                    System.out.println("=--=	Tem certeza que deseja deletar algum cliente? [ s - n ]		=--=");
                    ctz = scanner.next().charAt(0);
                    if(ctz == 's' || ctz == 'S') {
                    	System.out.println("=-=	Informe o ID a ser deletado =-=");
                    del = scanner.nextInt();
                    scanner.nextLine();
                    if(
                    		del < i && clientes[del][0] !=null) {
                    	clientes[del][0] = null;
                    	clientes[del][1] = null;
                    	clientes[del][2] = null;
                    	System.out.println("===	Informações deletadas ===");
                    }else {
                    	System.out.println("==	ID não existente ==");
                    }
                    	
                    }
                    fim = 4;
                    break;
                case 5:
                	System.out.println("\n*********** GRUPO A3 ***************");
                    System.out.println("\nDesenhado por: \n\n- Gabriel Franceschini\n RA:1352220626 \n\n- Thalis Denis\n RA:1352220703 \n\n- Yuri Alves\n RA:1352221879 \n\n- Vinicius Herbaly\n RA:13523110501");
                    break;
                case 6:
                	System.out.println("\n**************************");
                	System.out.println("Encerrando o programa...\n");
                    System.out.println("Programa Encerrado");
                    System.out.println("**************************");
                    break;    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }

        //scanner.close();        
    }

    public static void exibirMenu() {
        System.out.println("\n  |=-=-=-=-= Menu =-=-=-=-=|");
        System.out.println("  |  1. Adicionar Cliente  |");
        System.out.println("  |  2. Listar Clientes    |");
        System.out.println("  |  3. Atualizar Cliente  |");
        System.out.println("  |  4. Deletar Cliente    |");
        System.out.println("  |  5. Sobre a Equipe     |");
        System.out.println("  |  6. Sair               |");
        System.out.println("  |=-=-=-=-==-=-=-=-=-=-=-=|");
        System.out.print(" \n Escolha uma opção: ");
    }
   
   }

