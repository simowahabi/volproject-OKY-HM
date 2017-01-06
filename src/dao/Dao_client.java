package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao_client {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
	private String CIN,tel,prenom,adress,numFaxClient,nomCompAirien;

	public Dao_client(String CIN,String prenom,String 	nomCompAirien,String adress,String tel,String numFaxClient ) {
		this.nomCompAirien=nomCompAirien;
		this.CIN=CIN;
		this.tel=tel;
		this.prenom=prenom;
		this.adress=adress;
		this.numFaxClient=numFaxClient;
	        String mysqlquery="INSERT INTO client (CIN,prenomClient,nomCompAirien,adresseClient,telClient,numFaxClient) values ('"+CIN+"','"+prenom+"','"+nomCompAirien+"','"+adress+"','"+tel+"','"+numFaxClient+"')";
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public Dao_client(String CIN,String prenom,String nomCompAirien,String adress,String tel) {
		this.CIN=CIN;
		this.nomCompAirien=nomCompAirien;
		this.tel=tel;
		this.prenom=prenom;
		this.adress=adress;
	        String mysqlquery="INSERT INTO client (CIN,prenomClient,nomCompAirien,adresseClient,telClient) values ('"+CIN+"','"+prenom+"','"+nomCompAirien+"','"+adress+"','"+tel+"')";
	   
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
