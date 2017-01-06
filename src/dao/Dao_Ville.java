package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao_Ville {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
	private String nomVille;
   private int codePostale; 
	public Dao_Ville(String nomVille,int codePostale){
		this.nomVille=nomVille;
		this.codePostale=codePostale;
		 String mysqlquery="INSERT INTO ville (nomVille,codePostale) values ('"+nomVille+"','"+codePostale+"')";
		    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
}
