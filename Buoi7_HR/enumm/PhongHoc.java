package Buoi7_HR.enumm;

public enum PhongHoc {
	A101(1),A102(2),A103(3),B101(4),B102(5),B103(6);

	public int value;

	private PhongHoc(int value) {
		this.value = value;
	}
	public static PhongHoc getPhonghoc(int x) {
		for (PhongHoc i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
