package Buoi8_BTVN.Model.Enum;

public enum PhongHoc {
	A101("Phong A101",1),
	A102("Phong A102",2),
	A103("Phong A103",3),
	B101("Phong B101",4),
	B102("Phong B102",5),
	B103("Phong B103",6);

	public int value;
	public final String label;

	private PhongHoc(String label,int value) {
		this.value = value;
		this.label = label;
	}
	
	public static PhongHoc getPhonghoc(int x) {
		for (PhongHoc i : values()) {
			if (i.value == x)
				return i;
		}
		return null;
	}
}
