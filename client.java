import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] args) throws IOException{
        int port = Integer.parseInt(args[1]);
        Socket s = new Socket(args[0], port);

        //one way communication
        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("is it working?");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("server : "+ str);
    }
}