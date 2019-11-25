package agn.model;

import java.io.Serializable;

public class TagMember implements Serializable {
	private int tagmeber_num;
	private int user_num;
	private int card_num;
	
	public TagMember() {}

	public TagMember(int tagmeber_num, int user_num, int card_num) {
		super();
		this.tagmeber_num = tagmeber_num;
		this.user_num = user_num;
		this.card_num = card_num;
	}

	public int getTagmeber_num() {
		return tagmeber_num;
	}

	public void setTagmeber_num(int tagmeber_num) {
		this.tagmeber_num = tagmeber_num;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public int getCard_num() {
		return card_num;
	}

	public void setCard_num(int card_num) {
		this.card_num = card_num;
	}

	@Override
	public String toString() {
		return "TagMember [tagmeber_num=" + tagmeber_num + ", user_num=" + user_num + ", card_num=" + card_num + "]";
	}
	
	
}
