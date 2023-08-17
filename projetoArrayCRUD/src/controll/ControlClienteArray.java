package controll;

import entity.Cliente;

public class ControlClienteArray {

	private Cliente[] clientes;

	public Cliente[] getClientes() {
		return clientes;
	}

	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}

	public Boolean vetorVazio() {
		if (this.clientes.length == 0) { 
			System.out.println("Array Vazio!!!");
			return true;
		} else {
			return false;
		}

	}

	public void adicionarClienteVazio(Integer n, Cliente... c) {
		if (n == 0) {
			System.out.println("Adicao invalida!!!");
		} else {
			this.clientes = new Cliente[n];
			int i = 0;
			for (Cliente x : c) {
				if (i > (this.clientes.length - 1)) {
					throw new ArrayIndexOutOfBoundsException("Numero de registros excede o tamanho do Array!!!");
				} else {
					this.clientes[i] = new Cliente(x.getId(), x.getNome(), x.getCpf());
					i++;
				}
			} 
		}
	}

	public void adicionarCliente(Integer n, Cliente... c) {
		if (this.clientes.length == 0) {
			System.out.println("Necessario criar o Array primeiro!!!");
		} else {
			int i = 0;
			while ((i < this.clientes.length) && (this.clientes[i] != null)) {
				i++;
			}
			if (i > (this.clientes.length - 1)) {
				System.out.println("Array cheio!!!");
			} else {
				if ((this.clientes.length - i) < n) {
					System.out.println("Numero de registros excede o tamanho do Array!!!");
				} else {
					for (Cliente x : c) {
						this.clientes[i] = new Cliente(x.getId(), x.getNome(), x.getCpf());
						i++;
					}
				}
			}
		}
	}

	public void listarCliente() {

		if (!vetorVazio()) {
			for (int i = 0; i < this.clientes.length; i++) {
				if (clientes[i] != null) {
				System.out.println(i + " : " + clientes[i]);
				System.out.println("-----------------------------------------------------");
				} else {
				System.out.println(i + " : Espaco vazio");
				System.out.println("-----------------------------------------------------");
				}
			}
		}
	}

	public void atualizarCliente(Cliente c) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.clientes.length; i++) {
				if ((this.clientes[i] != null) && (this.clientes[i].getId().equals(c.getId()))) {
					this.clientes[i] = c;
					achado++;
				}
			}
		}
		if (achado == 0) {
			System.out.println("Cliente nao encontrado!!!");
		}
	}

	public void removerCliente(Cliente c) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.clientes.length; i++) {
				if ((this.clientes[i] != null) && (this.clientes[i].getId().equals(c.getId()))) {
					achado++;
					for (int j = i; j < this.clientes.length; j++) {
						if (this.clientes[j] != null)
						clientes[j] = clientes[j + 1];
					}
				}
			}
		}
		if (achado == 0) {
			System.out.println("Cliente nao encontrado!!!");
		}
	}


	
}