package twevent.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import twevent.pennywiseplayer.PennyWisePlayer;
import twevent.pennywiseplayer.impl.PennyWisePlayerImpl;
import twevent.pennywisetable.impl.PennyWiseTableImpl;

public class PennyWise {
	private PennyWisePlayer player1;
	private PennyWisePlayer player2;
	private Integer turn;
	
	public void start(){
		initialize();
		play();
	}
	
	public void initialize(){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of coins");
		int num = in.nextInt();
		int value;
		List<Integer> coins1 = new ArrayList<Integer>();
		List<Integer> coins2 = new ArrayList<Integer>();
		for(int i=0;i<num;i++){
			value = in.nextInt();
			coins1.add(value);
			coins2.add(value);
		}
		
		player1 = new PennyWisePlayerImpl("player 1", coins1);
		player2 = new PennyWisePlayerImpl("player 2", coins2);
				
		turn = 1;	
			
	}
	
	public void play(){
		PennyWiseTableImpl  gameTablePW = PennyWiseTableImpl.getPenniWiseTable();
		int coin, addedCoin;
		List<Integer> choosenCoins;
		while((!player1.isEmpty()) && (!player2.isEmpty())){
			//select coin to add
			//add coint to table
			// remove coin form player
			//show coins to take
			//take coin / coins
			
			if(turn == 1){
				coin = player1.ChooseAndRemoveCoin();
				addedCoin = gameTablePW.addCoinTable(coin);
				choosenCoins  = gameTablePW.ChooseAndRemoveCoins(coin);
				player1.addPlayerCoins(choosenCoins);
				turn = 2;
			}
			else{
				coin = player2.ChooseAndRemoveCoin();
				addedCoin = gameTablePW.addCoinTable(coin);
				choosenCoins  = gameTablePW.ChooseAndRemoveCoins(coin);
				player2.addPlayerCoins(choosenCoins);
				turn = 1;
			}
			
		}
		if(player1.isEmpty()){
			System.out.println("player 2 Win!.");
			
		}
		else{
			System.out.println("player 1 Win!.");
		}
		
	}
	
}
