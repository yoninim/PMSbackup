package agn.mapper;

import java.util.List;

import agn.model.Alarm;
import agn.model.Card;
import agn.model.Users;

public interface AlarmMapper{
	List<Card> todoAlarm(int user_num);
	int insAlarm(Alarm alarm);
}
