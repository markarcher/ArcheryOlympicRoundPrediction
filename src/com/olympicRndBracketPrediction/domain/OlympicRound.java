package com.olympicRndBracketPrediction.domain;

public class OlympicRound {
	private String opponentOne;
	private String oppentTwo;
	private String opponentThree;
	private String opponentFour;
	private String formatType;
	private boolean possibleMatchUp;
	private String matchUpBetween;
	public OlympicRound(String opponentOne, String oppentTwo,
			String opponentThree, String opponentFour, String formatType,
			boolean possibleMatchUp, String matchUpBetween) {
		super();
		this.opponentOne = opponentOne;
		this.oppentTwo = oppentTwo;
		this.opponentThree = opponentThree;
		this.opponentFour = opponentFour;
		this.formatType = formatType;
		this.possibleMatchUp = possibleMatchUp;
		this.matchUpBetween = matchUpBetween;
	}
	public String getOpponentOne() {
		return opponentOne;
	}
	public void setOpponentOne(String opponentOne) {
		this.opponentOne = opponentOne;
	}
	public String getOppentTwo() {
		return oppentTwo;
	}
	public void setOppentTwo(String oppentTwo) {
		this.oppentTwo = oppentTwo;
	}
	public String getOpponentThree() {
		return opponentThree;
	}
	public void setOpponentThree(String opponentThree) {
		this.opponentThree = opponentThree;
	}
	public String getOpponentFour() {
		return opponentFour;
	}
	public void setOpponentFour(String opponentFour) {
		this.opponentFour = opponentFour;
	}
	public String getFormatType() {
		return formatType;
	}
	public void setFormatType(String formatType) {
		this.formatType = formatType;
	}
	public boolean isPossibleMatchUp() {
		return possibleMatchUp;
	}
	public void setPossibleMatchUp(boolean possibleMatchUp) {
		this.possibleMatchUp = possibleMatchUp;
	}
	public String getMatchUpBetween() {
		return matchUpBetween;
	}
	public void setMatchUpBetween(String matchUpBetween) {
		this.matchUpBetween = matchUpBetween;
	}
	
	
	
}
