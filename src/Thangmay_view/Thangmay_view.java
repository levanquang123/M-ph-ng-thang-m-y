package Thangmay_view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import Thangmay_model.Nguoidung;
import Thangmay_model.Nguoidungmoi;
import thangmay_control.thangmay_control;

public class Thangmay_view extends JFrame{
	private Nguoidung nguoidung;
	private Nguoidungmoi nguoidungmoi;
	private JTextField jtext_ten;
	private JTextField jtext_id;
	private JTextField jtext_email;
	private JTextField jtext_password;
	private JPanel jpan_trai;
	private JPanel jpan_phai;
	private JPanel jpan_tong ;
	 DefaultTableModel table ;
	 private JButton help;
	 private JButton warm;
	 private JButton close;
	 private JButton open;
	 private JButton stop;
	 private JButton start;
	 private JButton jbtso1;
	 private JButton jbtso2;
	 private JButton jbtso3;
	 private JButton jbtso4;
     private JTextField jtext_bangdieukhien;
     private JPanel jpan_tang2 ;
     private JPanel jpan_tang3 ;
     private JPanel jpan_tang4;
     private JPanel jpan_tang1;
     private JTextField jtext_tanghientai;
     private JTextField sotan; 
     private JTable data;
     private JPanel jpan_thongtindangnhap;
     private JPanel jpan_thongtindangki;
     private CardLayout cl;
     private JPanel jpan_thongtin;
     private JTextField mau =new JTextField();
	private JTextField jtext_tendangki;
	private JTextField jtext_iddangki;
	private JTextField jtext_emaildangki;
	private JTextField jtext_passworddangki;
	private JLabel jlb_tendangki;
	private JLabel jlb_iddangki;
	private JLabel jlb_emaildangki;
	private JLabel jlb_passworddangki;
	private JLabel jlb_phone;
	private JTextField jtext_phonedangki;
	private JRadioButton jro_nam;
	private JRadioButton jro_nu;
	private String spldangki;
	private String gioitinh;
	private String phonedangki;
	private DefaultTableModel table_dangki;
	private JTable data_dangki;
	private JScrollPane jsroll_dangki;
	private JPanel jpanthongtindangki;
	private JPanel jpandanhsachdangki;
	private ButtonGroup group;
	private JButton jbt_dangkinew;
	

     
     	public Thangmay_view()
     	{
     		this.nguoidung = new Nguoidung(null,null,null,null);
     		this.init();
     		this.setVisible(true);	
     	}
     	
