package agn.model;

import java.io.Serializable;

public class Alarm implements Serializable {
	private int alarm_num;
	private String type_content_id;
	private String user_id;
	private String type;
	private String alarm_material;
	private String occurence_date;
	
	public Alarm() {}

	public Alarm(int alarm_num, String type_content_id, String user_id, String type, String alarm_material,
			String occurence_date) {
		super();
		this.alarm_num = alarm_num;
		this.type_content_id = type_content_id;
		this.user_id = user_id;
		this.type = type;
		this.alarm_material = alarm_material;
		this.occurence_date = occurence_date;
	}

	public int getAlarm_num() {
		return alarm_num;
	}

	public void setAlarm_num(int alarm_num) {
		this.alarm_num = alarm_num;
	}

	public String getType_content_id() {
		return type_content_id;
	}

	public void setType_content_id(String type_content_id) {
		this.type_content_id = type_content_id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAlarm_material() {
		return alarm_material;
	}

	public void setAlarm_material(String alarm_material) {
		this.alarm_material = alarm_material;
	}

	public String getOccurence_date() {
		return occurence_date;
	}

	public void setOccurence_date(String occurence_date) {
		this.occurence_date = occurence_date;
	}

	@Override
	public String toString() {
		return "Alarm [alarm_num=" + alarm_num + ", type_content_id=" + type_content_id + ", user_id=" + user_id
				+ ", type=" + type + ", alarm_material=" + alarm_material + ", occurence_date=" + occurence_date + "]";
	}
	
	
	
}
