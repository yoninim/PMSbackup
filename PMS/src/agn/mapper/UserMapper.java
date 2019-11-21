package agn.mapper;

import agn.model.Users;

public interface UserMapper {
	int insertUser(Users user);
	Users selectUser(String id);
}
