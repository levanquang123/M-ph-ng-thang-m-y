package Thangmay_model;

import java.util.Objects;


public class Nguoidungmoi extends Nguoidung{
	private String phone;
	private String sex;
	 
	
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

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nguoidungmoi other = (Nguoidungmoi) obj;
		return Objects.equals(this.getId(), other.getId()); 
	}

	@Override
	public String toString() {
		return "Nguoidungmoi [phone=" + phone + ", sex=" + sex + ", name=" + name + ", id=" + id + ", email=" + email
				+ ", password=" + password + "]";
	}

}
