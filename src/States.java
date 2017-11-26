
public enum States {
	OHIO(18),
	PENNSYLVANIA(21),
	TEXAS(38),
	GEORGIA(16),
	FLORIDA(29);
	
	private int votes;
	private States (int votes){		
		this.votes = votes;
	}

	public int getElectoralVotes(){
	return votes;
	}
}
