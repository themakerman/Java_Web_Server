
public class HttpRequest {
	
	String filename;

	public HttpRequest(String request) {
		// TODO Auto-generated constructor stub
		
		//First Spliting Level
		String lines[] = request.split("\n"); 
		
		System.out.println(lines[0]);
		
		//Second Splitting Level
		filename = lines[0].split(" ")[1];
		
		System.out.println(filename);
				
	}

}
