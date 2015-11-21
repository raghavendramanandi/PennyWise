package twevent.pennywiseplayer;

import java.util.List;

public interface PennyWisePlayer {
	public Integer addPlayerCoin(Integer coin);
	
	public Integer removePlayerCoin(Integer coin);
	
	public Boolean isEmpty();

	public void addPlayerCoins(List<Integer> coins);

	public int ChooseAndRemoveCoin();
}
