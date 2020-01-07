package learn;

import  java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Learn {

	public static void main(String... args) throws Exception{

		String url="jdbc:mysql://localhost:3306/jdb",uname="root",pass="Balashanthi#7";
		//Class.forName("com.mysql.jdbc.Driver");
		//try {
		Connection con= DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		System.out.println("done");
		//}catch(Exception e) {System.out.println("Coonection cant be established");}
		
		String query="select * from students";
		ResultSet rs=st.executeQuery(query);
//		
	while (rs.next()){

				
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"  "+rs.getInt(3)+"  "+rs.getInt(4));
	}				
		System.out.println();
		st.close();
		con.close();
}//main
	
		
}//class
