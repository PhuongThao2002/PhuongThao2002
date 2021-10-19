package Buoi8_BTVN.Model.Enum;

public enum ViTriTruc {
	CBV("Cong bao ve",1), 
	NVS("Nha ve sinh",2), 
	NHA_A("Nha A",3), 
	NHA_B("Nha BNha B",4), 
	NHA_C("Nha C",5), 
	NHA_D("Nha D",6);

	public int value;
	public final String label;

	private ViTriTruc(String label,int value) {
		this.value = value;
		this.label = label;
	}

	public static ViTriTruc getVitritruc(int x) {
		for (ViTriTruc i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
