package com.olympicRndBracketPrediction.domain;

public class Pair {
	private int pair1;
	private int pair2;
	
	public Pair() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pair(int pair1, int pair2) {
		super();
		this.pair1 = pair1;
		this.pair2 = pair2;
	}
	public int getPair1() {
		return pair1;
	}
	public void setPair1(int pair1) {
		this.pair1 = pair1;
	}
	public int getPair2() {
		return pair2;
	}
	public void setPair2(int pair2) {
		this.pair2 = pair2;
	}
	
}
