package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.T_DCWJXX;
import util.DBUtil;

public class Ceshidao {
	//去掉分页
	public  ArrayList<T_DCWJXX> xdshPolicy(
			String num,String sType0,String q0,
			String logic1,String sType1,String q1,
			String logic2,String sType2,String q2 )
	{
					ArrayList<T_DCWJXX>  list = new ArrayList<T_DCWJXX>();
					
					String sql = "select * from t_dcwjxx ";
					Connection conn=DBUtil.getConn();
					Statement stmt=null;
					ResultSet rs=null;
					//拼的查询语句
					//因为只有一次查询多次显示所以不能提交到本方法~~~~~~会出现空指针
						if(num.equals("1")){
							//只有一个查询条件
							sql+=" where "+sType0+" like '%"+q0+"%'";
				            }
				            if(num.equals("2")){
				            	//2个查询条件
				              if(logic1.equals("AND")){
				            	sql+=" where "+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%'";
				              }
				              if(logic1.equals("OR")){
				            	  sql+=" where ("+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%')";  
				              }
				              if(logic1.equals("NOT")){
				            	 sql+=" where "+sType0+" like '%"+q0+"%' "+"and "+sType1+" not like '%"+q1+"%'";
				              }
				            }
				            if(num.equals("3")){
				            	//3个查询条件
			                	if(logic2.equals("AND")){
			                		if(logic1.equals("AND")){
			                        	sql+=" where "+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%' "+logic2+" "+sType2+" like '%"+q2+"%'"; 
			                          }
			                		if(logic1.equals("OR")){
			                      	  sql+=" where ("+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%' "+logic2+" "+sType2+" like '%"+q2+"%')";
			                        }
			                        if(logic1.equals("NOT")){
			                      	 sql+=" where "+sType0+" like '%"+q0+"%' "+"and "+sType1+" not like '%"+q1+"%'"+" and "+sType2+" not like '%"+q2+"%'";
			                        }
			                      }
			                	
			                       if(logic2.equals("OR")){
			                    	  if(logic1.equals("AND")){
			                          	sql+=" where "+sType0+" like '%"+q0+"%' "+logic1+" ("+sType1+" like '%"+q1+"%' "+logic2+" "+sType2+" like '%"+q2+"%' )";  
			                            }
			                  		if(logic1.equals("OR")){
			                        	  sql+=" where ("+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%' "+logic2+" "+sType2+" like '%"+q2+"%')";  
			                          }
			                          if(logic1.equals("NOT")){
			                        	 sql+=" where ("+sType0+" like '%"+q0+"%' "+"and "+sType1+" not like '%"+q1+"%') "+logic2+" "+sType2+" like '%"+q2+"%'";
			                          }
			                      }
			                       
			                      if(logic2.equals("NOT")){
			                    	  
			                    	  if(logic1.equals("AND")){
			                          	sql+=" where "+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%' "+" and "+sType2+" not like '%"+q2+"%'"; 
			                            }
			                  		if(logic1.equals("OR")){
			                        	  sql+=" where ("+sType0+" like '%"+q0+"%' "+logic1+" "+sType1+" like '%"+q1+"%') "+" and "+sType2+" not like '%"+q2+"%'";
			                          }
			                          if(logic1.equals("NOT")){
			                        	 sql+=" where "+sType0+" like '%"+q0+"%' "+"and "+sType1+" not like '%"+q1+"%'"+" and "+sType2+" not like '%"+q2+"%'";
			                          }
			                      }
			                      
			                }
					//SQL语句结束
					T_DCWJXX xx=null;
					try{
						stmt=conn.createStatement();
						rs=stmt.executeQuery(sql);
						
						while(rs.next()){
							xx= new  T_DCWJXX();
							xx.set(rs.getInt("uid"),rs.getInt("WJID"), rs.getString("JGQC"),rs.getString("GKGLBM"),rs.getString("TXDZ"),
									rs.getString("SZDY"),rs.getString("WZ"),rs.getString("DZYX"),rs.getString("FRDB"),
									rs.getString("YZBM"), rs.getString("LXR"),rs.getString("GDDH"),rs.getString("YDDH"), rs.getString("CZ"),
									rs.getString("JGSX"),rs.getString("JGJJ"), rs.getString("JSXQMC"),rs.getInt("XQSX1"),rs.getInt("XQSX2"),
									rs.getString("JSXQGS"),rs.getString("GJZ"),rs.getInt("NTRZJZE"), rs.getString("JSXQJJFS"),
									rs.getString("HZYXDW"), rs.getString("KJHDLX"), rs.getString("XKFL"), rs.getString("XQJSSSLY"),
									rs.getString("XQJSYYHY"),rs.getString("date"),rs.getInt("dession"),rs.getString("advice"));
							
							list.add(xx);
						}
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
					DBUtil.close(rs, stmt, conn);
					}
					return list;
				}
	
}
