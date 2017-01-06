package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao_vol {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
	private int numeroVol ;
	private String datedepart,datearive ;
	public Dao_vol(int numeroVol,String datedepart,String datearive) {
	              this.numeroVol=numeroVol;
	             this.datedepart=datedepart;
	             this.datearive=datearive;
	        String mysqlquery="INSERT INTO vol (numeroVol,datedepart,datearive) values ('"+numeroVol+"','"+datedepart+"','"+datearive+"')";
	        
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}





}
