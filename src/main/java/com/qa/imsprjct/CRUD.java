package com.qa.imsprjct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class CRUD {
	
	private Connection con;
	private Statement stmnt;
	
	public CRUD() {
    try {
    	con = DriverManager.getConnection(Databse.URL, Databse.USER, Databse.PASS);
    	this.stmnt = con.createStatement();
    	System.out.println("The connection was successful!");
    }catch(SQLException e) {
    	System.out.println("Wrong details");
    	e.printStackTrace();
	}
}
	public void closeCon() {
		try {
			con.close();
			System.out.println("It is now closed!");
		}catch(SQLException e) {
			System.out.println("The connection is closing");
			e.printStackTrace();
		}
	}
}