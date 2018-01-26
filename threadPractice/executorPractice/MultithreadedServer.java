package threadPractice.executorPractice;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultithreadedServer {
	private int port;
	
	public MultithreadedServer ( int port ) {
		this.port = port;
	}
	
	public int getPort() {
		return port;
	}
	
	public void listen() {
		int poolSize = 100 * Runtime.getRuntime().availableProcessors();
		ExecutorService taskList = Executors.newFixedThreadPool(poolSize);
		
		try {
			ServerSocket listener = new ServerSocket(port);
			Socket socket;
			
			while(true) {
				socket = listener.accept();
				taskList.execute(new ConnectionHandler(socket));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
