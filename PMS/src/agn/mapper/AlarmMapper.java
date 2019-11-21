package agn.mapper;

import java.util.List;

import agn.model.Card;
import agn.model.Users;

public interface AlarmMapper{
	List<Card> todoAlarm();
	Users findUser(String user_id);
}
