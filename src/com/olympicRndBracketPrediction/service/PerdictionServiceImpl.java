package com.olympicRndBracketPrediction.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.olympicRndBracketPrediction.domain.OlympicRound;
import com.olympicRndBracketPrediction.domain.Pair;


public class PerdictionServiceImpl implements PerdictionService {

	@Override
	public void calculateMatchUp(OlympicRound olympicRound) {
		// TODO Auto-generated method stub
		String format = olympicRound.getFormatType();
		
		switch(format){
		case "oneOneTwentyEight":
			
			int oneOneTwentyEightRound[] = new int[64];
			int pair1[] = new int[2];
				
			break;
		case "oneSixtyFour":
			
			break;
		case "oneThirtyTwo":
	
			calculateOneThirtyTwoFormat(olympicRound);
			break;
		case "oneSixteen":
			calculateOneSixteenFormat(olympicRound);
			break;
		default:
			break;
		
		};
	}

	private void calculateOneThirtyTwoFormat(OlympicRound olympicRound) {
		int pairingOrder[] = new int[16];
		List<Pair> bracketMatchUp = new ArrayList<>();
		Map <Integer, Pair> hm = new HashMap<Integer, Pair>();
		pairingOrder[0] = 1;
		pairingOrder[1] = 16;
	    pairingOrder[2] = 9;
	    pairingOrder[3] = 8;
	    pairingOrder[4] = 5;
	    pairingOrder[5] = 12;
	    pairingOrder[6] = 13; 
	    pairingOrder[7] = 4;
	    pairingOrder[8] = 3;
	    pairingOrder[9] = 14;
	    pairingOrder[10] = 11;
	    pairingOrder[11] = 6;
	    pairingOrder[12] = 7;
	    pairingOrder[13] = 10;
	    pairingOrder[14] = 15;
	    pairingOrder[15] = 2;
	    
	    int j=32;
		for(int i=0; i<= 15; i++){
			int tmp = i+1;
					Pair pair = new Pair();
					pair.setPair1(tmp);
					pair.setPair2(j);
					bracketMatchUp.add(pair);
						hm.put(pairingOrder[i], pair);	
				j--;			
		}
		predictPossibleMatchUp(olympicRound,hm);
				
	}

	private void calculateOneSixteenFormat(OlympicRound olympicRound) {
		// TODO Auto-generated method stub
		int pairingOrder[] = new int[8];
		List<Pair> bracketMatchUp = new ArrayList<>();
		Map <Integer, Pair> hm = new HashMap<Integer, Pair>();

		pairingOrder[0] = 1;
		pairingOrder[1] = 8;
		pairingOrder[2] = 5;
		pairingOrder[3] = 4;
		pairingOrder[4] = 3;
		pairingOrder[5] = 6;
		pairingOrder[6] = 7;
		pairingOrder[7] = 2;
	
		int j=16;
			for(int i=0; i<= 7; i++){
				int tmp = i+1;
						Pair pair = new Pair();
						pair.setPair1(tmp);
						pair.setPair2(j);
						bracketMatchUp.add(pair);
							hm.put(pairingOrder[i], pair);	
					j--;			
			}
			predictPossibleMatchUp(olympicRound,hm);
	 }

	private void predictPossibleMatchUp(OlympicRound olympicRound,
			Map<Integer, Pair> hm) {
		List<String> possibleMatchesList = new ArrayList<>(); 

		int opponentOne = Integer.parseInt(olympicRound.getOpponentOne());
		int opponentTwo = Integer.parseInt(olympicRound.getOppentTwo());
		int opponentThree = Integer.parseInt(olympicRound.getOpponentThree());
		int opponentFour = Integer.parseInt(olympicRound.getOpponentFour());
		
		for (Map.Entry<Integer, Pair> entry : hm.entrySet())
		{
			int pair1 = entry.getValue().getPair1();
			int pair2 = entry.getValue().getPair2();
			//System.out.println("pairing: "+pair1+"vs"+pair2);
			
			if((pair1 == opponentOne || pair1 == opponentTwo || pair1 == opponentThree || pair1 == opponentFour)){
				if(pair2 == opponentOne  ||	pair2 == opponentTwo || pair2 == opponentThree || pair2 == opponentFour){
					possibleMatchesList.add( pair1+" vs "+pair2);
				}
			}
	    }
		//System.out.println(possibleMatchesList.size());
		 Map<Integer, Pair> treeMap = new TreeMap<Integer, Pair>(hm);
	        printMap(treeMap);
		if(possibleMatchesList.size() != 0){
			System.out.println("Possible number of match: "+possibleMatchesList.size());
			for(int i=0; i < possibleMatchesList.size(); i++ ){
				System.out.println(possibleMatchesList.get(i));
			}			
		}else{
			if(olympicRound.getFormatType().toString().equals("oneSixteen")){
				System.out.println("quarter Finals");
				Map<Integer, Pair> quarterFinalsFrmOneSixtn = new HashMap<Integer, Pair>();
				List<Integer> listOfAdvancingArchers = new ArrayList<>(); 
				int advancingArcher;
		
				for(Entry<Integer, Pair> entry : hm.entrySet()){
					int pair1 = entry.getValue().getPair1();
					int pair2 = entry.getValue().getPair2();
					if((pair1 == opponentOne || pair1 == opponentTwo || pair1 == opponentThree || pair1 == opponentFour)){
						advancingArcher = pair1;
					}else if(pair2 == opponentOne  ||	pair2 == opponentTwo || pair2 == opponentThree || pair2 == opponentFour){
						advancingArcher = pair2;
					}else{
						if(pair1 < pair2){
							advancingArcher = pair1;	
						}else{
							advancingArcher = pair2;
						}
					}
										
					listOfAdvancingArchers.add(advancingArcher);
				}
				int i = 0,p1 = 0,p2,j=0;
		
			    for(int arch : listOfAdvancingArchers){
			    	i++;
			    	if((i%2) !=0){
			    		p1=arch;
			    	}else{
			    		p2=arch;
			    		j++;
			    		Pair pairs = new Pair();
			    		pairs.setPair1(p1);
			    		pairs.setPair2(p2);
			    		quarterFinalsFrmOneSixtn.put(j, pairs);
			    	}
						System.out.println("----"+arch);
				}
				 Map<Integer, Pair> treeMapQuarterFinals = new TreeMap<Integer, Pair>(quarterFinalsFrmOneSixtn);
			        printMap(treeMapQuarterFinals);
			}
		//System.out.println("NO POSSIBLE MATCH");
		}
	} 
	

	public static <K, V> void printMap(Map<K, V> map) {
		  for(Entry<K, V> entry : map.entrySet()) {
			  K key = entry.getKey();
			  Pair value = (Pair) entry.getValue();

			  System.out.println(key + " => " + value.getPair1() +"VS"+value.getPair2());
			}
		 /* Object key = map.keySet().toArray(new Object[map.size()])[0];
		  Pair value =  (Pair) map.get(key);
				  System.out.println("mapvalue at index 0:" +value.getPair1());*/
	    
	    }
}
