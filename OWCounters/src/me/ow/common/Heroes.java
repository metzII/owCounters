package me.ow.common;

public enum Heroes {
	ANA("ana"),
	BASTION("bastion"),
	DVA("dva"),
	GENJI("genji"),
	HANZO("hanzo"),
	JUNKRAT("junkrat"),
	LUCIO("lucio"),
	MCCREE("mccree"),
	MEI("mei"),
	MERCY("mercy"),
	PHARAH("pharah"),
	REAPER("reaper"),
	REINHARDT("reinhardt"),
	ROADHOG("roadhog"),
	SOLDIER("soldier-76"),
	SYMMETRA("symmetra"),
	TORBJORN("torbjorn"),
	TRACER("tracer"),
	WIDOWMAKER("widowmaker"),
	WINSTON("winston"),
	ZARYA("zarya"),
	ZENYATTA("zenyatta");
	
	private final String link;
	
	private Heroes(String link){
		this.link = link;
	}
	
	public String getLink(){
		return link;
	}
}
