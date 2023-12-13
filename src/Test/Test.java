package Test;

import javax.swing.UIManager;

import Thangmay_view.Thangmay_view;


public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			Thangmay_view tmv = new Thangmay_view();
			tmv.chophep(false);
		 
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