     	public void init()
     	{ 
     		ActionListener ac = new thangmay_control(this);
     		
     		this.setTitle("THANG MÁY");
     		this.setSize(900,760);
     		this.setLocationRelativeTo(null);
     		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
     		this.setLayout(new BorderLayout());
     		JMenu jmenu_function = new JMenu("Function");
     		
     		JMenuItem find = new JMenuItem("Find");
     		find.addActionListener(ac);
     		jmenu_function.add(find);
     		JButton jbt_exists = new JButton("Exists");
     		JMenuBar jmenubar = new JMenuBar();
     		jmenubar.add(jmenu_function); 
     		jbt_exists.addActionListener(ac);
     		jmenubar.add(jbt_exists);
     		
     		  
     		//mohinhthangmay
     		//tang1
     		JTextField thanhngang = new JTextField(120);
     		thanhngang.setEditable(false);
     		thanhngang.setBounds(15,20,120,15);
     		this.add(thanhngang);
     	    jpan_tang4 = new JPanel();
     		JTextField jtext_tang4 = new JTextField("Tang 4");
     		jtext_tang4.setHorizontalAlignment(JTextField.CENTER);
     		jtext_tang4.setEditable(false);
     		jpan_tang4.setLayout(new BorderLayout());
     		jpan_tang4.add(jtext_tang4, BorderLayout.NORTH);
     		jpan_tang4.setBounds(15,37,120,120);
     		jpan_tang4.setBackground(Color.gray);
     		//this.add(jpan_tang1);
     		//tang2
     		JTextField thanhngang3 = new JTextField(120);
     		thanhngang3.setEditable(false);
     		thanhngang3.setBounds(15,157,120,15);
     		this.add(thanhngang3);
     		 jpan_tang3 = new JPanel();
     		JTextField jtext_tang3 = new JTextField("Tang 3");
     		jtext_tang3.setHorizontalAlignment(JTextField.CENTER);
     		jtext_tang3.setEditable(false);
     		jpan_tang3.setLayout(new BorderLayout());
     		jpan_tang3.add(jtext_tang3, BorderLayout.NORTH);
     		jpan_tang3.setBounds(15,173,120,120);
     		jpan_tang3.setBackground(Color.gray);
     		//tang3
     		JTextField thanhngang2 = new JTextField(120);
     		thanhngang2.setEditable(false);
     		thanhngang2.setBounds(15,290,120,15);
     		 jpan_tang2 = new JPanel();
     		JTextField jtext_tang2 = new JTextField("Tang 2");
     		jpan_tang2.setLayout(new BorderLayout());
     		jtext_tang2.setHorizontalAlignment(JTextField.CENTER);
     		jtext_tang2.setEditable(false);
     		jpan_tang2.add(jtext_tang2, BorderLayout.NORTH);
     		jpan_tang2.setBounds(15,307,120,120);
     		jpan_tang2.setBackground(Color.gray);
     		
     	     this.add(thanhngang2);
     		//tang 4
     		JTextField thanhngang1 = new JTextField(120);
     		thanhngang1.setEditable(false);
     		thanhngang1.setBounds(15,431,120,15);
     		this.add(thanhngang1);
     		 jpan_tang1 = new JPanel();
     		JTextField jtext_tang1 = new JTextField("Tang 1");
     		jpan_tang1.setLayout(new BorderLayout());
     		jtext_tang1.setHorizontalAlignment(JTextField.CENTER);
     		jtext_tang1.setEditable(false);
     		jpan_tang1.add(jtext_tang1, BorderLayout.NORTH);
     		jpan_tang1.setBounds(15,447,120,120);
     		jpan_tang1.setBackground(Color.gray);
     		//this.add(jpan_tang1);
     		JTextField thanhngang5 = new JTextField(120);
     		thanhngang5.setEditable(false);
     		thanhngang5.setBounds(15,568,120,15);
     		this.add(thanhngang5);
     		//thangmay
     		 jpan_tong = new JPanel();
     		jpan_tong.setLayout(new GridLayout(1, 2));
     		jpan_tong.setBackground(Color.gray);
     		//cửa thangmays trái
     		 jpan_trai = new JPanel();
     		jpan_trai.setBackground(Color.BLUE);
     		jpan_tong.add(jpan_trai);
    		//cửa thangmays phai
   		    jpan_phai = new JPanel();
   		    jpan_phai.setBackground(Color.blue);
     		
   		    jpan_tong.add(jpan_phai);
   		    jpan_tong.setBounds(15, 588, 120, 100);
     		this.add(jpan_tong);
     		
     		JPanel jpan_center = new JPanel();
     		this.setLayout(null);
     		
     		// tang hien tại
     		jtext_tanghientai = new JTextField("Tầng hiện tại");
     		jtext_tanghientai.setEditable(false);
     		jtext_tanghientai.setHorizontalAlignment(JTextField.CENTER);
     		jtext_tanghientai.setBounds(150, 15, 70, 20);
     		jtext_tanghientai.setBackground(Color.white);
     	    sotan = new JTextField(3);
     		sotan.setEditable(false);
     		sotan.setBounds(220, 15, 30, 20);
  
     		// Bảng điều khiển trong thang
     		 jtext_bangdieukhien = new JTextField("Bảng điều khiển trong thang");
     		jtext_bangdieukhien.setEditable(false);
     		jtext_bangdieukhien.setHorizontalAlignment(JTextField.CENTER);
     		jtext_bangdieukhien.setBounds(150, 60, 200, 20);
     		jtext_bangdieukhien.setBackground(Color.white);
     		
     		JPanel jpan_bangdieukhien = new JPanel();
     		jpan_bangdieukhien.setLayout(new GridLayout(4,2));
     		jbtso1 = new JButton(1+"");
     		jbtso2 = new JButton(2+"");
     		jbtso3 = new JButton(3+"");
     		jbtso4 = new JButton(4+"");
     		jpan_bangdieukhien.add(jbtso1);
     		jpan_bangdieukhien.add(jbtso2);
     		jpan_bangdieukhien.add(jbtso3);
     		jpan_bangdieukhien.add(jbtso4);
     		jbtso1.addActionListener(ac);
     		jbtso2.addActionListener(ac);
     		jbtso3.addActionListener(ac);
     		jbtso4.addActionListener(ac);
     		
     		 open = new JButton("OPEN");
     		 close = new JButton("CLOSE");
     		 warm = new JButton("WARM");
     		 help = new JButton("HELP");
     		jpan_bangdieukhien.add(open);
     		jpan_bangdieukhien.add(close);
     		jpan_bangdieukhien.add(warm);
     		jpan_bangdieukhien.add(help);
     		jpan_bangdieukhien.setBounds(150, 80, 200, 210);
     		close.addActionListener(ac);
     		open.addActionListener(ac);
     		help.addActionListener(ac);
     		// van hành
     		JPanel jpan_vanhanh = new JPanel();
     		JTextField jtext_vanhanh = new JTextField("Vận hành");
     		jtext_vanhanh.setEditable(false);
     		jtext_vanhanh.setHorizontalAlignment(JTextField.CENTER);
     		jtext_vanhanh.setBounds(150, 300, 200, 20);
     		jtext_vanhanh.setBackground(Color.white);
     		
     		jpan_vanhanh.setLayout(new GridLayout(2,2));
     		mau.setBackground(Color.red);
     		mau.setEditable(false);
     	
     		JTextField 	trangthai = new JTextField("Trạng thái");
     		trangthai.setEditable(false);
     		trangthai.setHorizontalAlignment(JTextField.CENTER);
     		 start = new JButton("START");
     		start.addActionListener(ac);
     		 stop = new JButton("STOP");
     		stop.addActionListener(ac);
     		jpan_vanhanh.add(mau);
     		jpan_vanhanh.add(trangthai);
     		jpan_vanhanh.add(start);
     		jpan_vanhanh.add(stop);
     		jpan_vanhanh.setBounds(150, 320, 200, 200);
     		
     		//thongtin
     		 jpan_thongtindangnhap = new JPanel();
     		JLabel jlb_ten = new JLabel("Tên");
     		JLabel jlb_id = new JLabel("ID");
     		JLabel jlb_email = new JLabel("Email");
     		JLabel jlb_password = new JLabel("Password");
     		
     		 jtext_ten = new JTextField(20);
     		 jtext_id = new JTextField(21);
     		 jtext_email = new JTextField(20);
     		 jtext_password = new JTextField(17);
     		JButton jbt_dangnhap = new JButton("Đăng nhập");
     		jbt_dangnhap.addActionListener(ac);
     		JButton jbt_dangki = new JButton("Đăng kí");
     		jbt_dangki.addActionListener(ac);
     		jpan_thongtindangnhap.setLayout( new FlowLayout(FlowLayout.CENTER,5,25));
     		jpan_thongtindangnhap.add(jlb_ten);
     		jpan_thongtindangnhap.add(jtext_ten);
     		jpan_thongtindangnhap.add(jlb_id);
     		jpan_thongtindangnhap.add(jtext_id);
     		jpan_thongtindangnhap.add(jlb_email);
     		jpan_thongtindangnhap.add(jtext_email);
     		jpan_thongtindangnhap.add(jlb_password);
     		jpan_thongtindangnhap.add(jtext_password);
     		jpan_thongtindangnhap.add(jbt_dangnhap);
     		jpan_thongtindangnhap.add(new JLabel("                  "));
     		jpan_thongtindangnhap.add(jbt_dangki);
     		jpan_thongtindangnhap.setBounds(400, 50, 450, 160);
     		
     		Border border = BorderFactory.createLineBorder(Color.BLUE);
     		TitledBorder titleborder = new TitledBorder(border, "Thông tin");
     		jpan_thongtindangnhap.setBorder(titleborder);
     		this.add(jpan_thongtindangnhap);
     		
     		// tạo table
     		JPanel jpan_danhsach = new JPanel();
     		jpan_danhsach.setLayout(new BorderLayout());
     	
     		Border border_danhsach = BorderFactory.createLineBorder(Color.red);
     		TitledBorder tt_danhsach = new TitledBorder(border_danhsach,"Danh sach");
     		jpan_danhsach.setBorder(tt_danhsach);
     		jpan_danhsach.setBounds(400, 250, 470, 150);
     		this.add(jpan_danhsach);
     		
     		table = new DefaultTableModel();
     		table.addColumn("Name");
     		table.addColumn("ID");
     		table.addColumn("Email");
     		table.addColumn("Password");
     		data =new JTable(table);
     		JScrollPane jsroll = new JScrollPane(data);
     		jpan_danhsach.add(jsroll, BorderLayout.CENTER);
    	    table.addRow(new String [] {"23it.b175", "levanquang", "23it3b","2"});
     		// pannel tong
    	   data.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int index_row = data.getSelectedRow();
				String ten = (String) data.getValueAt(index_row, 0);
				String id = (String) data.getValueAt(index_row, 1);
				String email = (String) data.getValueAt(index_row, 2);
				String password = (String) data.getValueAt(index_row, 3);
				jtext_ten.setText(ten);
				jtext_id.setText(id);
				jtext_email.setText(email);
				jtext_password.setText(password);
			}
			@Override
			public void mousePressed(MouseEvent e) {
			}
			@Override
			public void mouseReleased(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
    	  
    	 table_dangki = new DefaultTableModel();
    	 table_dangki.addColumn("Name");
    	 table_dangki.addColumn("ID");
    	 table_dangki.addColumn("Email");
    	 table_dangki.addColumn("Password");
    	 table_dangki.addColumn("Phone number");
    	 table_dangki.addColumn("Giới tính");
    	 
    	 data_dangki =new JTable(table_dangki);
    	 
    	 jpandanhsachdangki = new JPanel();
    	 jpandanhsachdangki.setLayout(new BorderLayout());
    	 jpandanhsachdangki.setBounds(400, 450, 475, 150);
    	 jsroll_dangki = new JScrollPane(data_dangki);
    	 jpandanhsachdangki.add(jsroll_dangki, BorderLayout.CENTER);
    	 table_dangki.addRow(new String [] {"23it.b175", "levanquang", "23it3b","2","123456","Nam"});
    	 Border border_danhsachdangki = BorderFactory.createLineBorder(Color.red);
    	 TitledBorder tt_danhsachdangki = new TitledBorder(border_danhsachdangki,"Danh sách đăng kí");
    	 jpandanhsachdangki.setBorder(tt_danhsachdangki);
    	 this.add(jpandanhsachdangki, BorderLayout.CENTER);
    		
    		
     		this.add(jtext_bangdieukhien);this.add(jtext_tanghientai);
     		this.add(sotan);jpan_center.add(jtext_vanhanh);
     		this.add(jpan_vanhanh);
     		this.add(jpan_bangdieukhien);
     		this.setJMenuBar(jmenubar);
     	
     		cl = new CardLayout();
		    jpan_thongtin = new JPanel();
			jpan_thongtin.setLayout(cl);
			jpan_thongtin.setBounds(400, 50, 465, 167);
		    jpan_thongtindangki = new JPanel();
		    jpan_thongtindangki.setBounds(400, 50, 450, 200);
			
			//jpannle thongtindangki
	     		 jlb_tendangki = new JLabel("Tên");
	     		 jlb_iddangki = new JLabel("ID");
	     		 jlb_emaildangki = new JLabel("Email");
	     		 jlb_passworddangki= new JLabel("Password");
	     		 jtext_tendangki = new JTextField(20);
	     		 jtext_iddangki = new JTextField(22);
	     		 jtext_emaildangki = new JTextField(20);
	     		 jtext_passworddangki = new JTextField(17);
	     		 jlb_phone = new JLabel(" Phone");
	     		 jtext_phonedangki = new JTextField(20);
	     	     jro_nam = new JRadioButton("Nam");
	     		 jro_nu = new JRadioButton("Nữ");
	     		  group = new ButtonGroup();
	     		 group.add(jro_nam);
	     		 group.add(jro_nu);
	     		jbt_dangkinew = new JButton("Đăng kí ");
	     		jbt_dangkinew.addActionListener( new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {

						String namedangki = jtext_tendangki.getText();
			    		String iddangki = jtext_iddangki.getText();
			    		String emaildangki = jtext_emaildangki.getText();
			    		String passworddangki = jtext_passworddangki.getText();
			    		phonedangki =jtext_phonedangki.getText();
			    		String gioitinh = group.getSelection()+"";
			    		if(jro_nam.isSelected())
			    		{
			    			 gioitinh = "Nam";
			    		}
			    		if (jro_nu.isSelected())
			    		{
			    			gioitinh = "Nữ";
			    		}
			    	    nguoidungmoi = new Nguoidungmoi(namedangki, iddangki, emaildangki, passworddangki,phonedangki, gioitinh);
			    		nguoidungmoi.themnguoidung(nguoidungmoi);
			    		
			    		if(jtext_tendangki.getText().equals("")) { JOptionPane.showMessageDialog(null, "Nhập tên");}
			    	    if(jtext_iddangki.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập id");
			    		 if(jtext_emaildangki.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập email");
			    		 if(jtext_passworddangki.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập password");
			    		 if(jtext_phonedangki.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập Phone");
			    		 else {
			    			 JOptionPane.showMessageDialog(null,"Đăng kí thành công");
			    			 cl.show(jpan_thongtin,"1");
			    			 table_dangki.addRow( new String[]{ namedangki, iddangki, emaildangki, passworddangki,phonedangki,gioitinh});
			    			 jtext_ten.setText("");
			    			 jtext_email.setText("");
			    			 jtext_password.setText("");
			    			 jtext_id.setText("");
			    			 jtext_phonedangki.setText("");
			    			 group.clearSelection();
			    			 };
			    		 
					}});
			
			jpan_thongtindangki.setLayout( new FlowLayout(FlowLayout.CENTER,7,17));
			jpan_thongtindangki.add(jlb_tendangki);
			jpan_thongtindangki.add(jtext_tendangki);
			jpan_thongtindangki.add(jlb_iddangki);
			jpan_thongtindangki.add(jtext_iddangki);
			jpan_thongtindangki.add(jlb_emaildangki);
			jpan_thongtindangki.add(jtext_emaildangki);
			jpan_thongtindangki.add(jlb_passworddangki);
			jpan_thongtindangki.add(jtext_passworddangki);
			jpan_thongtindangki.add(jlb_phone);
			jpan_thongtindangki.add(jtext_phonedangki);
			jpan_thongtindangki.add( new JLabel("                 "));
			jpan_thongtindangki.add(jro_nam);
			jpan_thongtindangki.add( new JLabel("        "));
			jpan_thongtindangki.add(jro_nu);
			jpan_thongtindangki.add(jbt_dangkinew);
			
			
			Border border_dangki = BorderFactory.createLineBorder(Color.blue);
     		TitledBorder titleborder_dangki = new TitledBorder(border_dangki, "Thông tin đăng kí");
     		jpan_thongtindangki.setBorder(titleborder_dangki);
			
			jpan_thongtin.add(jpan_thongtindangnhap,"1");
			jpan_thongtin.add(jpan_thongtindangki,"2");
			cl.show(jpan_thongtin,"1");
			this.add(jpan_thongtin);
     		this.add(jpan_tang4);
     		this.add(jpan_tang3);
     		this.add(jpan_tang2);
     	    this.add(jpan_tang1);
     	}
    	public void setcolorstart()
 		{
    		this.mau.setBackground(Color.GREEN);
 		}
    	public void setcolorstop()
 		{
    		this.mau.setBackground(Color.red);
 		}
    	public void Dangnhap()
    	{
    		String name = jtext_ten.getText();
    		String id = jtext_id.getText();
    		String email = jtext_email.getText();
    		String password = jtext_password.getText();
    	    nguoidung = new Nguoidung(name, id, email, password);
    		nguoidung.themnguoidung(nguoidung);
    		
    		if(jtext_ten.getText().equals("")) { JOptionPane.showMessageDialog(null, "Nhập tên");}
    	    if(jtext_id.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập id");
    		 if(jtext_email.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập email");
    		 if(jtext_password.getText().equals("")) JOptionPane.showMessageDialog(null, "Nhập password");
    		else JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
    		 
    		 table.addRow( new String[]{ name, id, email, password});
    		 jtext_ten.setText("");
    		 jtext_email.setText("");
    		 jtext_password.setText("");
    		 jtext_id.setText("");
    	}
    	public void themrow(String[] id)
    	{
    		table.addRow(id );
    	}

		public Thangmay_view(JTextField jtext_id) throws HeadlessException {
			this.jtext_id = jtext_id;
		}
		public void chuyendongmo()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					for( int i = 60; i >= 1;i--)
					{
						jpan_trai.setSize(i, 120);

		                jpan_phai.setSize(i, 120);
		                jpan_phai.setLocation(jpan_phai.getX() + 1, jpan_phai.getY());
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
			close.setEnabled(true);
			open.setEnabled(false);
		}
		public void chuyendongdong()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					for( int i = 1; i <= 60 ;i++)
					{
						jpan_trai.setSize(i, 120);
						
						jpan_phai.setSize(i, 120);
						jpan_phai.setLocation(jpan_phai.getX() -1 , jpan_phai.getY());
						
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					
				}
			}).start();
			close.setEnabled(false);
			open.setEnabled(true);
		}
		public void chophep( Boolean enable)
		{
			open.setEnabled(enable);
			close.setEnabled(false);
			warm.setEnabled(enable);
			help.setEnabled(enable);
			jbtso1.setEnabled(enable);
			jbtso2.setEnabled(enable);
			jbtso3.setEnabled(enable);
			jbtso4.setEnabled(enable);
			jbtso1.setBackground(Color.white);
			jbtso2.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
		}
		
		public void dithangmay2trenxuong()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang2 = jpan_tang2.getY();
					for( int i = y ;i <= ytang2+16;i++)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15, y+count);
				       
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(2+"");
		}

