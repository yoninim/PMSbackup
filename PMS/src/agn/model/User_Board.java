package agn.model;

import java.io.Serializable;

public class User_Board implements Serializable {
	private int user_board_num;
	private int user_num;
	private int board_num;
	
	public User_Board() {}
	
	public User_Board(int user_board_num, int user_num, int board_num) {
		super();
		this.user_board_num = user_board_num;
		this.user_num = user_num;
		this.board_num = board_num;
	}

	public int getUser_board_num() {
		return user_board_num;
	}

	public void setUser_board_num(int user_board_num) {
		this.user_board_num = user_board_num;
	}

	public int getUser_num() {
		return user_num;
	}

	public void setUser_num(int user_num) {
		this.user_num = user_num;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	@Override
	public String toString() {
		return "User_Board [user_board_num=" + user_board_num + ", user_num=" + user_num + ", board_num=" + board_num
				+ "]";
	}
	
	
}
