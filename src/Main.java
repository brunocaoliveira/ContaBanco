import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Cliente bruno = new Cliente();
		bruno.setNome("bruno");
		Scanner entrada = new Scanner(System.in);
        String opcao;

        System.out.println("Deseja acessar a tela do banco? (Sim/Não)");
        opcao = entrada.nextLine();

        switch (opcao) {
            case "Sim":
            case "sim":
                System.out.println("Acessando a tela do banco...");
                
            
                break;
            case "Não":
            case "nao":
                System.out.println("Operação cancelada.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
		
		Conta cc = new ContaCorrente(bruno);
		Conta poupanca = new ContaPoupanca(bruno);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
