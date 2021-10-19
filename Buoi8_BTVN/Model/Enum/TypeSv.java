package Buoi8_BTVN.Model.Enum;

public enum TypeSv {
	CQ("Chinh quy",1),
	LT("Lien thong",2),
	TC("Tai chuc",3);

	public int value;
	public final String label;

	private TypeSv(String label,int value) {
		this.value = value;
		this.label = label;
	}

	public static TypeSv getTypeSv(int x) {
		for (TypeSv i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
