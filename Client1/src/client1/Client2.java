/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Client2 implements Runnable{   

 private Thread mainThread;
 private int port;
 private String ip;
 private Socket socket1;
 private InputStream input;
 private OutputStream output;
   // Thread mainThread;
    @Override
    public void run() {
     try {
         //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

         System.out.println("connecting ...");
         socket1 = new Socket(ip, port);
         System.out.println("connect");
         input = socket1.getInputStream();
         output= socket1.getOutputStream();
         while(true){
         System.out.println("receiving ... ");
         Thread.sleep(1000);
         byte[]  b = new byte [1024];
         String s ="client2" ;
            
      
         output.write(s.getBytes());
         input.read(b);
         System.out.println(s);
         
         }
     } catch (IOException | InterruptedException ex) {
         Logger.getLogger(Client2.class.getName()).log(Level.SEVERE, null, ex);
     }
   
    }
    
   public void setAddress(int p,String i){
   ip = i;
   port = p;
   
    }
    public  void start(){
    
    mainThread = new Thread(this);
    mainThread.start();
   
    
    }
    
    
    
    
    
    
}
