package agn.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agn.model.Cuser;
import agn.service.AlarmService;

public class FindUserAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		AlarmService service = AlarmService.getInstance();
		
		Cuser user = new Cuser();
		
		String userId = request.getParameter("userId");
		
		forward.setPath(path);
		forward.setRedirect(isRedirect);
		return forward;
	}

}
