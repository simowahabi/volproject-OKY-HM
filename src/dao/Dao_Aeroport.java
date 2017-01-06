package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Dao_Aeroport extends Dao_DB{
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
	private String Aeroport;
	private String ville;
	public Dao_Aeroport(String Aeroport,String ville) {
		super();
	       this.Aeroport=Aeroport;
	       this.ville=ville;
	        String mysqlquery="INSERT INTO aeroport (nomAeroport,nomVille) values ('"+Aeroport+"','"+ville+"')";
	        
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public void search(){
		

		Statement mystat;
		try {
			mystat = myconnection.createStatement();
			ResultSet myres=mystat.executeQuery("select * from programmeurs");	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}


	      
	          


}
