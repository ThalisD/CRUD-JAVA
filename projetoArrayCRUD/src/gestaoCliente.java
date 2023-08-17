import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class gestaoCliente {

	
	 public static Boolean apresentacao(boolean d) {
		 SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		 Date data = new Date();
		 if(d == false) {
			 System.out.println("Progama iniciado em: " + formatador.format(data));
		 }else {
			 System.out.println("Progama finalizado em: " + formatador.format(data));
		 }
		 System.out.println("********GRUPO A3********");
		 System.out.println("Desenhado por: \n\n- Gabriel Franceschini");
		return d;
		 
		 
		 
	 }
	 public static void main(String[] args) {
		   apresentacao(false);
		   cod();
		   apresentacao(true);
}
	private static void cod() {
		// TODO Auto-generated method stub
		
	}
}

