package com.vaccin.dao;

import java.sql.*;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Database {
	
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String username = "system";
	private static String password = "root";
	
	public int insertIntoDB(ArrayList e)
	{
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		String insert = null;
		 int b = 0;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url , username , password);
			st = con.createStatement();
			
			insert = "insert into registration values( uid_seq.nextval , ? , ? , ? , ? , ? , ? , ? , ?)"; 
			ps = con.prepareStatement(insert);
			ps.setString(1, (String) e.get(0));
			ps.setString(2, (String) e.get(1));
			ps.setString(3, (String) e.get(2));
			ps.setString(4, (String) e.get(3));
			ps.setString(5, (String) e.get(4));
			ps.setString(6, (String) e.get(5));
			ps.setString(7, (String) e.get(6));
			ps.setString(8, (String) e.get(7));
			
			b=ps.executeUpdate();
	
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		} catch (Exception u) {
			u.printStackTrace();
		}
		return b;
	}
	
	public boolean login ( String id , String pass )
	{
		Connection con = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String pass1 = null;
		String name = null;
		boolean b = true;
		String select = null;
		
		try {
			
			Class.forName(driver);
			con = DriverManager.getConnection(url , username , password);
			st = con.createStatement();
			
			select = "select password , Fname from registration where aadhar = ?";
			
			ps = con.prepareStatement(select);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			while(rs.next()) 
			{
				pass1 = rs.getString(1);
				
				name = rs.getString(2);
				
				JOptionPane.showMessageDialog(null, pass1);
				
			}
			if(pass1.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Wlcome "+name);
			}
			else {
				b = false;
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException i) {
			// TODO Auto-generated catch block
			i.printStackTrace();
		} catch (Exception u) {
			u.printStackTrace();
		}
		return b;
	}
}
