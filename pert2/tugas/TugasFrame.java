import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasFrame
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Tugas P1");
		frame.setSize(320,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);
		frame.setVisible(true);
		frame.setLayout(null);


		JLabel lbl_nim = new JLabel("MASUKAN NIM");
		frame.add(lbl_nim);
		lbl_nim.setBounds(10,20,200,30);

		JTextField txt_nim = new JTextField();
		frame.add(txt_nim);
		txt_nim.setBounds(150,20,150,30);

		JLabel lbl_output_nim = new JLabel();
		frame.add(lbl_output_nim);
		lbl_output_nim.setBounds(150,60,200,30);

		JLabel lbl_nama = new JLabel("MASUKAN NAMA");
		frame.add(lbl_nama);
		lbl_nama.setBounds(10,100,200,30);

		JTextField txt_nama = new JTextField();
		frame.add(txt_nama);
		txt_nama.setBounds(150,100,150,30);

		JLabel lbl_output_nama = new JLabel();
		frame.add(lbl_output_nama);
		lbl_output_nama.setBounds(150,140,200,30);

		JLabel lbl_nilai = new JLabel("MASUKAN NILAI");
		frame.add(lbl_nilai);
		lbl_nilai.setBounds(10,180,200,30);

		JTextField txt_nilai = new JTextField();
		frame.add(txt_nilai);
		txt_nilai.setBounds(150,180,150,30);

		JLabel lbl_output_nilai = new JLabel();
		frame.add(lbl_output_nilai);
		lbl_output_nilai.setBounds(150,220,200,30);

		JButton btn_ok = new JButton("OK");
		frame.add(btn_ok);
		btn_ok.setBounds(50,300,100,30);

		JButton btn_batal = new JButton("BATAL");
		frame.add(btn_batal);
		btn_batal.setBounds(180,300,100,30);

		btn_ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				String nim = txt_nim.getText();
				String nama = txt_nama.getText();
				String nilai = txt_nilai.getText();

				lbl_output_nim.setText(nim);
				lbl_output_nama.setText(nama);
				lbl_output_nilai.setText(nilai);
			}
		});

		btn_batal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				txt_nim.setText("");
				txt_nama.setText("");
				txt_nilai.setText("");

				txt_nim.requestFocus();
			}
		});
	}
}