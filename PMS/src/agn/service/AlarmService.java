package agn.service;

import java.util.List;

import agn.dao.AlaramDao;
import agn.model.Card;

public class AlarmService {
	private static AlarmService service = new AlarmService();
	private static AlaramDao dao;
	
	public static AlarmService getInstance() {
		dao = AlaramDao.getInstatnce();
		return service;
	}
	
	public List<Card> todoAlarmService(){
		return dao.todoAlarm();
	}
	
	

}
