package thread;


import java.io.IOException;
//import java.net.InetAddress;


public class Chat  {
	
	    public static void main(String args[]) throws IOException {
	    	//InetAddress enderecoIP = InetAddress.getLocalHost();
	    	//System.out.println("Endereço IP da máquina local: " + enderecoIP.getHostAddress());
	    	Enviar send = new Enviar();
	    	Receber rcv = new Receber();
	   
	    	Thread enviar = new Thread(send);
	    	Thread receber = new Thread(rcv);
	    	
	    	
	    	receber.start();
	    	enviar.start();
	    
	    	}
	}
