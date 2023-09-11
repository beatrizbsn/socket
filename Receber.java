package thread;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Receber implements Runnable {
	private ServerSocket sSocket;
	

    
		public void run() {
		
			try {
				sSocket = new ServerSocket(54322);
				//int i = 0;
				while (true) {
					/*if (i == 5) {
	                    break; 
						}
					i = i + 1;*/
					Socket sockets = sSocket.accept();
					Treceber contato = new Treceber(sockets);
					Thread Tcontato = new Thread(contato);	
					Tcontato.start();	
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
	    	 
		}
}
