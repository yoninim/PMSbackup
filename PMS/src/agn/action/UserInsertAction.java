package agn.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agn.service.UserService;

public class UserInsertAction implements Action{
		
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		UserService service = UserService.getInstance();
		service.insertUser(request);
		
		return new ActionForward("../dd.html", true);
	}
}
