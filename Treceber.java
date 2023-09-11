package thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Treceber implements Runnable  {
	private Socket socket;
	public Treceber (Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			// TODO Auto-generated method stub
			InetAddress enderecoRemoto = socket.getInetAddress();
			String enderecoIPRemoto = enderecoRemoto.getHostAddress();
			
			DataInputStream entrada = new DataInputStream(socket.getInputStream());
			String mensagem = entrada.readUTF();
			String novamensagem = mensagem.toUpperCase();
			System.out.println(enderecoIPRemoto + ":" + novamensagem);
			socket.close();
			entrada.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
