package thread;


import java.io.IOException;
//import java.net.InetAddress;


public class Chat  {
	
	    public static void main(String args[]) throws IOException {
	    	
	    	Enviar send = new Enviar();
	    	Receber rcv = new Receber();
	   
	    	Thread enviar = new Thread(send);
	    	Thread receber = new Thread(rcv);
	    	
	    	
	    	receber.start();
	    	enviar.start();
	    
	    	}
	}
