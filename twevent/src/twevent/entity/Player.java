package twevent.entity;

import java.util.List;

public class Player {
	private String name;
	private List<Integer> coins;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getCoins() {
		return coins;
	}
	public void setCoins(List<Integer> coins) {
		this.coins = coins;
	}
	

}
