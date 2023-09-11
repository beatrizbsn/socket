package thread;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class Enviar implements Runnable{

	private Socket socket;
	private Scanner scanner;
	
	public void run() {
		
		try {
			
			scanner = new Scanner(System.in);
			
			while (true) {
				
				String mensagem = scanner.nextLine();
				String nome = scanner.next();
				socket = new Socket(nome,54322);
				DataOutputStream saida = new DataOutputStream(socket.getOutputStream());
				if (mensagem.equalsIgnoreCase("SAIR")) {
                    break; 
					}
				saida.writeUTF(mensagem);
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
