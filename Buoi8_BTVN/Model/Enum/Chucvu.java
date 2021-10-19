package Buoi8_BTVN.Model.Enum;

public enum Chucvu {
	VS("Ve sinh",0),
	BV("Bao ve",1), 
	GV("Giang vien",2), 
	SV("Sinh vien",3);

	public final String label;
	public int value;

	private Chucvu(String label,int value) {
		this.value = value;
		this.label = label;
	}

	public static Chucvu getChucvu(int x) {
		for (Chucvu i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
