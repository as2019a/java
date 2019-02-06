package com.inc.bluemarble;

import java.io.Serializable;

public class Message implements Serializable {
	private String nickName;
	private String msg;
	private int type;
	
	Player player;
	
	public Message(String nickName, String msg, Player player, int type) {
		this.nickName = nickName;
		this.msg = msg;
		this.type = type;
		this.player = player;
	}

	
	public static final int START = 0;
	public static final int SEND = 1;
	public static final int EXIT = 2;
	public static final int PLAYER = 3;
	
	
	public String getNickName() {
		return nickName;
	}
	public String getMsg() {
		return msg;
	}
	public int getType() {
		return type;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public void setType(int type) {
		this.type = type;
	}
	public static int getPlayer() {
		return PLAYER;
	}

}
