package agn.dao;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import agn.mapper.UserMapper;
import agn.model.Users;

public class UserDao {
	private static UserDao dao = new UserDao();
	
	public static UserDao getInstance() {
		
		return dao;
	}
	
	public Users selectUser(String id) {
		Users user = null;
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			user = sqlSession.getMapper(UserMapper.class).selectUser(id);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) sqlSession.close();
		}
		
		return user;
	}
	
	public int insertUser(Users user) {
		int x = -1;
		
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		
		try {
			x = sqlSession.getMapper(UserMapper.class).insertUser(user);
			if(x > 0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) sqlSession.close();
		}
		
		return x;
	}
	
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream is = null;
		
		try {
			is = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return new SqlSessionFactoryBuilder().build(is);
	}
	
}
