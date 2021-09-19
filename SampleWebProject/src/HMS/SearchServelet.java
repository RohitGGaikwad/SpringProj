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

import Models.Personalform;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchServelet
 */
@WebServlet("/SearchServelet")
public class SearchServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServelet() {
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
		out.print("From SeaechServelet");
		
		
		String First_Name=request.getParameter("FullName");
		out.print("<br/>"+First_Name);
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
		      sql = "SELECT First_Name,Middle_Name,Last_Name,Mother_Name,P_Address,Mob_No,Tel_No,Gender,city,Tal,Dist,Adhar_No,Pin_no,Caste,Religion,Catogory,Annual_Income FROM Personalform"
		      		+ " where First_Name="+"'"+First_Name+"'";
		      System.out.println(sql);
		      ResultSet rs = stmt.executeQuery(sql);
		      
		      ArrayList<Personalform> perList=new ArrayList<Personalform>();

		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		    	  Personalform per= new Personalform();
		    	  
				per.setFirst_Name(rs.getString("First_Name"));
		    	  per.setMiddle_Name(rs.getString("Middle_Name"));
		    	  per.setLast_Name(rs.getString("Last_Name"));
		    	  per.setMother_Name(rs.getString("Mother_Name"));
		    	  per.setP_Address(rs.getString("P_Address"));
		    	  per.setMob_No(rs.getString("Mob_No"));
		    	  per.setTel_No(rs.getString("Tel_No"));
		    	  per.setGender(rs.getString("Gender"));
		    	  per.setCity(rs.getString("city"));
		    	  per.setTal(rs.getString("Tal"));
		    	  per.setDist(rs.getString("Dist"));
		    	  per.setAdhar_No(rs.getString("Adhar_No"));
		    	  per.setPin_no(rs.getString("Pin_no"));
		    	  per.setCaste(rs.getString("Caste"));
		    	  per.setReligion(rs.getString("Religion"));
		    	  per.setCatogory(rs.getString("Catogory"));
		    	  per.setAnnual_Income(rs.getString("Annual_Income"));
		         /*List<Question> questionList=new ArrayList<Question>();*/
		    	  perList.add(per);
		         //Display values
		         System.out.print("First_Name: " + per.getFirst_Name());
		         System.out.print("Middle_Name: " + per.getMiddle_Name());
		         System.out.print("Last_Name: " + per.getLast_Name());
		         System.out.print("Mother_Name: " + per.getLast_Name());
		         System.out.print("P_Address: " + per.getP_Address());
		         System.out.print("Mob_No: " + per.getMob_No());
		         System.out.print("Tel_No: " + per.getTel_No());
		         System.out.print("Gender: " + per.getGender());
		         System.out.print("city: " + per.getCity());
		         System.out.print("Tal: " + per.getTal());
		         System.out.print("Dist: " + per.getDist());
		         System.out.print("Adhar_No: " + per.getAdhar_No());
		         System.out.print("Pin_no: " + per.getPin_no());
		         System.out.print("Caste: " + per.getCaste());
		         System.out.print("Religion: " + per.getReligion());
		         System.out.print("Catogory: " + per.getCatogory());
		         System.out.print("Annual_Income: " + per.getAnnual_Income());
		       
		        
		      }
		      //STEP 6: Clean-up environment
		      rs.close();
		      stmt.close();
		      conn.close();
		      //request.setAttribute("questionList", questionList);
		      HttpSession session = request.getSession();
		        session.setAttribute("perList", perList);
		      
		        RequestDispatcher rd = request.getRequestDispatcher("jdata/PersonalSearchResult.jsp");
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
		   System.out.println("Data Retrived Successfully");			   
	
	}

}
