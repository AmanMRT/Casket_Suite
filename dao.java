/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micpro;

import java.sql.*;

class dao
{
	public static Connection createconnection()
	{
		Connection con = null;

		try
		{
			Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12248151","sql12248151","AxQe7gZQCM");						
                        
                      //  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CorrugatedBox","root","lakshay");
		}
		catch(Exception e)
		{
			 //javax.swing.JOptionPane.showMessageDialog(new javax.swing.JFrame(),"No internet connection.");
		}
                    return con;
                
                
	}
}
