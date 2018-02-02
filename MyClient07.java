import java.io.IOException;
 import java.io.InputStream;
 import java.net.Socket;
 import java.io.OutputStream;
 
 public class MyClient07{
 	public static void main(String[] args){
 		byte[] buff = new byte[1024];
 		Socket sock = null;
 		InputStream is = null;
 		OutputStream os = null;
 		boolean	cont	=	true;
 		int i;
 try {
 	sock = new Socket("localhost",3999);
 	
 	is = sock.getInputStream();
 	os = sock.getOutputStream();
 
 	int n = is.read(buff);
 	System.out.write(buff,0,n);
 
 	String msg = "Hello";
 	
 	is.close();
 
 	}	catch (IOException e){
 		System.err.println("ネットワークエラー");
 		System.exit(1);
 		}
 	}
 }