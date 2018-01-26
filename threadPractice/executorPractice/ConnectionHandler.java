package threadPractice.executorPractice;

import java.net.Socket;

public class ConnectionHandler implements Runnable {

	private Socket socket;
	public ConnectionHandler(Socket socket) {
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		handleConnection(socket);
	}
	private void handleConnection(Socket socket2) {
		// TODO Auto-generated method stub
		
	}

}
