package me.ow.common;

import java.util.List;

public class Hero {

	private Heroes name;
	private int posVote;
	private int negVote;
	private List<Hero> strongAgainst;
	private List<Hero> weakAgainst;
	
	
	public Heroes getName() {
		return name;
	}
	public void setName(Heroes name) {
		this.name = name;
	}
	public int getPosVote() {
		return posVote;
	}
	public void setPosVote(int posVote) {
		this.posVote = posVote;
	}
	public int getNegVote() {
		return negVote;
	}
	public void setNegVote(int negVote) {
		this.negVote = negVote;
	}
	public List<Hero> getStrongAgainst() {
		return strongAgainst;
	}
	public void setStrongAgainst(List<Hero> strongAgainst) {
		this.strongAgainst = strongAgainst;
	}
	public List<Hero> getWeakAgainst() {
		return weakAgainst;
	}
	public void setWeakAgainst(List<Hero> weakAgainst) {
		this.weakAgainst = weakAgainst;
	}
}
