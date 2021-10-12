package Buoi7_HR.enumm;

public enum Gioitinh {
	NAM(1), NU(0), KHAC(2);

	public int value;

	private Gioitinh(int value) {
		this.value = value;
	}

	public static Gioitinh getGioitinh(int value) {
		for (Gioitinh i : values()) {
			if (i.value == value)
				return i;
		}
		return null;
	}
}