		public void dithangmay3trenxuong()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang3 = jpan_tang3.getY();
					for( int i = y ;i <= ytang3+16;i++)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15, y+count);
				       
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(3+"");		}
		public void dithangmay1trenxuong()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang1 = jpan_tang1.getY();
					for( int i = y ;i <= ytang1+16;i++)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15, y+count);

						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(1+"");
		}
		public void dithangmay1duoilen()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang1 = jpan_tang1.getY();
					for( int i = y;i >= ytang1+21;i--)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15,y-count );
						
				       
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(1+"");
		}
		public void dithangmay3duoilen()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang3 = jpan_tang3.getY();
					for( int i = y;i >= ytang3+21;i--)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15,y-count );
				       
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(3+"");
		}
		public void dithangmay2duoilen()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang2 = jpan_tang2.getY();
					for( int i = y;i >= ytang2+21;i--)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15,y-count );
				       
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(2+"");
		}
		public void dithangmay4duoilen()
		{
			new Thread( new Runnable() {
				
				@Override
				public void run() {
					int count = 0;
					int y = jpan_tong.getY();
					int ytang4 = jpan_tang4.getY();
					for( int i = y;i >= ytang4+21;i--)
					{
						count ++;
						jpan_tong.setSize(120,100 );
						jpan_tong.setLocation(15,y-count );
				       
						
						try {
							Thread.sleep(2);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}).start();
			close.setEnabled(false);
			sotan.setText(4+"");
		}
		public void ketnoidatabase()   {
			Connection conn ;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				 String url = "jdbc:mysql://localhost:3306/quanlithangmay";
				 String user = "quang";
				 String mk = "123456";
				 try {
					conn =DriverManager.getConnection(url,user,mk);
					String spl = "INSERT INTO thongtin(ten,id,email,password)"+" VALUES(?,?,?,?)";
					PreparedStatement ps = conn.prepareStatement(spl);
					ps.setString(1,jtext_ten.getText());
					ps.setString(2,jtext_id.getText());
					ps.setString(3,jtext_email.getText());
					ps.setString(4,jtext_password.getText());
					ps.executeUpdate();
					
					String sqldangki = "INSERT INTO thongtin(ten,id,email,password,phone,gioitinh)"+" VALUES(?,?,?,?,?,?)";
					PreparedStatement ps1 = conn.prepareStatement(spldangki);
					ps1.setString(1,jtext_tendangki.getText());
					ps1.setString(2,jtext_iddangki.getText());
					ps1.setString(3,jtext_emaildangki.getText());
					ps1.setString(4,jtext_passworddangki.getText());
					ps1.setString(5,jtext_phonedangki.getText());
					ps1.setString(6,jtext_password.getText());
					ps1.executeUpdate();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		public void doimau(int so)
		{
			if(so == 1)
		{
			jbtso1.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			}
			else if(so == 2)
			{
			jbtso2.setBackground(Color.GREEN);
			jbtso1.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			}
			else if(so == 3)
			{
			jbtso3.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso1.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			}
			else if(so == 4)
			{
			jbtso4.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso1.setBackground(Color.white);
			}
	}
		
		public void Dangki()
		{
			cl.show(jpan_thongtin,"2");
		}
		
		public void chomocua_dongcua()
		{
			open.setEnabled(true);
			close.setEnabled(false);
		}
		
		public void dongcua()
		{
			open.setEnabled(true);
			close.setEnabled(false);
		}
}

