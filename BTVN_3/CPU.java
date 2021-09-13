package BTVN_3;

public class CPU
{
	private String name;
	private Hang hang;
	private int MatchID;
	public CPU(String name, Hang hang, int MatchID)
	{
		this.name = name;
		this.hang = hang;
		this.MatchID = MatchID;
	}
	public String getName() {
        return name;
    }

    public Hang getHang() {
        return hang;
    }
    public int getMatchID() {
        return MatchID;
    }
}
