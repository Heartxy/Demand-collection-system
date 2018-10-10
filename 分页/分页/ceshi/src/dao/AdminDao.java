package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import bean.AdminBean;
import util.DBUtil;
import util.MD5;

//admin数据表的操作

public class AdminDao {
	//获取数据库中数据总量
	public int getCount(){
		ResultSet rs=null;
		Statement stmt=null;
		Connection conn=null;
		
		int size=0;
		
		try{
			conn=DBUtil.getConn();
			stmt=conn.createStatement();
			rs=stmt.executeQuery("select count(*)count from admin");
			
			if(rs.next())
				size=rs.getInt("count");
		}catch(SQLException se){
			se.printStackTrace();
		}
		finally
		{
			DBUtil.close(rs,stmt, conn);
		}
		return size;
	}
	//获取每一个分页的数据
	public List<AdminBean> getListByPage(int start ,int size){  //第一个参数是起始位置，第二个参数是一页显示的记录数
		String sql="select * from admin limit "+start+","+size;
		Connection conn=DBUtil.getConn();
		Statement stmt=null;
		ResultSet rs=null;
		
		List<AdminBean> adminBeans = new ArrayList<AdminBean>();
		
		try{
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			AdminBean adminBean;
			while(rs.next()){
				adminBean=new AdminBean();
				adminBean.setId(rs.getInt("id"));
				adminBean.setUsername(rs.getString("username"));
				adminBean.setPassword(rs.getString("password"));
				adminBean.setSalt(rs.getString("salt"));
				adminBean.setCreateDate(rs.getString("create_date"));
				adminBeans.add(adminBean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		DBUtil.close(rs, stmt, conn);
		}
		return adminBeans;
	}
	
	
}

