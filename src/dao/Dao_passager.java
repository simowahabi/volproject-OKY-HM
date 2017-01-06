package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao_passager {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
   private int numeroReservation;
    private String nomPassager,prenomPassager;
	public Dao_passager(int numeroReservation,String nomPassager,String prenomPassager) {

	    
	       this.numeroReservation=numeroReservation;
	       this.nomPassager=nomPassager;
	       this.prenomPassager=prenomPassager;
	        String mysqlquery="INSERT INTO aeroport (numeroReservation,nomPassager,prenomPassager) values ('"+numeroReservation+"','"+nomPassager+"','"+prenomPassager+"')";
	        
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
