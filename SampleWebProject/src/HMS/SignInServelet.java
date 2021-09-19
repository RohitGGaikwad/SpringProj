package HMS;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInServelet
 */
@WebServlet("/SignInServelet")
public class SignInServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.print("From SignInServelet");
		
		String Full_Name=request.getParameter("Full_Name");
		out.print("<br/>"+Full_Name);
		String User_name=request.getParameter("User_name");
		out.print("<br/>"+User_name);
		String Creat_Password=request.getParameter("Creat_Password");
		out.print("<br/>"+Creat_Password);
		String  Confirm_Password=request.getParameter("Confirm_Password");
		out.print("<br/>"+Confirm_Password);
		/*String  Date_Of_Birth=request.getParameter("Date_Of_Birth");
		out.print("<br/>"+DateOfBirth);*/
		String[] Month = request.getParameterValues("Month");
		out.println("</br>"+Month);
		for(int i=0;i<Month.length;i++)
		{
			out.println(Month[i]);
		}

		String Day=request.getParameter("Day");
		out.print("<br/>"+Day);
		String Year=request.getParameter("Year");
		out.print("<br/>"+Year);
		String Date_Of_Birth=Day+Month+Year;
		String Gender=request.getParameter("Gender");
		out.print("<br/>"+Gender);
		String Current_Email_Address=request.getParameter("CurrentEmailAddress");
		out.print("<br/>"+Current_Email_Address);
		String[] Country = request.getParameterValues("Country");
		out.println("</br>"+Country);
		for(int i=0;i<Country.length;i++)
		{
			out.println(Country[i]);
		}
		
		
		
		
		// JDBC driver name and database URL
		   final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   final String DB_URL = "jdbc:mysql://localhost:3306/test";

		   //  Database credentials
		   final String USER = "root";
		   final String PASS = "root";
		   
		  
		   Connection conn = null;
		   Statement stmt = null;
		   try{
			      //STEP 2: Register JDBC driver
			      Class.forName("com.mysql.jdbc.Driver");

			      //STEP 3: Open a connection
			      System.out.println("Connecting to database...");
			      conn = DriverManager.getConnection(DB_URL,USER,PASS);

			      //STEP 4: Execute a query
			      System.out.println("Creating statement...");
			      stmt = conn.createStatement();
			      String sql;
			      sql = "insert into signin (Full_Name,User_name,Creat_Password,Confirm_Password,Date_Of_Birth,Gender,Current_Email_Address,Country) values('"
			      +Full_Name+
			      "','"
			      +User_name+
			      "','"
			      +Creat_Password+
			      "','"
			      +Confirm_Password+
			      "','"
	              +Date_Of_Birth+
			      "','"
                  +Gender+
			      "','"
                  +Current_Email_Address+
			      "','"
			      +Country+
			      "')";
			      System.out.println(sql);
			      stmt.executeUpdate(sql);
			      
			     

			      //STEP 5: Extract data from result set
			     
			      //STEP 6: Clean-up environment
			     
			      stmt.close();
			      conn.close();
			      //request.setAttribute("questionList", questionList);
			      System.out.println("1 Row Inserted...");
			      
			      RequestDispatcher rd = request.getRequestDispatcher("jdata/HomePage.jsp");
			      rd.forward(request, response);
			      /*response.sendRedirect("/OnlineTest/PhysicsQuestions.jsp");*/
			   }
			   catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			   }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			   }finally{
			      //finally block used to close resources
			      try{
			         if(stmt!=null)
			            stmt.close();
			      }catch(SQLException se2){
			      }// nothing we can do
			      try{
			         if(conn!=null)
			            conn.close();
			      }catch(SQLException se){
			         se.printStackTrace();
			      }//end finally try
			   }//end try
			   

	}

}
