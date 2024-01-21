package Thangmay_view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.AbstractButton;
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
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;

import Thangmay_model.Nguoidungmoi;
import thangmay_control.thangmay_control;

public class Thangmay_view extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtext_ten;
	private JTextField jtext_id;
	private JTextField jtext_email;
	private JPasswordField jtext_password;
	private JPanel jpan_trai;
	private JPanel jpan_phai;
	private JPanel jpan_tong;
	DefaultTableModel table;
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
	private JPanel jpan_tang2;
	private JPanel jpan_tang3;
	private JPanel jpan_tang4;
	private JPanel jpan_tang1;
	private JTextField jtext_tanghientai;
	private JTextField sotan;
	private JTable data;
	private JPanel jpan_thongtindangnhap;
	private JPanel jpan_thongtindangki;
	private CardLayout cl;
	private JPanel jpan_thongtin;
	private JTextField mau = new JTextField();
	private JTextField jtext_tendangki;
	private JTextField jtext_iddangki;
	private JTextField jtext_emaildangki;
	private JPasswordField jtext_passworddangki;
	private JLabel jlb_tendangki;
	private JLabel jlb_iddangki;
	private JLabel jlb_emaildangki;
	private JLabel jlb_passworddangki;
	private JLabel jlb_phone;
	private JTextField jtext_phonedangki;
	private JRadioButton jro_nam;
	private JRadioButton jro_nu;
	private DefaultTableModel table_dangki;
	private JTable data_dangki;
	private JScrollPane jsroll_dangki;
	private JPanel jpandanhsachdangki;
	private ButtonGroup group;
	private JButton jbt_dangkinew;
	protected Nguoidungmoi nguoidungmoi;
	private Connection conn;
	private ResultSet rs;
	private DefaultPieDataset piedataset;
	private JFreeChart piechart;
	private PiePlot pieplot;
	private ChartPanel chartpannel;
	private JTextField soluong;
	private JTextField jtext_soluong;
	private int number;
	private AbstractButton jbt_dangnhap;
	private JButton giamsl;
	private JButton tangsl;
	private Timer timer;
	private JPanel lon;
	private DefaultCategoryDataset catogorydataset;
	private JMenu thongke;
	private JMenuItem thongke_gioitinh;
	private JMenuItem thongke_ten;
	private JTextField thanhngang;
	private JTextField jtext_tang4;
	private JTextField thanhngang3;
	private JTextField jtext_tang3;
	private JTextField thanhngang2;
	private JTextField jtext_tang2;
	private JTextField thanhngang1;
	private JTextField thanhngang5;
	private Timer timertn;
	private JTextField jtext_tang1;
	private JMenuItem cam;
	private Webcam wedcam;
	private JLabel imageHolder;
	private JFrame jf_webcam;

	public Thangmay_view() {
		this.init();
		this.setVisible(true);
	}

	public void init() {
		ActionListener ac = new thangmay_control(this);

		this.setTitle("THANG MÁY");
		this.setSize(900, 760);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JMenu jmenu_function = new JMenu("File");
		JMenuItem find = new JMenuItem("Find");
		find.addActionListener(ac);
		jmenu_function.add(find);
		JButton jbt_exists = new JButton("Exit");
		JMenuBar jmenubar = new JMenuBar();
		jmenubar.add(jmenu_function);
		jbt_exists.addActionListener(ac);
		Font font = new Font("Arial", Font.BOLD, 11);
		// mohinhthangmay
		// tang1
		thanhngang = new JTextField(120);
		thanhngang.setEditable(false);
		thanhngang.setBounds(15, 20, 120, 15);
		this.add(thanhngang);
		jpan_tang4 = new JPanel();
		jtext_tang4 = new JTextField("Tang 4");
		jtext_tang4.setFont(font);
		jtext_tang4.setHorizontalAlignment(JTextField.CENTER);
		jtext_tang4.setEditable(false);
		jpan_tang4.setLayout(new BorderLayout());
		jpan_tang4.add(jtext_tang4, BorderLayout.NORTH);
		jpan_tang4.setBounds(15, 37, 120, 120);
		jpan_tang4.setBackground(Color.gray);

		// tang2
		thanhngang3 = new JTextField(120);
		thanhngang3.setEditable(false);
		thanhngang3.setBounds(15, 157, 120, 15);
		this.add(thanhngang3);
		jpan_tang3 = new JPanel();
		jtext_tang3 = new JTextField("Tang 3");
		jtext_tang3.setFont(font);
		jtext_tang3.setHorizontalAlignment(JTextField.CENTER);
		jtext_tang3.setEditable(false);
		jpan_tang3.setLayout(new BorderLayout());
		jpan_tang3.add(jtext_tang3, BorderLayout.NORTH);
		jpan_tang3.setBounds(15, 173, 120, 120);
		jpan_tang3.setBackground(Color.gray);
		// tang3
		thanhngang2 = new JTextField(120);
		thanhngang2.setEditable(false);
		thanhngang2.setBounds(15, 290, 120, 15);
		jpan_tang2 = new JPanel();
		jtext_tang2 = new JTextField("Tang 2");
		jtext_tang2.setFont(font);
		jpan_tang2.setLayout(new BorderLayout());
		jtext_tang2.setHorizontalAlignment(JTextField.CENTER);
		jtext_tang2.setEditable(false);
		jpan_tang2.add(jtext_tang2, BorderLayout.NORTH);
		jpan_tang2.setBounds(15, 307, 120, 120);
		jpan_tang2.setBackground(Color.gray);

		this.add(thanhngang2);
		// tang 4
		thanhngang1 = new JTextField(120);
		thanhngang1.setEditable(false);
		thanhngang1.setBounds(15, 431, 120, 15);
		this.add(thanhngang1);
		jpan_tang1 = new JPanel();
		jtext_tang1 = new JTextField("Tang 1");
		jtext_tang1.setFont(font);
		jpan_tang1.setLayout(new BorderLayout());
		jtext_tang1.setHorizontalAlignment(JTextField.CENTER);
		jtext_tang1.setEditable(false);
		jpan_tang1.add(jtext_tang1, BorderLayout.NORTH);
		jpan_tang1.setBounds(15, 447, 120, 120);
		jpan_tang1.setBackground(Color.gray);

		thanhngang5 = new JTextField(120);
		thanhngang5.setEditable(false);
		thanhngang5.setBounds(15, 568, 120, 15);
		this.add(thanhngang5);
		// thangmay
		jpan_tong = new JPanel();
		jpan_tong.setLayout(new GridLayout(1, 2));
		jpan_tong.setBackground(Color.gray);
		// cửa thangmays trái
		jpan_trai = new JPanel();
		jpan_trai.setBackground(Color.BLUE);
		jpan_tong.add(jpan_trai);
		// cửa thangmays phai
		jpan_phai = new JPanel();
		jpan_phai.setBackground(Color.blue);

		jpan_tong.add(jpan_phai);
		jpan_tong.setBounds(15, 588, 120, 100);
		this.add(jpan_tong);

		this.setLayout(null);

		// tang hien tại
		jtext_tanghientai = new JTextField("Tầng hiện tại");
		jtext_tanghientai.setEditable(false);
		jtext_tanghientai.setHorizontalAlignment(JTextField.CENTER);
		jtext_tanghientai.setBounds(150, 12, 70, 20);
		jtext_tanghientai.setBackground(Color.white);
		sotan = new JTextField();
		sotan.setEditable(false);
		sotan.setBounds(221, 12, 30, 20);

		jtext_soluong = new JTextField("Số lượng");
		jtext_soluong.setEditable(false);
		jtext_soluong.setHorizontalAlignment(JTextField.CENTER);
		jtext_soluong.setBounds(190, 35, 70, 20);
		jtext_soluong.setBackground(Color.white);
		this.add(jtext_soluong);
		soluong = new JTextField("0");
		soluong.setHorizontalAlignment(JTextField.CENTER);
		soluong.setEditable(false);
		soluong.setBounds(260, 35, 30, 20);
		this.add(soluong);

		tangsl = new JButton("+");
		tangsl.setBounds(150, 34, 40, 22);
		this.add(tangsl);

		number = Integer.parseInt(soluong.getText());

		tangsl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				number++;
				soluong.setText(number + " ");
				if (number > 3) {
					JOptionPane.showMessageDialog(null, "Thang máy quá tải");
					chobamnut(false);
					warm.setBackground(Color.red);
				}
				if (number == 0) {
					chophep(false);
				}
				if (number <= 3 && number > 0) {
					chophep(true);
				}

			}
		});

		giamsl = new JButton("-");
		giamsl.setBounds(290, 34, 40, 22);
		this.add(giamsl);
		giamsl.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (number > 0) {
					number--;
					soluong.setText(number + " ");
					if (number <= 3 && number > 0) {
						warm.setBackground(Color.white);
						chophep(true);
					}
					if (number == 0) {
						chobamnut(false);
					}
				}
			}
		});

		// Bảng điều khiển trong thang
		jtext_bangdieukhien = new JTextField("Bảng điều khiển trong thang");
		jtext_bangdieukhien.setEditable(false);
		jtext_bangdieukhien.setHorizontalAlignment(JTextField.CENTER);
		jtext_bangdieukhien.setBounds(150, 80, 200, 20);
		jtext_bangdieukhien.setBackground(Color.white);

		JPanel jpan_bangdieukhien = new JPanel();
		jpan_bangdieukhien.setLayout(new GridLayout(4, 2));
		jbtso1 = new JButton(1 + "");
		jbtso2 = new JButton(2 + "");
		jbtso3 = new JButton(3 + "");
		jbtso4 = new JButton(4 + "");
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
		warm = new JButton("WARN");
		help = new JButton("HELP");
		jpan_bangdieukhien.add(open);
		jpan_bangdieukhien.add(close);
		jpan_bangdieukhien.add(warm);
		jpan_bangdieukhien.add(help);
		jpan_bangdieukhien.setBounds(150, 100, 200, 210);
		close.addActionListener(ac);
		open.addActionListener(ac);
		help.addActionListener(ac);
		// van hành
		JPanel jpan_vanhanh = new JPanel();
		JTextField jtext_vanhanh = new JTextField("Vận hành");
		jtext_vanhanh.setEditable(false);
		jtext_vanhanh.setHorizontalAlignment(JTextField.CENTER);
		jtext_vanhanh.setBounds(150, 330, 200, 20);
		jtext_vanhanh.setBackground(Color.white);

		jpan_vanhanh.setLayout(new GridLayout(2, 2));
		mau.setBackground(Color.red);
		mau.setEditable(false);

		JTextField trangthai = new JTextField("Trạng thái");
		trangthai.setEditable(false);
		trangthai.setHorizontalAlignment(JTextField.CENTER);
		start = new JButton("START");
		start.addActionListener(ac);
		stop = new JButton("STOP");
		stop.setEnabled(false);
		stop.addActionListener(ac);
		jpan_vanhanh.add(mau);
		jpan_vanhanh.add(trangthai);
		jpan_vanhanh.add(start);
		jpan_vanhanh.add(stop);
		jpan_vanhanh.setBounds(150, 350, 200, 200);

		// thongtin
		jpan_thongtindangnhap = new JPanel();
		JLabel jlb_ten = new JLabel("Tên");
		JLabel jlb_id = new JLabel("ID");
		JLabel jlb_email = new JLabel("Email");
		JLabel jlb_password = new JLabel("Password");

		jtext_ten = new JTextField(20);
		jtext_id = new JTextField(21);
		jtext_email = new JTextField(20);
		jtext_password = new JPasswordField(17);
		jbt_dangnhap = new JButton("Đăng nhập");
		jbt_dangnhap.setBackground(Color.red);
		jbt_dangnhap.addActionListener(ac);
		JButton jbt_dangki = new JButton("Đăng kí");
		jbt_dangki.addActionListener(ac);
		jpan_thongtindangnhap.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 25));
		jpan_thongtindangnhap.setBackground(Color.decode("#EFEFBB"));
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
		TitledBorder titleborder = new TitledBorder(border, "Thông tin đăng nhập");
		jpan_thongtindangnhap.setBorder(titleborder);
		this.add(jpan_thongtindangnhap);

		// tạo table
		JPanel jpan_danhsach = new JPanel();
		jpan_danhsach.setLayout(new BorderLayout());

		Border border_danhsach = BorderFactory.createLineBorder(Color.red);
		TitledBorder tt_danhsach = new TitledBorder(border_danhsach, "Danh sách đăng nhập");
		jpan_danhsach.setBorder(tt_danhsach);
		jpan_danhsach.setBounds(400, 240, 470, 200);
		this.add(jpan_danhsach);

		table = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table.addColumn("Name");
		table.addColumn("ID");
		table.addColumn("Email");
		table.addColumn("Password");
		data = new JTable(table);
		JScrollPane jsroll = new JScrollPane(data);
		jpan_danhsach.add(jsroll, BorderLayout.CENTER);

		// pannel tong
		data.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(jpan_thongtin, "1");
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

		table_dangki = new DefaultTableModel() {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		table_dangki.addColumn("Name");
		table_dangki.addColumn("ID");
		table_dangki.addColumn("Email");
		table_dangki.addColumn("Password");
		table_dangki.addColumn("Phone number");
		table_dangki.addColumn("Giới tính");

		data_dangki = new JTable(table_dangki);
		data_dangki.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				cl.show(jpan_thongtin, "2");
				int index_row = data_dangki.getSelectedRow();
				String tendangki = (String) data_dangki.getValueAt(index_row, 0);
				String iddangki = (String) data_dangki.getValueAt(index_row, 1);
				String emaildangki = (String) data_dangki.getValueAt(index_row, 2);
				String passworddangki = (String) data_dangki.getValueAt(index_row, 3);
				String phonenumberdangki = (String) data_dangki.getValueAt(index_row, 4);
				String gioitinhdangki = (String) data_dangki.getValueAt(index_row, 5);
				jtext_tendangki.setText(tendangki);
				jtext_iddangki.setText(iddangki);
				jtext_emaildangki.setText(emaildangki);
				jtext_passworddangki.setText(passworddangki);
				jtext_phonedangki.setText(phonenumberdangki);
				if (gioitinhdangki.equals("Nam"))
					jro_nam.setSelected(true);
				if (gioitinhdangki.equals("Nữ"))
					jro_nu.setSelected(true);
			}
		});

		jpandanhsachdangki = new JPanel();
		jpandanhsachdangki.setLayout(new BorderLayout());
		jpandanhsachdangki.setBounds(400, 455, 475, 220);
		jsroll_dangki = new JScrollPane(data_dangki);
		jpandanhsachdangki.add(jsroll_dangki, BorderLayout.CENTER);
		Border border_danhsachdangki = BorderFactory.createLineBorder(Color.red);
		TitledBorder tt_danhsachdangki = new TitledBorder(border_danhsachdangki, "Danh sách đăng kí");
		jpandanhsachdangki.setBorder(tt_danhsachdangki);
		this.add(jpandanhsachdangki, BorderLayout.CENTER);

		JMenuItem sapsep = new JMenuItem("Sắp xếp");
		jmenu_function.add(sapsep);
		sapsep.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xoadatatabledk();
				Connect();
				String sql = "SELECT * FROM thongtindangki ORDER BY id DESC";
				try {
					PreparedStatement ps1 = conn.prepareStatement(sql);
					rs = ps1.executeQuery();
					while (rs.next()) {
						Nguoidungmoi ndm = new Nguoidungmoi(null, null, null, null, null, null);
						ndm.setName(rs.getString("name"));
						ndm.setId(rs.getString("id"));
						ndm.setEmail(rs.getString("email"));
						ndm.setPassword(rs.getString("password"));
						ndm.setPhone(rs.getString("phonenumber"));
						ndm.setSex(rs.getString("gioitinh"));
						try {
							table_dangki.addRow(new Object[] { rs.getString("name"), rs.getString("id"),
									rs.getString("email"), rs.getString("password"), rs.getString("phonenumber"),
									rs.getString("gioitinh") });
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}

			}
		});

		thongke = new JMenu("Thống kê");
		thongke_gioitinh = new JMenuItem("Theo giới tinh");
		thongke_ten = new JMenuItem("Theo tên");
		thongke_ten.addActionListener(ac);
		thongke_gioitinh.addActionListener(ac);
		thongke.add(thongke_gioitinh);
		thongke.add(thongke_ten);
		jmenu_function.add(thongke);
		 cam = new JMenuItem("Camera");
		 cam.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				GUIwedcam();
				
			}
		});
		 jmenu_function.add(cam);
		this.add(jtext_bangdieukhien);
		this.add(jtext_tanghientai);
		this.add(sotan);
		this.add(jtext_vanhanh);
		this.add(jpan_vanhanh);
		this.add(jpan_bangdieukhien);
		this.setJMenuBar(jmenubar);

		cl = new CardLayout();
		jpan_thongtin = new JPanel();
		jpan_thongtin.setLayout(cl);
		jpan_thongtin.setBounds(400, 50, 465, 167);
		jpan_thongtindangki = new JPanel();
		jpan_thongtindangki.setBounds(400, 50, 450, 200);

		// jpannle thongtindangki
		jlb_tendangki = new JLabel("Tên");
		jlb_iddangki = new JLabel("ID");
		jlb_emaildangki = new JLabel("Email");
		jlb_passworddangki = new JLabel("Password");
		jtext_tendangki = new JTextField(20);
		jtext_iddangki = new JTextField(22);
		jtext_emaildangki = new JTextField(20);
		jtext_passworddangki = new JPasswordField(17);
		jlb_phone = new JLabel(" Phone");
		jtext_phonedangki = new JTextField(20);
		jro_nam = new JRadioButton("Nam");
		jro_nu = new JRadioButton("Nữ");
		group = new ButtonGroup();
		group.add(jro_nam);
		group.add(jro_nu);
		JButton quaylại = new JButton("Quay lại");

		jbt_dangkinew = new JButton("Đăng kí ");

		jpan_thongtindangki.setLayout(new FlowLayout(FlowLayout.CENTER, 7, 17));
		jpan_thongtindangki.setBackground(Color.decode("#ddd6f3"));
		jbt_dangkinew.setBackground(Color.red);
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
		jpan_thongtindangki.add(new JLabel("                 "));
		jpan_thongtindangki.add(jro_nam);
		jpan_thongtindangki.add(new JLabel("        "));
		jpan_thongtindangki.add(jro_nu);
		jpan_thongtindangki.add(quaylại);
		jpan_thongtindangki.add(jbt_dangkinew);
		quaylại.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(jpan_thongtin, "1");
			}
		});

		jbt_dangkinew.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String namedangki = jtext_tendangki.getText();
				String iddangki = jtext_iddangki.getText();
				String emaildangki = jtext_emaildangki.getText();
				String passworddangki = jtext_passworddangki.getText();
				String phonedangki = jtext_phonedangki.getText();
				String gioitinh = group.getSelection() + "";
				if (jro_nam.isSelected()) {
					gioitinh = "Nam";
				}
				if (jro_nu.isSelected()) {
					gioitinh = "Nữ";
				}
				nguoidungmoi = new Nguoidungmoi(namedangki, iddangki, emaildangki, passworddangki, phonedangki,
						gioitinh);

				if (jtext_tendangki.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Nhập tên");
				}
				if (jtext_iddangki.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Nhập id");
				if (jtext_emaildangki.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Nhập email");
				if (jtext_passworddangki.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Nhập password");
				if (jtext_phonedangki.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Nhập Phone");
				if (group.getSelection() == null)
					JOptionPane.showMessageDialog(null, "Nhập giới tính");
				else {
					// them vào database
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						String url = "jdbc:mysql://localhost:3306/quanlithangmay";
						String user = "quang";
						String mk = "123456";
						try {
							conn = DriverManager.getConnection(url, user, mk);
							LocalDate time = LocalDate.now();
							Date timesql = Date.valueOf(time);
							// Insert vào bảng thongtindangki
							String sqldangki = "INSERT INTO thongtindangki(name, id, email, password, phonenumber, gioitinh) VALUES(?,?,?,?,?,?)";
							PreparedStatement ps1 = conn.prepareStatement(sqldangki);
							ps1.setString(1, namedangki);
							ps1.setString(2, iddangki);
							ps1.setString(3, emaildangki);
							ps1.setString(4, passworddangki);
							ps1.setString(5, phonedangki);
							ps1.setString(6, gioitinh);

							int ketqua1 = ps1.executeUpdate();

							// Insert vào bảng time
							String sqltime = "INSERT INTO time (time, id) VALUES(?,?)";
							PreparedStatement ps2 = conn.prepareStatement(sqltime);
							ps2.setDate(1, timesql);
							ps2.setString(2, iddangki);

							int ketqua2 = ps2.executeUpdate();

							if (ketqua1 > 0 && ketqua2 > 0) {
								JOptionPane.showMessageDialog(null, "Đăng kí thành công");
								start.setEnabled(true);
								table_dangki.addRow(new String[] { namedangki, iddangki, emaildangki, passworddangki,
										phonedangki, gioitinh });
							}
						} catch (SQLException e1) {
							e1.printStackTrace();
							JOptionPane.showMessageDialog(null, "Tài khoản đã tồn tại hoặc trùng email, id");
						}
					} catch (ClassNotFoundException e2) {
						e2.printStackTrace();
					}

					jtext_tendangki.setText("");
					jtext_emaildangki.setText("");
					jtext_passworddangki.setText("");
					jtext_iddangki.setText("");
					jtext_phonedangki.setText("");
					group.clearSelection();
					cl.show(jpan_thongtin, "1");
				}
				;
			}
		});

		Border border_dangki = BorderFactory.createLineBorder(Color.blue);
		TitledBorder titleborder_dangki = new TitledBorder(border_dangki, "Thông tin đăng kí");
		jpan_thongtindangki.setBorder(titleborder_dangki);

		jpan_thongtin.add(jpan_thongtindangnhap, "1");
		jpan_thongtin.add(jpan_thongtindangki, "2");
		cl.show(jpan_thongtin, "1");

		jmenubar.add(jbt_exists);
		JButton jbt_all = new JButton("Tất cả người đk");
		jmenubar.add(jbt_all);
		jbt_all.addActionListener(ac);

		JPanel lon = new JPanel();
		lon.setBounds(5, 5, 600, 800);
		lon.setLayout(new BorderLayout());

		this.add(jpan_thongtin);
		this.add(jpan_tang4);
		this.add(jpan_tang3);
		this.add(jpan_tang2);
		this.add(jpan_tang1);
	}

	public void setcolorstart() {
		this.mau.setBackground(Color.GREEN);
	}

	public void setcolorstop() {
		this.mau.setBackground(Color.red);
		thanhngang.setBackground(null);
		thanhngang1.setBackground(null);
		thanhngang2.setBackground(null);
		thanhngang3.setBackground(null);
		thanhngang5.setBackground(null);
	}

	public void chophepstop() {
		number = 1;
		soluong.setText("1");
		stop.setEnabled(true);
	}

	public void chophepsstart() {
		number = 0;
		soluong.setText("0");
		timertn.stop();
		start.setEnabled(true);

	}

	public void Dangnhap() {
		String name = jtext_ten.getText();
		String id = jtext_id.getText();
		String email = jtext_email.getText();
		String password = jtext_password.getText();

		if (jtext_ten.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Nhập tên");
		}
		if (jtext_id.getText().equals(""))
			JOptionPane.showMessageDialog(null, "Nhập id");
		if (jtext_email.getText().equals(""))
			JOptionPane.showMessageDialog(null, "Nhập email");
		if (jtext_password.getText().equals(""))
			JOptionPane.showMessageDialog(null, "Nhập password");
		else {
			Connect();
			String sql = "SELECT * FROM thongtindangki";
			int count = 0;

			try {
				PreparedStatement ps1 = conn.prepareStatement(sql);
				rs = ps1.executeQuery();
				while (rs.next()) {
					Nguoidungmoi nd = new Nguoidungmoi(null, null, null, null, null, null);
					nd.setName(rs.getString("name"));
					nd.setId(rs.getString("id"));
					nd.setEmail(rs.getString("email"));
					nd.setPassword(rs.getString("password"));
					nd.setPhone(rs.getString("phonenumber"));
					nd.setSex(rs.getString("gioitinh"));
					try {

						if (name.equals(rs.getString("name")) && id.equals(rs.getString("id"))
								&& email.equals(rs.getString("email")) && password.equals(rs.getString("password"))) {
							JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
							number++;
							soluong.setText(number + "");
							table.addRow(new Object[] { nd.getName(), nd.getId(), nd.getEmail(), nd.getPassword(),
									nd.getPhone(), nd.getSex() });
							count++;
							break;
						}

					} catch (SQLException e1) {
						e1.printStackTrace();

					}
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			if (count == 0) {
				JOptionPane.showMessageDialog(null, "Đăng nhập sai");
			}

			jtext_ten.setText("");
			jtext_email.setText("");
			jtext_password.setText("");
			jtext_id.setText("");
		}
	}

	public void chuyendongmo() {
		timer = new Timer(3000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				chuyendongdong();
				chophep(true);
			}
		});

		timer.start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 60; i >= 0; i--) {
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

	public void chuyendongdong() {
		if (timer.isRunning()) {
			timer.stop();
		}
		new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i <= 60; i++) {
					jpan_trai.setSize(i, 120);

					jpan_phai.setSize(i, 120);
					jpan_phai.setLocation(jpan_phai.getX() - 1, jpan_phai.getY());

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

	public void chophep(Boolean enable) {
		open.setEnabled(enable);
		close.setEnabled(false);
		warm.setEnabled(false);
		help.setEnabled(enable);
		jbtso1.setEnabled(enable);
		jbtso2.setEnabled(enable);
		jbtso3.setEnabled(enable);
		jbtso4.setEnabled(enable);
		tangsl.setEnabled(enable);
		giamsl.setEnabled(enable);
		jbtso1.setBackground(Color.white);
		jbtso2.setBackground(Color.white);
		jbtso3.setBackground(Color.white);
		jbtso4.setBackground(Color.white);
		warm.setBackground(Color.white);
		open.setBackground(Color.white);
		close.setBackground(Color.white);
	}

	public void setcoloropen() {
		open.setBackground(Color.green);
		jbtso1.setBackground(Color.white);
		jbtso2.setBackground(Color.white);
		jbtso3.setBackground(Color.white);
		jbtso4.setBackground(Color.white);
		close.setBackground(Color.white);

	}

	public void setcolorclose() {
		close.setBackground(Color.green);
		jbtso1.setBackground(Color.white);
		jbtso2.setBackground(Color.white);
		jbtso3.setBackground(Color.white);
		jbtso4.setBackground(Color.white);
		open.setBackground(Color.white);

	}

	public void dithangmay2trenxuong() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang2 = jpan_tang2.getY();
				for (int i = y; i <= ytang2 + 16; i++) {
					count++;
					jpan_tong.setSize(120, 110);
					jpan_trai.setSize(120, 110);
					jpan_phai.setSize(120, 110);
					jpan_tong.setLocation(15, y + count);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(2 + "");
	}

	public void dithangmay3trenxuong() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang3 = jpan_tang3.getY();
				for (int i = y; i <= ytang3 + 16; i++) {
					count++;
					jpan_tong.setSize(120, 100);
					jpan_tong.setLocation(15, y + count);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(3 + "");
	}

	public void dithangmay1trenxuong() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang1 = jpan_tang1.getY();
				for (int i = y; i <= ytang1 + 16; i++) {
					count++;
					jpan_tong.setSize(120, 110);
					jpan_trai.setSize(120, 110);
					jpan_phai.setSize(120, 110);
					jpan_tong.setLocation(15, y + count);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(1 + "");
	}

	public void dithangmay1duoilen() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang1 = jpan_tang1.getY();
				for (int i = y; i >= ytang1 + 21; i--) {
					count++;
					jpan_tong.setSize(120, 100);
					jpan_tong.setLocation(15, y - count);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(1 + "");
	}

	public void dithangmay3duoilen() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang3 = jpan_tang3.getY();
				for (int i = y; i >= ytang3 + 21; i--) {
					count++;
					jpan_tong.setSize(120, 100);
					jpan_tong.setLocation(15, y - count);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(3 + "");
	}

	public void dithangmay2duoilen() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang2 = jpan_tang2.getY();
				for (int i = y; i >= ytang2 + 21; i--) {
					count++;
					jpan_tong.setSize(120, 100);
					jpan_tong.setLocation(15, y - count);

					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(2 + "");
	}

	public void dithangmay4duoilen() {
		new Thread(new Runnable() {

			@Override
			public void run() {
				int count = 0;
				int y = jpan_tong.getY();
				int ytang4 = jpan_tang4.getY();
				for (int i = y; i >= ytang4 + 21; i--) {
					count++;
					jpan_tong.setSize(120, 100);
					jpan_tong.setLocation(15, y - count);
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		close.setEnabled(false);
		sotan.setText(4 + "");
	}

	public void doimau(int so) {
		if (so == 1) {
			jbtso1.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			open.setBackground(Color.white);
			close.setBackground(Color.white);

		} else if (so == 2) {
			jbtso2.setBackground(Color.GREEN);
			jbtso1.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			open.setBackground(Color.white);
			close.setBackground(Color.white);
		} else if (so == 3) {
			jbtso3.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso1.setBackground(Color.white);
			jbtso4.setBackground(Color.white);
			open.setBackground(Color.white);
			close.setBackground(Color.white);
		} else if (so == 4) {
			jbtso4.setBackground(Color.GREEN);
			jbtso2.setBackground(Color.white);
			jbtso3.setBackground(Color.white);
			jbtso1.setBackground(Color.white);
			open.setBackground(Color.white);
			close.setBackground(Color.white);
		}
	}

	public void Dangki() {
		cl.show(jpan_thongtin, "2");
	}

	public void chomocua_dongcua() {
		start.setEnabled(false);
		open.setEnabled(true);
		close.setEnabled(false);
	}

	public void kochobamnut() {
		jbtso1.setEnabled(false);
		jbtso2.setEnabled(false);
		jbtso3.setEnabled(false);
		jbtso4.setEnabled(false);
	}

	public void chobamnut(Boolean enable) {
		jbtso1.setEnabled(enable);
		jbtso2.setEnabled(enable);
		jbtso3.setEnabled(enable);
		jbtso4.setEnabled(enable);
	}

	public void getlistnd() {
		xoadatatabledk();
		Connect();
		String sql = "SELECT * FROM thongtindangki";
		try {
			PreparedStatement ps1 = conn.prepareStatement(sql);
			rs = ps1.executeQuery();
			while (rs.next()) {
				Nguoidungmoi ndm = new Nguoidungmoi(null, null, null, null, null, null);
				ndm.setName(rs.getString("name"));
				ndm.setId(rs.getString("id"));
				ndm.setEmail(rs.getString("email"));
				ndm.setPassword(rs.getString("password"));
				ndm.setPhone(rs.getString("phonenumber"));
				ndm.setSex(rs.getString("gioitinh"));
				try {
					table_dangki.addRow(new Object[] { rs.getString("name"), rs.getString("id"), rs.getString("email"),
							rs.getString("password"), rs.getString("phonenumber"), rs.getString("gioitinh") });
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void xoadatatabledk() {
		table_dangki.setRowCount(0);
	}

	public void timkiem(String id) {
		xoadatatabledk();
		Connect();
		int count = 0;
		String sql = "SELECT * FROM thongtindangki where id like ?";
		try {
			PreparedStatement ps1 = conn.prepareStatement(sql);
			ps1.setString(1, "%" + id + "%");
			rs = ps1.executeQuery();
			while (rs.next()) {
				Nguoidungmoi ndm = new Nguoidungmoi(null, null, null, null, null, null);
				ndm.setName(rs.getString("name"));
				ndm.setId(rs.getString("id"));
				ndm.setEmail(rs.getString("email"));
				ndm.setPassword(rs.getString("password"));
				ndm.setPhone(rs.getString("phonenumber"));
				ndm.setSex(rs.getString("gioitinh"));
				table_dangki.addRow(new Object[] { ndm.getName(), ndm.getId(), ndm.getEmail(), ndm.getPassword(),
						ndm.getPhone(), ndm.getSex() });
				count++;
			}
			if (count == 0) {
				JOptionPane.showMessageDialog(null, "Không tim thấy");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showPieChart() {
		JFrame thongke = new JFrame("Thống kê giới tính");
		JPanel lon = new JPanel();
		thongke.setVisible(true);
		thongke.setSize(900, 760);
		thongke.setLocationRelativeTo(null);
		lon.setLayout(new BorderLayout());

		Connect();
		String sql = "SELECT gioitinh, COUNT(*) AS count FROM thongtindangki GROUP BY gioitinh";

		PreparedStatement ps1;

		try {
			ps1 = conn.prepareStatement(sql);
			ResultSet rs = ps1.executeQuery();
			piedataset = new DefaultPieDataset();
			while (rs.next()) {
				String gioiTinh = rs.getString("gioitinh");
				int count = rs.getInt("count");
				piedataset.setValue(gioiTinh, count);
			}
			JFreeChart piechart = ChartFactory.createPieChart("Thống kê gender", piedataset, true, true, false);
			PiePlot pieplot = (PiePlot) piechart.getPlot();
			ChartPanel chartPanel = new ChartPanel(piechart);
			lon.add(chartPanel, BorderLayout.CENTER);
			thongke.setLayout(new BorderLayout());
			thongke.add(lon, BorderLayout.CENTER);
			chartPanel.validate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void showBarchart() {
		JFrame thongke = new JFrame("Thống kê tên");
		JPanel lon = new JPanel();
		thongke.setVisible(true);
		thongke.setSize(900, 760);
		thongke.setLocationRelativeTo(null);
		lon.setLayout(new BorderLayout());

		Connect();
		String sql = "SELECT SUBSTRING_INDEX(name, ' ', -1) as name, count(*) as count from thongtindangki group by SUBSTRING_INDEX(name, ' ', -1) order by count(*) desc limit 5 ";

		PreparedStatement ps1;

		try {
			ps1 = conn.prepareStatement(sql);
			ResultSet rs = ps1.executeQuery();
			catogorydataset = new DefaultCategoryDataset();
			while (rs.next()) {
				String name = rs.getString("name");
				int count = rs.getInt("count");
				catogorydataset.addValue(count, "Số lượng", name);
			}
			JFreeChart barchart = ChartFactory.createBarChart("Thống kê name", "Tên", "Số lượng", catogorydataset,
					PlotOrientation.VERTICAL, true, true, false);

			ChartPanel chartPanel = new ChartPanel(barchart);
			lon.add(chartPanel, BorderLayout.CENTER);
			thongke.setLayout(new BorderLayout());
			thongke.add(lon, BorderLayout.CENTER);
			chartPanel.validate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void Animation() {
		timertn = new Timer(700, new ActionListener() {
			private int index = 0;
			private Color[] colors = { Color.decode("#78ffd6"), Color.decode("#c471ed"), Color.decode("#FFEFBA"),
					Color.PINK };

			@Override
			public void actionPerformed(ActionEvent e) {
				thanhngang.setBackground(colors[index]);
				thanhngang1.setBackground(colors[index]);
				thanhngang2.setBackground(colors[index]);
				thanhngang3.setBackground(colors[index]);
				thanhngang5.setBackground(colors[index]);
				index = (index + 1) % colors.length;
			}
		});

		timertn.start();
	}

	public void Connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quanlithangmay";
			String user = "quang";
			String mk = "123456";
			try {
				conn = DriverManager.getConnection(url, user, mk);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}
	}
	public void GUIwedcam() {
	   Webcam webcam =Webcam.getDefault();
	   webcam.setViewSize(WebcamResolution.VGA.getSize());
	   
	   WebcamPanel webcampannel = new WebcamPanel(webcam);
	   webcampannel.setImageSizeDisplayed(true);
	   webcampannel.setFPSDisplayed(true);
	   webcampannel.setMirrored(true);
	   webcampannel.setDisplayDebugInfo(true);
	   
	    jf_webcam = new JFrame();
	   jf_webcam.add(webcampannel);
	   jf_webcam.setSize(500, 400);
	   jf_webcam.setLocationRelativeTo(null);
	   jf_webcam.pack();
	   jf_webcam.setVisible(true);
	   jf_webcam.addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			webcam.close();
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
		}
	});
	  
	}
	
}

