package Buoi8_BTVN.Model.Enum;

public enum Gioitinh {
	NAM("Nam",1), 
	NU("Nu",0), 
	KHAC("Khac",2);

	public int value;
	public final String label;

	private Gioitinh(String label,int value) {
		this.value = value;
		this.label=label;
	}

	public static Gioitinh getGioitinh(int value) {
		for (Gioitinh i : values()) {
			if (i.value == value)
				return i;
		}
		return null;
	}
}
