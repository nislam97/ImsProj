package com.qa.imsprjct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CRUD {
	
	private Connection con;
	private Statement stmnt;
	private ResultSet rs;
	
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
    
    public void create(customers c) {
    	//String first_name = "Quincy";
    	//String surname = "River";
    	
    	
    	String first_name;
		String createStmnt  = "INSERT INTO customers(first_name, surname) VALUES('"+first_name+"','"+surname+"');";
    	try {
    		stmnt.executeUpdate(createStmnt);
    		System.out.println("Create Statement Executed");
    		
    	}catch(SQLException e) {
    		System.out.println("Query is not sufficient");
    		e.printStackTrace();
    }
    	
    }
    
    

	
		public void update(int id, String update) {
			String updateStmnt = "UPDATE customer SET first_name = '" + update + "'WHERE id = " + id + ";";
			try {
				stmnt.executeUpdate(updateStmnt);
				System.out.println("Update statement executed");
				
			}catch (SQLException e) {
				System.out.println("Bad query");
				e.printStackTrace();
			}}
			public void read(){{
				String readStmnt = "SELECT * FROM customers;";
				try {
					rs = stmnt.executeQuery(readStmnt);
					while (rs.next()) {
						System.out.println("ID: " + rs.getInt("id"));
						System.out.println("first_name: " + rs.getString("first_name"));
						System.out.println("surname: " + rs.getString("surname"));
					}
					

				} catch (SQLException e) {
					System.out.println("Bad query");
					e.printStackTrace();
				}
			}
		}
			private void read1() {
			// TODO Auto-generated method stub
			
		}

			public void delete(int id) {
				String delStmnt = "DELETE FROM customer WHERE id=" + id + ";";
				try {
					stmnt.executeUpdate(delStmnt);
					System.out.println("Delete the statement performed");
				} catch (SQLException e) {
					System.out.println("Not a good query");
					e.printStackTrace();
				}
			}
		
		

	public Statement getStmnt() {
		return stmnt;
	}

	public void setStmnt(Statement stmnt) {
		this.stmnt = stmnt;
	}

	public void create(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public void closeCon() {
		try {
			con.close();
			System.out.println("It is now closed!");
		}catch(SQLException e) {
			System.out.println("The connection is closing");
			e.printStackTrace();
		}}
		
						
				
			}
