import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class HttpResponse {

	HttpRequest request;
	
	String response;
	
	String root = "D:/root";
	
	
	public HttpResponse(HttpRequest request) {
		// TODO Auto-generated constructor stub
		this.request = request;
		
		File f = new File(root + request.filename);
		
		try{
			//To read the file for sending response
			FileInputStream fis = new FileInputStream(f);
			
			/*HTTP/1.0 200 Document follows
			   MIME-Version: 1.0
			   Server: CERN/3.0
			   Date: Sunday, 10-Nov-96 06:54:46 GMT
			   Content-Type: text/html
			   Content-Length: 4531
			   Last-Modified: Wednesday, 16-Oct-96 10:14:01 GMT 
			 */
			
			response = "HTTP/1.1 200 \r\n"; //version of http and 200 is status code which means all okay
			response  += "Server: Our Java Server/1.0 \r\n";
			response += "Content-Type: text/html \r\n"; //response is in html format
			response += "Connection: close \r\n";
			response += "Content-Length: "+f.length() + " \r\n"; //length of response file
			response += "\r\n"; //after blank line we have to append file data
			
			int s;
			//Reading Html File..........
			while ( (s = fis.read()) != -1){
				response += (char)s;
			}			
		}catch(FileNotFoundException e){
			//If we do not get the file then error 404 
			response = response.replace("200", "404");			
		}catch(Exception e){
			//If any other error then 500 internal server error
			response = response.replace("200", "500");		
		}		
	}
}
