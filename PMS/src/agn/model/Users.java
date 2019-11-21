package agn.model;

import java.io.Serializable;

public class Users implements Serializable{
	private int unum;
	private String id;
	private String name;
	
	public Users() {}
	
	public Users(String id, String name) {
		super();
		this.unum = 0;
		this.id = id;
		this.name = name;
	}
	
	public Users(int unum, String id, String name) {
		super();
		this.unum = unum;
		this.id = id;
		this.name = name;
	}

	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Users [unum=" + unum + ", id=" + id + ", name=" + name + "]";
	}
	
}
