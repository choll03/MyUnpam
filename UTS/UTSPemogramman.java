import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class UTSPemogramman extends JFrame implements ActionListener
{
    private JPanel panel1, panel2, panel3, panel4;
    private JLabel lblNilai1, lblNilai2, lblNama, lblMatkul, lblOutput;
    private JTextField txtNilai1, txtNilai2, txtNama, txtMatkul;
    private JButton btnBagi, btnBatalPertama, btnBatalKedua, btnClose;

    public UTSPemogramman()
    {
        setTitle("UTS GANJIL");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        setLayout(null);
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        lblNilai1 = new JLabel("Nilai 1");
        lblNilai2 = new JLabel("Nilai 2");
        lblNama = new JLabel("Nama");
        lblMatkul = new JLabel("Mata Kuliah");
        lblOutput = new JLabel();
        txtNilai1 = new JTextField();
        txtNilai2 = new JTextField();
        txtNama = new JTextField();
        txtMatkul = new JTextField();
        btnBagi = new JButton(" / ");
        btnBatalPertama = new JButton("Batal");
        btnBatalKedua = new JButton("Batal");
        btnClose = new JButton("X");

        panel1.setBounds(0, 0, 300, 100);
        panel1.setBackground(Color.blue);
        panel1.setLayout(null);
        btnClose.setBounds(290, 0, 10, 10);
        panel1.add(btnClose);
        lblNilai1.setBounds(30, 10, 80, 30);
        lblNilai1.setForeground(Color.white);
        panel1.add(lblNilai1);
        lblNilai2.setBounds(30, 50, 80, 30);
        lblNilai2.setForeground(Color.white);
        panel1.add(lblNilai2);
        txtNilai1.setBounds(100, 10, 170, 30);
        panel1.add(txtNilai1);
        txtNilai2.setBounds(100, 50, 170, 30);
        panel1.add(txtNilai2);
        add(panel1);

        panel2.setBounds(0, 100, 300, 50);
        panel2.setBackground(Color.gray);
        panel2.setLayout(null);
        btnBagi.setBounds(10, 10, 80, 30);
        panel2.add(btnBagi);
        btnBatalPertama.setBounds(100, 10, 80, 30);
        panel2.add(btnBatalPertama);
        lblOutput.setBounds(220, 10, 50, 30);
        lblOutput.setForeground(Color.white);
        panel2.add(lblOutput);
        add(panel2);

        panel3.setBounds(0, 150, 300, 100);
        panel3.setLayout(null);
        lblNama.setBounds(30, 10, 80, 30);
        panel3.add(lblNama);
        lblMatkul.setBounds(30, 50, 80, 30);
        panel3.add(lblMatkul);
        txtNama.setBounds(100, 10, 170, 30);
        panel3.add(txtNama);
        txtMatkul.setBounds(100, 50, 170, 30);
        panel3.add(txtMatkul);
        add(panel3);

        panel4.setBounds(0, 250, 300, 50);
        panel4.setBackground(Color.green);
        panel4.setLayout(null);
        btnBatalKedua.setBounds(10, 10, 80, 30);
        panel4.add(btnBatalKedua);
        add(panel4);

        btnClose.addActionListener(this);
        btnBagi.addActionListener(this);
        btnBatalPertama.addActionListener(this);
        btnBatalKedua.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnClose)
        {
            dispose();
        }

        if(e.getSource() == btnBagi)
        {
            double nilai1 = Double.parseDouble(txtNilai1.getText());
            double nilai2 = Double.parseDouble(txtNilai2.getText());
            double hasil = nilai1 / nilai2;

            lblOutput.setText(Double.toString(hasil));
        }

        if(e.getSource() == btnBatalPertama)
        {
            txtNilai1.setText("");
            txtNilai2.setText("");
            lblOutput.setText("");

            txtNilai1.requestFocus();
        }

        if(e.getSource() == btnBatalKedua)
        {
            txtNama.setText("");
            txtMatkul.setText("");

            txtNama.requestFocus();
        }
    }

    public static void main(String [] args)
    {
        new UTSPemogramman().setVisible(true);
    }
}