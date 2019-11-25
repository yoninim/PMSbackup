package agn.model;

import java.io.Serializable;

public class Users implements Serializable{
	private int user_num;
	private String user_id;
	private String user_pw;
	private String user_name;
	private String user_hp;
	private String user_email;
	private String user_message_status;
	
	public Users() {}

	public Users(int user_num, String user_id, String user_pw, String user_name, String user_hp, String user_email,
			String user_message_status) {
		super();
		this.user_num = user_num;
		this.user_id = user_id;
		this.user_pw = user_pw;
		this.user_name = user_name;
		this.user_hp = user_hp;
		this.user_email = user_email;
		this.user_message_status = user_message_status;
	}
	
	public Users(String user_id,String user_name) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_pw() {
		return user_pw;
	}

	public void setUser_pw(String user_pw) {
		this.user_pw = user_pw;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_hp() {
		return user_hp;
	}

	public void setUser_hp(String user_hp) {
		this.user_hp = user_hp;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_message_status() {
		return user_message_status;
	}

	public void setUser_message_status(String user_message_status) {
		this.user_message_status = user_message_status;
	}

	@Override
	public String toString() {
		return "Users [user_num=" + user_num + ", user_id=" + user_id + ", user_pw=" + user_pw + ", user_name="
				+ user_name + ", user_hp=" + user_hp + ", user_email=" + user_email + ", user_message_status="
				+ user_message_status + "]";
	}
	
	
	
}
