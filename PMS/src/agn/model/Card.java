package agn.model;

import java.io.Serializable;

public class Card implements Serializable{
	private int card_Num;
	private String card_Name;
	private String card_start_Date;
	private String card_due_Date;
	private String card_reg_Date;
	private String card_content;
	private int card_Clear;
	private int card_Order;
	private int card_Calendar;
	private int user_Num;
	private int label_Num;
	private int file_Num;
	private int board_Num;
	
	public Card() {}

	public Card(int card_Num, String card_Name, String card_start_Date, String card_due_Date, String card_reg_Date,
			String card_content, int card_Clear, int card_Order, int card_Calendar, int user_Num, int label_Num,
			int file_Num, int board_Num) {
		super();
		this.card_Num = card_Num;
		this.card_Name = card_Name;
		this.card_start_Date = card_start_Date;
		this.card_due_Date = card_due_Date;
		this.card_reg_Date = card_reg_Date;
		this.card_content = card_content;
		this.card_Clear = card_Clear;
		this.card_Order = card_Order;
		this.card_Calendar = card_Calendar;
		this.user_Num = user_Num;
		this.label_Num = label_Num;
		this.file_Num = file_Num;
		this.board_Num = board_Num;
	}

	public int getCard_Num() {
		return card_Num;
	}

	public void setCard_Num(int card_Num) {
		this.card_Num = card_Num;
	}

	public String getCard_Name() {
		return card_Name;
	}

	public void setCard_Name(String card_Name) {
		this.card_Name = card_Name;
	}

	public String getCard_start_Date() {
		return card_start_Date;
	}

	public void setCard_start_Date(String card_start_Date) {
		this.card_start_Date = card_start_Date;
	}

	public String getCard_due_Date() {
		return card_due_Date;
	}

	public void setCard_due_Date(String card_due_Date) {
		this.card_due_Date = card_due_Date;
	}

	public String getCard_reg_Date() {
		return card_reg_Date;
	}

	public void setCard_reg_Date(String card_reg_Date) {
		this.card_reg_Date = card_reg_Date;
	}

	public String getCard_content() {
		return card_content;
	}

	public void setCard_content(String card_content) {
		this.card_content = card_content;
	}

	public int getCard_Clear() {
		return card_Clear;
	}

	public void setCard_Clear(int card_Clear) {
		this.card_Clear = card_Clear;
	}

	public int getCard_Order() {
		return card_Order;
	}

	public void setCard_Order(int card_Order) {
		this.card_Order = card_Order;
	}

	public int getCard_Calendar() {
		return card_Calendar;
	}

	public void setCard_Calendar(int card_Calendar) {
		this.card_Calendar = card_Calendar;
	}

	public int getUser_Num() {
		return user_Num;
	}

	public void setUser_Num(int user_Num) {
		this.user_Num = user_Num;
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

	public int getBoard_Num() {
		return board_Num;
	}

	public void setBoard_Num(int board_Num) {
		this.board_Num = board_Num;
	}

	@Override
	public String toString() {
		return "Card [card_Num=" + card_Num + ", card_Name=" + card_Name + ", card_start_Date=" + card_start_Date
				+ ", card_due_Date=" + card_due_Date + ", card_reg_Date=" + card_reg_Date + ", card_content="
				+ card_content + ", card_Clear=" + card_Clear + ", card_Order=" + card_Order + ", card_Calendar="
				+ card_Calendar + ", user_Num=" + user_Num + ", label_Num=" + label_Num + ", file_Num=" + file_Num
				+ ", board_Num=" + board_Num + "]";
	}

	
	
	
	
}
