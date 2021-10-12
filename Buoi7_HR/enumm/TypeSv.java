package Buoi7_HR.enumm;

public enum TypeSv {
	CHINHQUY(1), LIENTHONG(2), TAICHUC(3);

	public int value;

	private TypeSv(int value) {
		this.value = value;
	}

	public static TypeSv getTypeSv(int x) {
		for (TypeSv i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
