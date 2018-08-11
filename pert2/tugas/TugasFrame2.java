import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TugasFrame2
{
	public static void main(String [] args)
	{
		JFrame frame = new JFrame();
		frame.setTitle("Tugas P1");
		frame.setSize(350,220);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLayout(null);


		JLabel lbl_nama = new JLabel("MASUKAN NAMA");
		frame.add(lbl_nama);
		lbl_nama.setBounds(10,20,200,30);

		JTextField nama = new JTextField();
		frame.add(nama);
		nama.setBounds(150,20,180,30);

		JLabel lbl_1 = new JLabel("Nilai 1");
		frame.add(lbl_1);
		lbl_1.setBounds(10,60,200,30);

		JTextField txt_nilai1 = new JTextField();
		frame.add(txt_nilai1);
		txt_nilai1.setBounds(150,60,180,30);

		JLabel lbl_2 = new JLabel("Nilai 2");
		frame.add(lbl_2);
		lbl_2.setBounds(10,100,200,30);

		JTextField txt_nilai2 = new JTextField();
		frame.add(txt_nilai2);
		txt_nilai2.setBounds(150,100,180,30);

		JButton btn_ok = new JButton("OK");
		frame.add(btn_ok);
		btn_ok.setBounds(10,140,80,30);

		JButton btn_batal = new JButton("BATAL");
		frame.add(btn_batal);
		btn_batal.setBounds(120,140,80,30);

		JLabel lbl_output = new JLabel();
		frame.add(lbl_output);
		lbl_output.setBounds(230,140,200,30);

		btn_ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				int n1 = Integer.parseInt(txt_nilai1.getText());
				int n2 = Integer.parseInt(txt_nilai2.getText());
				String output;

				if(n1 > 60 && n2 > 60){
					output = "lulus";
				}else{
					output = "mengulang";
				}

				lbl_output.setText(output);
			}
		});

		btn_batal.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e)
			{
				nama.setText("");
				txt_nilai1.setText("");
				txt_nilai2.setText("");

				lbl_output.setText("");
				nama.requestFocus();
			}
		});
	}
}