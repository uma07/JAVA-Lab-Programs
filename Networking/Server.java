import java.net.*;
import java.io.*;

public class Server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss= new ServerSocket(4444);
		while(true)
		{
			Socket s = ss.accept();
			
			BufferedReader r = new BufferedReader( new InputStreamReader( s.getInputStream() ) );
			PrintWriter out = new PrintWriter( new OutputStreamWriter( s.getOutputStream() ) );
			
			String name = r.readLine();
			out.println("Hello " + name);
			out.flush();
			s.close();
		}
	}
}