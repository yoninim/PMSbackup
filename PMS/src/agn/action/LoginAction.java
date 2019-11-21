package agn.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import agn.service.UserService;
import agn.model.Users;

public class LoginAction implements Action{
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = null;
		
		UserService service = UserService.getInstance();
		
		Users user = service.selectUser(request);
		
		if(user == null) {
			System.out.println(user);
			forward = new ActionForward("../pm_join/login_error.html", true);
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("user", user);
			forward = new ActionForward("../alarm/todoAlarm.do", true);
		}
		
		return forward;
	}
}
