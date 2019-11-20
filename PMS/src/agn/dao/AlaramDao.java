package agn.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import agn.mapper.AlarmMapper;
import agn.model.Card;

public class AlaramDao {
	private static AlaramDao dao = new AlaramDao();
	
	public static AlaramDao getInstatnce() {
		return dao;
	}
	
	public SqlSessionFactory getSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<Card> todoAlarm(){
		SqlSession sqlSession = getSessionFactory().openSession();
		List<Card> list = null;
		try {
			list = sqlSession.getMapper(AlarmMapper.class).todoAlarm();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null)
			sqlSession.close();
		}
		return list;
	}
	
}
