package Buoi7_HR.enumm;

public enum Chucvu {
	VESINH(0), BAOVE(1), GIANGVIEN(2), SINHVIEN(3);

	public int value;

	private Chucvu(int value) {
		this.value = value;
	}

	public static Chucvu getChucvu(int x) {
		for (Chucvu i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
