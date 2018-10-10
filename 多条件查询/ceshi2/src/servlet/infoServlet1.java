package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import bean.T_DCWJXX;
import dao.Ceshidao;
import util.Constants;
import util.StringUtil;

/**
 * Servlet implementation class infoServlet
 */
@WebServlet("/servlet/infoServlet")
public class infoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public infoServlet1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if ("shenhechaxun".equals(method)) {
			shenhechaxun(req, resp);
		}//分类检索
	}
	
	// 审核多条件查询第一页
	protected void shenhechaxun(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		String num = req.getParameter("num");// 查询依据的个数

		// "logic" + strId; 与或非
		// "sType" + strId; 类型
		// "q" + strId; 输入框

		// 申明
		String q0 = null;
		String q1 = null;
		String q2 = null;
		String logic1 = null;
		String logic2 = null;
		String sType0 = null;
		String sType1 = null;
		String sType2 = null;
		if (req.getParameter("q0") != null) {
			q0 = req.getParameter("q0");
			sType0 = req.getParameter("sType0");
		}
		if (req.getParameter("q1") != null) {
			q1 = req.getParameter("q1");
			logic1 = req.getParameter("logic1");
			sType1 = req.getParameter("sType1");
		}
		if (req.getParameter("q2") != null) {
			q2 = req.getParameter("q2");
			logic2 = req.getParameter("logic2");
			sType2 = req.getParameter("sType2");
		}

		Ceshidao cs = new Ceshidao();
		
		List<T_DCWJXX> xx = cs.xdshPolicy(num,sType0, q0, logic1, sType1, q1, logic2, sType2, q2);// sType0,q0,logic1,sType1,q1,logic2,sType2,q2);值
		
		req.getSession().setAttribute("xxbeans", xx);
		if (xx.size() != 0) {
				req.getRequestDispatcher("/info/shenheliulan.jsp").forward(req, resp);
		} else {
			resp.sendRedirect(req.getContextPath() + "/info/shenheliulan.jsp?status=1");
		}

	}
/*
	
	// 需求审核浏览 只有管理员和网络审核员才有权限审核 普通用户进行查看自己的情况
	protected void shenheliulan(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		// 非普通用户进行审核
		T_DCWJXXdao xxdao = new T_DCWJXXdao();
		String status = req.getParameter("status");


		List<T_DCWJXX> xx = xxdao.getListByPage(currentPage * Constants.PAGE_SIZE_1, Constants.PAGE_SIZE_1);

		pagingBean.setPrefixUrl(req.getContextPath() + "/servlet/infoServlet?method=shenheliulan");

		pagingBean.setIsAnd(true);
		req.getSession().setAttribute("xxbeans", xx);
		req.setAttribute("pagingBean", pagingBean);
		if (status != null) {// 什么意思？？？？
			req.getRequestDispatcher("/info/shenheliulan.jsp?status=" + status).forward(req, resp);
		} else {
			req.getRequestDispatcher("/info/shenheliulan.jsp").forward(req, resp);
		}

	}
*/
}