package twevent.pennywisetable.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import twevent.entity.Table;

public class PennyWiseTableImpl {
	
	private static PennyWiseTableImpl pw;
	Table table;
	
	private PennyWiseTableImpl(){
		table = new Table();
	}
	
	static public PennyWiseTableImpl getPenniWiseTable(){
		if(pw == null){
			pw = new PennyWiseTableImpl();
		}
		
		return pw;
	}
	
	public Integer addCoinTable(Integer coin){
		if(table.getCoins().add(coin)){
			return coin;
		}
		else{
			return new Integer(-1);
		}
	}
	
	public Integer removeCoinTable(Integer coin) {
		if(table.getCoins().remove(coin)){
			return coin;
		}
		else{
			return new Integer(-1);
		}
	}
	
	public void displayCoins(){
		if(table.getCoins()==null){
			return;
		}
		for(Integer i : table.getCoins()){
			System.out.print(i +  " ");
		}
		System.out.println("");
	}
	
	public Boolean isEmpty(){
		return (table.getCoins().isEmpty());
	
	}

	public List<Integer> ChooseAndRemoveCoins(int coin) {
		// TODO Auto-generated method stub
		List<Integer> removedCoins = new ArrayList<Integer>();
		int choosenCoin,value =-1;
		
		
		Scanner in = new Scanner(System.in);
		
		
		while(value == -1){
			System.out.println("Select the coin to remove from table");
			displayCoins();
			choosenCoin = in.nextInt();
			if(choosenCoin==0){
				return removedCoins;
			}
			else if(choosenCoin >= coin){
				System.out.println("select a coin less than the added coin "+ coin);
				value = -1;
			}
			else{
				value = removeCoinTable(choosenCoin);
				if(value !=-1){
					removedCoins.add(value);
				}
				else{
					System.out.println("Please select a valid coin");
				}
				value = -1;
			}
		}
		
		return removedCoins;
		
	}

}
