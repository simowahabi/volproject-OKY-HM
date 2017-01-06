package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Compagnie_Aierienne {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
    private String Compagniename;
	public Compagnie_Aierienne(String Compagniename) {

	       this.Compagniename=Compagniename;
	      
	        String mysqlquery="INSERT INTO compagnieaierienne (nomCompAirien) values ('"+Compagniename+"')";
	        
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
