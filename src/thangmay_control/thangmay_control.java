package thangmay_control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

import Thangmay_view.Thangmay_view;

public class thangmay_control  implements ActionListener {
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
			tmv.chomocua_dongcua();
			tmv.chophep(true);
			tmv.Animation();
			tmv.chophepstop();
		}
		if(nut.equals("STOP"))
		{
			tmv.setcolorstop();
			tmv.chophepsstart();
			tmv.chophep(false);
			
		}
		if(nut.equals("Find"))
		{
			String input = (String) JOptionPane.showInputDialog("Nhap ID muon tim");
			tmv.timkiem(input);
		}	
		if(nut.equals("Exit"))
		{
			System.exit(0);
		}	
		else if(nut.equals("Đăng nhập"))
		{
			tmv.Dangnhap();
		}	
		else if(nut.equals("Đăng kí"))
		{
			tmv.Dangki();
		}
		else if(nut.equals("CLOSE"))
		{
			tmv.setcolorclose();
			tmv.chuyendongdong();
			tmv.chobamnut(true);
		}	
		else if(nut.equals("OPEN"))
		{
			tmv.setcoloropen();
			tmv.chuyendongmo();
			tmv.kochobamnut();
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
		if(nut.equals("Tất cả người đk"))
		{
			tmv.getlistnd();
		}
		if(nut.equals("Theo giới tinh"))
		{
			
			tmv.showPieChart();
		}
		if(nut.equals("Theo tên"))
		{
			tmv.showBarchart();
		}
	}
}
