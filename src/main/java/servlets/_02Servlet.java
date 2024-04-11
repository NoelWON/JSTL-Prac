package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class _02Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/** 1. 객체의 Scope
		 * - 객체 존속 범위 : 객체가 존재하는 범위
		 *  2. 객체의 지속 순서 : 
		 *   1) ApplicationScope 2) SessionScope 3) RequestScope 4) pageScope
		 *   각각의 객체를 Map 에서 가지고 있다.
		 *  3. 객체를 찾는 순서 (이름이 같은 key값을 가질 때)
		 *   1) pageScope 2) RequestScope 3) SessionScope 4) ApplicationScope   
		*/ 
		
		//request Scope 
		UserVo vo1 = new UserVo();
		vo1.setNo(1);
		vo1.setName("둘리request");
		request.setAttribute("vo", vo1);
		
		// session Scope
		UserVo vo2 = new UserVo();
		vo2.setNo(1);
		vo2.setName("둘리session");
		request.getSession().setAttribute("vo", vo2);
		
		// Application Scope
		UserVo vo3 = new UserVo();
		vo3.setNo(1);
		vo3.setName("둘리Application");
		request.getServletContext().setAttribute("vo", vo3);
		
		request.getRequestDispatcher("WEB-INF/views/02.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
