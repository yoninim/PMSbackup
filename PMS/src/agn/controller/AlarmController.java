package agn.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agn.action.Action;
import agn.action.ActionForward;
import agn.action.LoginAction;
import agn.action.LoginFormAction;
import agn.action.TodoAction;
import agn.action.UserInsertAction;
import agn.action.UserInsertFormAction;

@WebServlet("/alarm/*")
public class AlarmController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AlarmController() {
		super();
	}

	public void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String requestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String path = requestURI.substring(contextPath.length()+7);
		System.out.println(path);
		
		ActionForward forward = null;
		Action action = null;
		
		if(path.equals("todoAlarm.do")) {
			action = new TodoAction();
			try {
				forward = action.execute(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
		
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
}
