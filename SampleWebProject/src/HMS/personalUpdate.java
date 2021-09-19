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
 * Servlet implementation class personalUpdate
 */
@WebServlet("/personalUpdate")
public class personalUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public personalUpdate() {
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
		out.println("From Servlet Post");
		String First_Name = request.getParameter("First_Name");
		out.println("</br>"+ First_Name);
		
		String Middle_Name = request.getParameter("Middle_Name");
		out.println("</br>"+ Middle_Name);
		
		String Last_Name = request.getParameter("Last_Name");
		out.println("</br>"+ Last_Name);
		
		String Mother_Name = request.getParameter("Mother_Name");
		out.println("</br>"+ Mother_Name);
		

		String P_Address = request.getParameter("P_Address");
		out.println("</br>"+ P_Address);
		
		String Mob_No = request.getParameter("Mob_No");
		out.println("</br>"+ Mob_No);
		
		String Tel_No = request.getParameter("Tel_No");
		out.println("</br>"+ Tel_No);
		
		String Gender = request.getParameter("Gender");
		out.println("</br>"+Gender);
		
		String City = request.getParameter("City");
		out.println("</br>"+City);
		
		String Tal = request.getParameter("Tal");
		out.println("</br>"+Tal);
		
		String Dist = request.getParameter("Dist");
		out.println("</br>"+Dist);
		
		String Adhar_No = request.getParameter("Adhar_No");
		out.println("</br>"+Adhar_No);
		
		String Pin_no = request.getParameter("Pin_no");
		out.println("</br>"+Pin_no);
		
		String Caste = request.getParameter("Caste");
		out.println("</br>"+Caste);
		
		String Religion = request.getParameter("Religion");
		out.println("</br>"+Religion);
		
		String Catogory= request.getParameter("Catogory");
		out.println("</br>"+Catogory);
		
		String Annual_Income = request.getParameter("Annual_Income");
		out.println("</br>"+Annual_Income);
		
		
		
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
			      sql ="update Personalform set Middle_Name="+"'"+Middle_Name+"'"
			        +",Last_Name="+"'"+Last_Name+"'"
			      
                    +",Mother_Name="+"'"+Mother_Name+"'"
			      
			        +",P_Address="+"'"+P_Address+"'"
			      
			        +",Mob_No="+"'"+Mob_No+"'"
			      
			       +",Tel_No="+"'"+Tel_No+"'"
			      
			        +",Gender="+"'"+Gender+"'"
			      
			      +",City="+"'"+City+"'"
			      
			       +",Tal="+"'"+Tal+"'"
			      
			       +",Dist="+"'"+Dist+"'"
			      
			        +",Adhar_No="+"'"+Adhar_No+"'"
			      
			      +",Pin_no="+"'"+Pin_no+"'"
			      
			       +",Caste="+"'"+Caste+"'"
			      
			        +",Religion="+"'"+Religion+"'"
			      
			       +",Catogory="+"'"+Catogory+"'"
			      
			        +",Annual_Income="+"'"+Annual_Income+"'"
			        
                   +" where First_Name="+"'"+First_Name+"'";
			      System.out.println(sql);
			      stmt.executeUpdate(sql);
			      
			     

			      //STEP 5: Extract data from result set
			     
			      //STEP 6: Clean-up environment
			     
			      stmt.close();
			      conn.close();
			      //request.setAttribute("questionList", questionList);
			      System.out.println("1 Row Inserted...");
			      
			      RequestDispatcher rd=request.getRequestDispatcher("jdata/HomePage.jsp");
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

