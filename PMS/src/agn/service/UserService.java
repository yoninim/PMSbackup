package agn.service;

import javax.servlet.http.HttpServletRequest;

import agn.dao.UserDao;
import agn.model.Users;

public class UserService {
	private static UserService service = new UserService();
	private static UserDao dao;
	
	public static UserService getInstance() {
		dao = UserDao.getInstance();
		return service;
	}
	
	public void deleteUser(HttpServletRequest request) {
		//  나중에 later
	}
	
	public Users selectUser(HttpServletRequest request) { 			// user가 있는지 없는지 확인
		String id = request.getParameter("id");
		Users user = null;
		if(id != null) {
			user =  dao.selectUser(id);
		}
		
		return user;
	}
	
	public void insertUser(HttpServletRequest request) {		//	 USER INPUT
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		if(id != null && name != null) {
			dao.insertUser(new Users(id, name));
		}else {
			System.out.println("아이디명과 이름을 제대로 입력하지 않음");
		}
		
	}
	
}
