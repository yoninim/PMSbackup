package agn.model;

import java.io.Serializable;

public class Card implements Serializable{
	private int card_Num;
	private int member_Num;
	private int label_Num;
	private int file_Num;
	private int list_Num;
	private int board_Num;
	private String card_Name;
	private String start_Card_Date;
	private String dueDate_Card_Date;
	private String creation_Date;
	private String card_Material;
	private String complete;
	
	public Card() {}

	
	public Card(int card_Num, int member_Num, int label_Num, int file_Num, int list_Num, int board_Num,
			String card_Name, String start_Card_Date, String dueDate_Card_Date, String creation_Date,
			String card_Material, String complete) {
		super();
		this.card_Num = card_Num;
		this.member_Num = member_Num;
		this.label_Num = label_Num;
		this.file_Num = file_Num;
		this.list_Num = list_Num;
		this.board_Num = board_Num;
		this.card_Name = card_Name;
		this.start_Card_Date = start_Card_Date;
		this.dueDate_Card_Date = dueDate_Card_Date;
		this.creation_Date = creation_Date;
		this.card_Material = card_Material;
		this.complete = complete;
	}


	public Card(String card_Name) {
		super();
		this.card_Name = card_Name;
	}


	public int getCard_Num() {
		return card_Num;
	}


	public void setCard_Num(int card_Num) {
		this.card_Num = card_Num;
	}


	public int getMember_Num() {
		return member_Num;
	}


	public void setMember_Num(int member_Num) {
		this.member_Num = member_Num;
	}


	public int getLabel_Num() {
		return label_Num;
	}


	public void setLabel_Num(int label_Num) {
		this.label_Num = label_Num;
	}


	public int getFile_Num() {
		return file_Num;
	}


	public void setFile_Num(int file_Num) {
		this.file_Num = file_Num;
	}


	public int getList_Num() {
		return list_Num;
	}


	public void setList_Num(int list_Num) {
		this.list_Num = list_Num;
	}


	public int getBoard_Num() {
		return board_Num;
	}


	public void setBoard_Num(int board_Num) {
		this.board_Num = board_Num;
	}


	public String getCard_Name() {
		return card_Name;
	}


	public void setCard_Name(String card_Name) {
		this.card_Name = card_Name;
	}


	public String getStart_Card_Date() {
		return start_Card_Date;
	}


	public void setStart_Card_Date(String start_Card_Date) {
		this.start_Card_Date = start_Card_Date;
	}


	public String getDueDate_Card_Date() {
		return dueDate_Card_Date;
	}


	public void setDueDate_Card_Date(String dueDate_Card_Date) {
		this.dueDate_Card_Date = dueDate_Card_Date;
	}


	public String getCreation_Date() {
		return creation_Date;
	}


	public void setCreation_Date(String creation_Date) {
		this.creation_Date = creation_Date;
	}


	public String getCard_Material() {
		return card_Material;
	}


	public void setCard_Material(String card_Material) {
		this.card_Material = card_Material;
	}


	public String getComplete() {
		return complete;
	}


	public void setComplete(String complete) {
		this.complete = complete;
	}


	@Override
	public String toString() {
		return "Card [card_Num=" + card_Num + ", member_Num=" + member_Num + ", label_Num=" + label_Num + ", file_Num="
				+ file_Num + ", list_Num=" + list_Num + ", board_Num=" + board_Num + ", card_Name=" + card_Name
				+ ", start_Card_Date=" + start_Card_Date + ", dueDate_Card_Date=" + dueDate_Card_Date
				+ ", creation_Date=" + creation_Date + ", card_Material=" + card_Material + ", complete=" + complete
				+ "]";
	}

	
	
}
