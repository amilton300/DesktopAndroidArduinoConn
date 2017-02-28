import interfaces.IAndroidConnection;
import java.io.DataOutputStream;
import java.net.Socket;

public class AndroidConnection{
    
    public void open(){ 
        try{
        //Android device IP address
        clientSocket = new Socket("192.168.1.2", 8080);
        outToServer = new DataOutputStream(clientSocket.getOutputStream());
        }catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        }
    }
    
    public void close(){
        try{
           clientSocket.close();
        }catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        } 
    }
    
    public void send()
    {
        try{
        outToServer.writeBytes("1");
        }
        catch(Exception ex){
            System.out.println("EXCEPTION: " + ex);
        }
    }  
    Socket clientSocket;
    DataOutputStream outToServer;
}