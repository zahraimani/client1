/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client1;

/**
 *
 * @author HP
 */
public class Client1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // for(int i = 0;i<8;i++){
            Client2 c1 = new Client2();
            c1.setAddress(4040, "127.0.0.1");
            c1.start();
            System.out.println("Client1");
            
        
    }
    
}
