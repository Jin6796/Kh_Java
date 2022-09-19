package ajdbc.zipcode;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ZipCodeSearchApp extends JFrame implements ItemListener {
	JPanel jp_north = new JPanel();
	String zdo = null;
	String sigu = null;
	String zongdo = null;
	String zdos = null;
	String sigus = null;
	String zongdos = null;
	String cols[] = {"주소", "우편번호"};
	String data [][] = new String[0][2];
	DefaultTableModel dtm = new DefaultTableModel(data, cols);
	JTable jtb = new JTable(dtm);
	
	
	public ZipCodeSearchApp() {
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void initDisplay() {
		this.setSize(600,500);
		this.setVisible(true);
		this.setTitle("우편번호 검색기");
	}
	
	public static void main(String[] args) {
		ZipCodeSearchApp zipApp = new ZipCodeSearchApp();
		zipApp.initDisplay();

	}


}
