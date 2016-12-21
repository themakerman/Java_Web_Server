import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	//This is a class in java which provides us functions to make a server on specific port address
	ServerSocket serverSocket;
	
	//From this point our program begins
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 *	This is equivalent to  
		 * Main main = new Main();
		 * main.runServer();
		*/
		new Main().runServer();	
		
	}
	
	public void runServer() throws Exception{
		System.out.println("Server Started");
		serverSocket = new ServerSocket(6543);
		acceptRequests();
	}
	
	private void acceptRequests() throws Exception{
		while(true){
			Socket s = serverSocket.accept();
			
			ConnectionHandler ch = new ConnectionHandler(s);
			
			ch.start();			
		}
	}
}
