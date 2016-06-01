package fr.statcv2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 /**
  * Url : http://localhost:8080/viewStat/rest/dashboard/test
 * @author johann
 *
 */
@Path("/dashboard")
public class DashBoardSrv {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		String _url = "http://localhost:9200/.kibana/visualization/_search?pretty ";
		BufferedReader reader = null;
        try {
            URL url = new URL(_url);
            URLConnection urlConnection = url.openConnection();
            reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            output = sb.toString();
        } catch (IOException ex) {
            //Logger.getLogger(HTTPLoader.class.getName()).log(Level.SEVERE, null, ex);
        	output = "Erreur IO";
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                //Logger.getLogger(HTTPLoader.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
		
		return Response.status(200).entity(output).build();
 
	}
 
}