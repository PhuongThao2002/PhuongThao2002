package Buoi8_BTVN.Model.Enum;

public enum Time {
	T1("TIET 1",1), 
	T2("TIET 2",2), 
	T3("TIET 3",3), 
	T4("TIET 4",4), 
	T5("TIET 5",5);

	public int value;
	public final String label;

	private Time(String label,int value) {
		this.value = value;
		this.label = label;
	}

	public static Time gettime(int x) {
		for (Time i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
