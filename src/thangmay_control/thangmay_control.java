package thangmay_control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import Thangmay_model.Nguoidung;
import Thangmay_view.Thangmay_view;

public class thangmay_control  implements ActionListener {
    Nguoidung nd = new Nguoidung(null, null, null, null);
	Thangmay_view tmv ;
	public thangmay_control(Thangmay_view tmv) {
		this.tmv = tmv;
	}

	@Override
	public void actionPerformed(ActionEvent e){
		String nut = e.getActionCommand();
		if(nut.equals("START"))
		{
			tmv.setcolorstart();
			tmv.dongcua();
			tmv.chophep(true);
		}
		if(nut.equals("STOP"))
		{
			tmv.setcolorstop();
			tmv.chophep(false);
		}
		if(nut.equals("Find"))
		{
			String input = JOptionPane.showInputDialog("Nhap ID muon tim");
			System.out.println(input);
			nd.hienThiThongTinNguoiDung(input);
			
		}	
		if(nut.equals("Exists"))
		{
			System.exit(0);
		}	
		else if(nut.equals("Đăng nhập"))
		{
			tmv.ketnoidatabase();
			tmv.Dangnhap();
		}	
		else if(nut.equals("Đăng kí"))
		{
			tmv.Dangki();
		}
		else if(nut.equals("CLOSE"))
		{
			tmv.chuyendongdong();
			
		}	
		else if(nut.equals("OPEN"))
		{
			tmv.chuyendongmo();
		}	
		if(nut.equals(4+""))
		{
			
			tmv.dithangmay4duoilen();
			tmv.chomocua_dongcua();
			tmv.doimau(4);
		}
		if(nut.equals(3+""))
		{
		tmv.chomocua_dongcua();
			tmv.dithangmay3trenxuong();
			tmv.dithangmay3duoilen();
			tmv.doimau(3);
		}
		if(nut.equals(2+""))
		{
			tmv.dithangmay2trenxuong();
			tmv.dithangmay2duoilen();
			tmv.chomocua_dongcua();
			tmv.doimau(2);
		}
			
		if(nut.equals(1+""))
		{
			
			tmv.dithangmay1duoilen();
			tmv.dithangmay1trenxuong();
			tmv.chomocua_dongcua();
			tmv.doimau(1);
		}
		
		if(nut.equals("HELP"))
		{
			JOptionPane.showMessageDialog(null,"Vui lòng liên hệ số điện thoại: 012345789");
		}
		
		
	}

}
