package Buoi7_HR.enumm;

public enum Time {
	TIET_1(1), TIET_2(2), TIET_3(3), TIET_4(4), TIET_5(5);

	public int value;

	private Time(int value) {
		this.value = value;
	}

	public static Time gettime(int x) {
		for (Time i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
