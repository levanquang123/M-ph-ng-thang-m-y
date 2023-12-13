package Thangmay_model;

import java.util.ArrayList;

public class Nguoidungmoi extends Nguoidung{
	private String phone;
	private String sex;
	private ArrayList<Nguoidung> danhsachnguoimoi = new ArrayList<Nguoidung>();
	
	public Nguoidungmoi(String name, String id, String email, String password, String phone, String sex) {
		super(name, id, email, password);
		this.phone = phone;
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public ArrayList<Nguoidung> getDanhsachnguoimoi() {
		return danhsachnguoimoi;
	}

	public void setDanhsachnguoimoi(ArrayList<Nguoidung> danhsachnguoimoi) {
		this.danhsachnguoimoi = danhsachnguoimoi;
	}

	public void themnguoimoi(Nguoidungmoi ndm)
	{
		this.danhsachnguoimoi.add(ndm);
	}
		
	

}
