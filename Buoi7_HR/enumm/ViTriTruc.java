package Buoi7_HR.enumm;

public enum ViTriTruc {
	CONGBAOVE(1), NHAVESINH(2), NHA_A(3), NHA_B(4), NHA_C(5), NHA_D(6);

	public int value;

	private ViTriTruc(int value) {
		this.value = value;
	}

	public static ViTriTruc getVitritruc(int x) {
		for (ViTriTruc i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
