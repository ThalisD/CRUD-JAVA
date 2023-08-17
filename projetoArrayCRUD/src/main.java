import controll.ControlClienteArray;
import entity.Cliente;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente c1 = new Cliente(001, "João Fernando", "120.300.235-69");
		Cliente c2 = new Cliente(002, "Thalis Denis", "050.325.776-34");
		Cliente c3 = new Cliente(003, "Enzo Franceschini", "230.545.678-09");
		Cliente c4 = new Cliente(004,"Paulo Frazao", "150.606.529-58");

		ControlClienteArray cp = new ControlClienteArray();
		cp.adicionarClienteVazio(5, c1, c2, c3);
		//cp.adicionarCliente(5,c1, c2, c3);
		cp.removerCliente(new Cliente(004, null, null));
		cp.listarCliente(); //Listar Clientes
		//
		cp.adicionarClienteVazio(5, c1, c2, c3, c4); // Adicionar Cliente 004
		cp.removerCliente(new Cliente(002, null, null)); // Remover Cliente 002
		cp.atualizarCliente(new Cliente(003, "Enzo Franceschini", "250.667.865-87")); //Alterar CPF
		cp.listarCliente(); //Listar Cliente
		
	}

}
