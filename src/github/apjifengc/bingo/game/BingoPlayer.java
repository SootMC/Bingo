package github.apjifengc.bingo.game;

import org.bukkit.entity.Player;

import lombok.Getter;

/**
 * 代表一个在 Bingo 游戏中的玩家
 * 
 * @author Yoooooory
 *
 */
public class BingoPlayer {

	@Getter
	Player player;

	@Getter
	BingoGame game;

	boolean[] finishedTasks = new boolean[25];

	public BingoPlayer(Player player, BingoGame game) {
		this.player = player;
		this.game = game;
	}

	public boolean hasFinished(int index) {
		return finishedTasks[index];
	}

	public boolean hasFinished(BingoTask task) {
		return finishedTasks[game.getTasks().indexOf(task)];
	}

	public void setFinished(int index, boolean bool) {
		finishedTasks[index] = bool;
	}

	public void setFinished(BingoTask task, boolean bool) {
		finishedTasks[game.getTasks().indexOf(task)] = bool;
	}

}
