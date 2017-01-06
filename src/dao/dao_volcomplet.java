package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class dao_volcomplet {
	private Connection myconnection=CheckConnection.connectionBD();
	private ResultSet  myresultat=null;
	private PreparedStatement mypreparedStatement=null;
   private int 	numeroVol;
    private String nomCompAirien,nomAeroport,Aer_nomAeroport,dateArriveVol,dateDepartVol,jour;



	public dao_volcomplet(int numeroVol,String nomCompAirien,String nomAeroport,String Aer_nomAeroport,String dateArriveVol,String dateDepartVol,String jour) {

	    
	       this.numeroVol=numeroVol;
	       this.nomCompAirien=nomCompAirien;
	       this.nomAeroport=nomAeroport;
	       this.Aer_nomAeroport=Aer_nomAeroport;
	       this.dateArriveVol=dateArriveVol;
	       this.dateDepartVol=dateDepartVol;
	       this.jour=jour;
	        String mysqlquery="INSERT INTO volcomplet (numeroVol,nomCompAirien,nomAeroport,Aer_nomAeroport,dateArriveVol,dateDepartVol,jour) values "
	        		+ "('"+numeroVol+"','"+nomCompAirien+"','"+nomAeroport+"','"+Aer_nomAeroport+"','"+dateArriveVol+"','"+dateDepartVol+"','"+jour+"')";
	        
	    
	        try {
				mypreparedStatement=myconnection.prepareStatement(mysqlquery);
		          mypreparedStatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}


}
