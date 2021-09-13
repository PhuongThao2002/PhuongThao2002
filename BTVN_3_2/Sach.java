package BTVN_3_2;

public class Sach 
{
	Tacgia tg;
    Trangthai tt;
    String name;
    int soluong;
    public Sach(Tacgia tg, Trangthai tt, String name, int soluong) {
        super();
        this.tg = tg;
        this.tt = tt;
        this.name = name;
        this.soluong = soluong;
    }

    public Tacgia gettacgia() {
        return tg;
    }

    public Trangthai gettrangthai() {
        return tt;
    }

    public String getname() {
        return name;
    }

    public int getsoluong() {
        return soluong;
    }
}
