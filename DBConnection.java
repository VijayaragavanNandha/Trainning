package mysqlCon;
import java.sql.*;
import java.util.Scanner;
public class MysqlCon {
	
	public static void main(String[] args) {
		MysqlCon mc = new MysqlCon();
		System.out.println("Select what you want????");
		System.out.println("Insertion press 1");
		System.out.println("show records press 2");
		Scanner sc = new Scanner(System.in);
		int select =sc.nextInt();
		if(select==1)
		mc.insertion();
		if(select==2)
		mc.getting();

	}
	//insert query
	public void insertion() {
		System.out.println("Insertion");
		System.out.println("Enter id :");
		Scanner sc = new Scanner(System.in);
		int id=sc.nextInt();
		System.out.println("Enter Name :");
		String name =sc.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","vj","root");
			Statement stmt=con.createStatement();
			String sql ="insert into student values ("+id+",'"+name+"')";
		    
			stmt.executeUpdate(sql);
			System.out.println("Inserted Sucessfully");
			
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
	//select query
	public void getting() {
		System.out.println("Records...");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vijay","vj","root");
			Statement stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while(rs.next()) {
				ConnectionBean cb = new ConnectionBean();
				cb.setS_no(rs.getInt(1));
				cb.setName(rs.getString(2));
				System.out.println(cb.getS_no()+"\t"+cb.getName());
			}
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

}

