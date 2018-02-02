import java.io.*;
 import java.net.*;
 import java.util.*;
 
 class MyServer04{
 	public static void main(String[] args) {
 		byte[] buff = new byte[1024];
 		ServerSocket servsock = null;
 		Socket sock;
 		OutputStream out;
 		InputStream instr;
 		String outstr;
 		int i;
 		boolean cont = true;
 
 		try{
   			
 			servsock = new ServerSocket(6000,100);
 			while(true){
 				sock = servsock.accept();
 				System.out.println("接続を確認");
 				
 				outstr = "\n"+"HELLO"+"\n";
 				out	= sock.getOutputStream();
 				for(i = 0; i<outstr.length(); i++)
 					out.write((int)	outstr.charAt(i));
 
 				out.write('\n');
     			
 				instr = sock.getInputStream();
 				while(cont){
 					try{
 						int n = instr.read(buff);
 						System.out.write(buff,	0,	n);
 
 					}catch(Exception e){
 						cont = false;
 					}
 				}
 				
 				sock.close();
 			}
 		}catch(IOException ioe){
 			System.exit(1);
 		}
 	}
 }