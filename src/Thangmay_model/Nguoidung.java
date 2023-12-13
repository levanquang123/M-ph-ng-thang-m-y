package Thangmay_model;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import Thangmay_view.Thangmay_view;

public class Nguoidung {
	private Thangmay_view thangmayview = new Thangmay_view(null);
	private ArrayList<Nguoidung> danhsach = new ArrayList<Nguoidung>();
		private String name;
		private String id;
		private String email;
		private String password;
		
		public Nguoidung(String name, String id, String email, String password) {
			this.name = name;
			this.id = id;
			this.email = email;
			this.password = password;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getId() {
			return id;
		}
	
		public void setId(String id) {
			this.id = id;
		}
		
		public String getEmail() {
			return email;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
		public void themnguoidung(Nguoidung nd)
		{
			this.danhsach.add(nd);
		}
		//ArrayList<Nguoidung> listtimkiem = new ArrayList<Nguoidung>();
		public Nguoidung timKiemTheoID(String id) {
		    for (Nguoidung nguoidung : danhsach) {
		        if (nguoidung.getId().equals(id)) {
		            return nguoidung;
		        }
		    }
		    return null;
		}
		public void hienThiThongTinNguoiDung(String id) {
		    Nguoidung nguoidung = timKiemTheoID(id);

		    if (nguoidung != null) {
		        // Xóa dữ liệu cũ trong JTable (nếu cần)
		        // tmv.xoaTatCa();

		        // Thêm dữ liệu mới vào JTable
		        thangmayview.themrow(new String[] {
		            nguoidung.getId(),
		            nguoidung.getName(),
		            nguoidung.getEmail(),
		            // Thêm các thuộc tính khác tùy thuộc vào đối tượng Nguoidung
		        });
		        JOptionPane.showMessageDialog(null, "thành công");
		    } else {
		        System.out.println("Không tìm thấy người dùng với ID: " + id);
		    }
		}


}