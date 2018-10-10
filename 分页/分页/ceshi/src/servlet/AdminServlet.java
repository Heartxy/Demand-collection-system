package servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.PagingBean;

import bean.AdminBean;
import dao.AdminDao;
import util.Constants;
import util.MD5;
import util.StringUtil;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet("/admin/AdminServlet")
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置编码方式并获取method
		req.setCharacterEncoding("utf-8");
		String method = req.getParameter("method");
		if("list".equals(method))
		{
			listUsers(req,resp);
		}
	}

	//*********************查看管理员*********************
	private void listUsers(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {

	 req.setCharacterEncoding("utf-8");
	 
	String status = req.getParameter("status");
	
	AdminDao adminDao = new AdminDao();
	
	int currentPage = StringUtil.StringToInt(req.getParameter("currentPage"));
	int countSize = adminDao.getCount();
	PagingBean pagingBean = new PagingBean(currentPage, countSize,Constants.PAGE_SIZE_1);
	
	List<AdminBean> adminBeans = adminDao.getListByPage(currentPage *Constants.PAGE_SIZE_1, Constants.PAGE_SIZE_1);
	
	pagingBean.setPrefixUrl(req.getContextPath() + "/admin/AdminServlet?method=list");
	
	pagingBean.setIsAnd(true);
	
	req.setAttribute(Constants.SESSION_ADMIN_BEANS, adminBeans);
	req.setAttribute("pagingBean", pagingBean);
	
	if (status != null) {//什么意思？？？？
	req.getRequestDispatcher("listUsers.jsp?status=" + status).forward(req, resp);
	} else {
	req.getRequestDispatcher("listUsers.jsp").forward(req, resp);
	}
}
	
	
}
