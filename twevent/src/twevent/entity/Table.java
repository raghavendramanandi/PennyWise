package twevent.entity;

import java.util.ArrayList;
import java.util.List;

public class Table {
	private String desc;
	private List<Integer> coins;
	
	
	
	public Table() {
		super();
		this.desc = "";
		this.coins = new ArrayList<Integer>();
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public List<Integer> getCoins() {
		return coins;
	}
	public void setCoins(List<Integer> coins) {
		this.coins = coins;
	}
	
	
}
