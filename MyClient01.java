import java.io.IOException;
 import java.io.InputStream;
 import java.net.Socket;
 import java.io.OutputStream;
 
 public class MyClient01{
 	public static void main(String[] args){
 		byte[] buff = new byte[1024];
 		Socket sock = null;
 		InputStream is = null;
 		OutputStream os = null;
 		boolean	cont	=	true;
 
  try {
 	sock = new Socket("172.16.21.66",6000);
 	is = sock.getInputStream();
 	os = sock.getOutputStream();
 
 	
 
 	
 	
 	is.close();
 
 	}	catch (IOException e){
 		System.err.println("ネットワークエラー");
 		System.exit(1);
 		}
 	}
 }
   