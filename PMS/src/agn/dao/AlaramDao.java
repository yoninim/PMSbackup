package agn.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import agn.mapper.AlarmMapper;
import agn.model.Alarm;
import agn.model.Card;
import agn.model.Users;

public class AlaramDao {
	private static AlaramDao dao = new AlaramDao();
	
	public static AlaramDao getInstatnce() {
		return dao;
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream in = null;
		try {
			in = Resources.getResourceAsStream(resource);
		}catch(Exception e){
			e.printStackTrace();
		}
		return new SqlSessionFactoryBuilder().build(in);
	}
	
	public List<Card> todoAlarm(int user_num){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		List<Card> list = null;
		try {
			list = sqlSession.getMapper(AlarmMapper.class).todoAlarm(user_num);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(sqlSession != null)
			sqlSession.close();
		}
		return list;
	}
	
	public int insAlarm(Alarm alarm) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		int re = -1;
		try {
			re = sqlSession.getMapper(AlarmMapper.class).insAlarm(alarm);
			if(re>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sqlSession.close();
		}
		return re;
	}
	
	
	
}
