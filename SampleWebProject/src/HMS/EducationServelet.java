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
 * Servlet implementation class EducationServelet
 */
@WebServlet("/EducationServelet")
public class EducationServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EducationServelet() {
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
		PrintWriter out=response.getWriter();
		out.println("From Education Serv");
		
		String Passing_From=request.getParameter("Passing_From");
		out.print("<br/>"+Passing_From);
		String Year_Of_Passing=request.getParameter("Year_Of_Passing");
		out.print("<br/>"+Year_Of_Passing);
		String Percentage=request.getParameter("Percentage");
		out.print("<br/>"+Percentage);
		String HSC_Passing_From=request.getParameter("HSC_Passing_From");
		out.print("<br/>"+HSC_Passing_From);
		String Year_Of_Passing_HSC=request.getParameter("Year_Of_Passing_HSC");
		out.print("<br/>"+Year_Of_Passing_HSC);
		String Percentage_HSC=request.getParameter("Percentage_HSC");
		out.print("<br/>"+Percentage_HSC);
		String Pass_Out_Year=request.getParameter("Pass_Out_Year");
		out.print("<br/>"+Pass_Out_Year);
		String University=request.getParameter("University");
		out.print("<br/>"+University);
		String Admission_From_No=request.getParameter("Admission_From_No");
		out.print("<br/>"+Admission_From_No);
		
		 
		
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
			      sql = "insert into education (Passing_From,Year_Of_Passing,Percentage,HSC_Passing_From,Year_Of_Passing_HSC,Percentage_HSC,Pass_Out_Year,University,Admission_From_No) values('"
			      +Passing_From+
			      "','"
			       +Year_Of_Passing+
			      "','"
			        +Percentage+
			      "','"
			         +HSC_Passing_From+
			      "','"
			          +Year_Of_Passing_HSC+
			      "','"
			      +Percentage_HSC+
			       "','"
			          +Pass_Out_Year+
			           "','"
			          +University+
			          "','"
			          +Admission_From_No+
			     
			      "')"
			          ;
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
