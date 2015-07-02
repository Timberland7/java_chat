package com.chat.java_chat.server;

public class ServerMain {
	
	private int port;
	
	public ServerMain(int port){
		this.port= port;
		System.out.println(port);
	}
	
	public static void main(String[] args){
		if(args.length > 1){
			System.out.println("Usage: java -jar server.jar <port>2322");
			return;
		}
		int port = Integer.parseInt(args[0]);
		new ServerMain(port);
	}
}
