import java.net.*;
import java.io.*;

public class Client
{
	public static void main(String args[]) throws Exception
	{
		String sendMsg = "";
		InetAddress server = InetAddress.getByName("192.168.20.26");
		Socket s = new Socket(server,4444);
		BufferedReader r = new BufferedReader( new InputStreamReader( s.getInputStream() ) );
		PrintWriter out = new PrintWriter( new OutputStreamWriter( s.getOutputStream() ) );
		while(true)
		{
			String response = r.readLine();
			System.out.println(response);
			response = r.readLine();
		
			while(!response.equals("-EOF-"))
			{
				System.out.println(response);
				response = r.readLine();
			}
			
			if(sendMsg.equals("bye"))
				break;
			
			sendMsg = Validator.getString("Client : ");
			out.println(sendMsg);
			out.flush();
			
		}
		s.close();
	}
}