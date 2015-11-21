package twevent.pennywiseplayer.impl;

import java.util.List;
import java.util.Scanner;

import twevent.entity.Player;
import twevent.pennywiseplayer.PennyWisePlayer;
import twevent.pennywisetable.impl.PennyWiseTableImpl;

public class PennyWisePlayerImpl implements PennyWisePlayer{
	private Player player;

	public PennyWisePlayerImpl(String desc, List<Integer> coins) {
		super();
		player = new Player();
		this.player.setCoins(coins);
		this.player.setName(desc);
	}
	
	public Integer addPlayerCoin(Integer coin){
		if(player.getCoins().add(coin)){
			return coin;
		}
		else{
			return new Integer(-1);
		}
	}
	
	
	public Integer removePlayerCoin(Integer coin){
		if(player.getCoins().remove(coin)){
			return coin;
		}
		else{
			return new Integer(-1);
		}
	}
	
	public Boolean isEmpty(){
		return player.getCoins().isEmpty();
	}
	
	public void addPlayerCoins(List<Integer> coins){
		for (Integer integer : coins) {
			player.getCoins().add(integer);
		}
		
	}
	
	public int ChooseAndRemoveCoin(){
		System.out.println("Choose a coin to remove from " + player.getName());
		displayCoins();
		PennyWiseTableImpl.getPenniWiseTable().displayCoins();
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Integer value = removePlayerCoin(num);
		while(value == -1){
			System.out.println("Choose a coin to remove from " + player.getName());
			displayCoins();
			 in = new Scanner(System.in);
			 num = in.nextInt();
			 value = removePlayerCoin(num);
		}
		return num;
	}
	
	public void displayCoins(){
		for (Integer integer : player.getCoins()) {
			System.out.print(integer + " ");
		}
		System.out.println();
	}
}
