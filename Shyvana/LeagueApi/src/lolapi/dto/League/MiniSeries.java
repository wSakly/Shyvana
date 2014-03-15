package lolapi.dto.League;

public class MiniSeries {
	private int losses;	
	private String progress;	
	private int target;	
	private long timeLeftToPlayMillis;	
	private int wins;
	/**
	 * @return the losses
	 */
	public int getLosses() {
		return losses;
	}
	/**
	 * @return the progress
	 */
	public String getProgress() {
		return progress;
	}
	/**
	 * @return the target
	 */
	public int getTarget() {
		return target;
	}
	/**
	 * @return the timeLeftToPlayMillis
	 */
	public long getTimeLeftToPlayMillis() {
		return timeLeftToPlayMillis;
	}
	/**
	 * @return the wins
	 */
	public int getWins() {
		return wins;
	}

	
}
