package application;

import java.sql.*;

public class CreateUser {
	private int condition = 1;
	public CreateUser(String id, String pw) {
		//id, pw sql injection security
		if(id.contains(";") || id.contains("/") || id.contains("*")
				|| id.contains("true") || id.contains("True") || id.contains("tRue") 
				|| id.contains("trUe") || id.contains("truE") || id.contains("TUre") 
				|| id.contains("TuRe") || id.contains("TurE") || id.contains("tURe") 
				|| id.contains("tUrE") || id.contains("trUE") || id.contains("tURE") 
				|| id.contains("TuRE") || id.contains("TUrE") || id.contains("TURe") 
				|| id.contains("TURE")
				||pw.contains(";") || pw.contains("/") || pw.contains("*")
				|| pw.contains("true") || pw.contains("True") || pw.contains("tRue") 
				|| pw.contains("trUe") || pw.contains("truE") || pw.contains("TUre") 
				|| pw.contains("TuRe") || pw.contains("TurE") || pw.contains("tURe") 
				|| pw.contains("tUrE") || pw.contains("trUE") || pw.contains("tURE") 
				|| pw.contains("TuRE") || pw.contains("TUrE") || pw.contains("TURe") 
				|| pw.contains("TURE"))
			condition = -9;
		else {
			connectionDB(id,pw);
		}
	}
	
	private void connectionDB(String id,String pw) {
		Connection conn = null;
		Statement st = null;
		String url = "jdbc:oracle:thin:@localhost:1522:orcl";
		String user = "AZ_MANAGER"; 
		String password = "123400";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
			st = conn.createStatement();
			
			ResultSet rs = st.executeQuery("SELECT COUNT(*) FROM AZ_MANAGER.MEMBER WHERE ID = \'"+id+"\'");
			while(rs.next()) {
				System.out.println(rs.getInt(1));/**/
			
				if(rs.getInt(1) == 0) {
					st.executeQuery("INSERT INTO AZ_MANAGER.MEMBER (ID,PW,ADDRESS) VALUES (\'"+id+"\', \'"+pw+"\', NULL)"); 
					condition = 0;
				}
				else {//already exist id
					condition = 2;
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			condition = -8;
		}finally{
			try {
				if(st != null) st.close();
				if(conn != null) conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
				condition = -8;
			}
		}
	}
	public int getCondition() {
		return condition;
	}
}
