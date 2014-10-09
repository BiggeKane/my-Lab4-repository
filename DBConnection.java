package sqlconnection;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
	@SuppressWarnings("unused")
	static private String user = "root";
	@SuppressWarnings("unused")
	static private String password = "";
	private Connection con=null;
	private PreparedStatement ps = null; 
	private ResultSet rs = null;
	/* 获取数据库连接的函数*/
	public static Connection getConnection() {
		Connection con = null;	//创建用于连接数据库的Connection对象
		try {
			Class.forName("com.mysql.jdbc.Driver");// 加载Mysql数据驱动
			
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/bookdb", "root", "");// 创建数据连接
			
		} catch (Exception e) {
			System.out.println("数据库连接失败" + e.getMessage());
		}
		return con;	//返回所建立的数据库连接
	}
	
	public void close(){
		try{
			if(rs != null){
				rs.close();
				rs = null;
			}
			if(ps != null){
				ps.close();
				ps = null;
			}
			if(con != null){
				con.close();
				con = null;
			}
		}
		catch(Exception ex){
			System.err.println("close error :"+ex.getMessage());
		}
	}
	public static void Close(Connection con,Statement stmt){
        if(stmt!=null){
        	try{
    			stmt.close();
    			}catch(SQLException e){}
    		}
    	if(con!=null){
    		try{
    			con.close();
    		    }catch(SQLException e){}
    		}
    	}  
}
