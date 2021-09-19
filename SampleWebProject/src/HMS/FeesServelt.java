package HMS;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeesServelt
 */
@WebServlet("/FeesServelt")
public class FeesServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeesServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("From Servlet Get");
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		PrintWriter out=response.getWriter();
		out.println("From Servlet Get");
		
		String Register_No = request.getParameter("Register_No");
		out.println("</br>"+ Register_No);
		
		String Amount = request.getParameter("Amount");
		out.println("</br>"+Amount);
		
		String Comment = request.getParameter("Comment");
		out.println("</br>"+ Comment);
		
		String Transaction_Date = request.getParameter("Transaction_Date");
		out.println("</br>"+ Transaction_Date);
		
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
			      sql = "insert into Fees (Register_No,Amount,Comment,Transaction_Date) values('"
			      +Register_No+
			      "','"
			      +Amount+
			      "','"
			        +Comment+
			         "','"
			        +Transaction_Date+
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
