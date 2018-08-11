import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class softaid extends JFrame implements ActionListener {
    private JMenuItem AccOpen;
    private JMenuItem AccClose;
    private JDesktopPane desktop = new JDesktopPane();
    private JMenuBar menuBar = new JMenuBar();
    static public int MainWindowHeight = 600;
    static public int MainWindowWidht = 700;

    public softaid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Latihan internal Frame dengan memanggil Frame ke menuBar");
        setSize(700,600);
        setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getWidth())/2, (Toolkit.getDefaultToolkit().getScreenSize().height - getHeight()) / 2 );
        
        setJMenuBar(menuBar);

        JMenu AccountMenu = new JMenu("Account");

        menuBar.add(AccountMenu);

        AccOpen = new JMenuItem("Open Account");
        AccClose = new JMenuItem("Close Account");

        AccountMenu.add(AccOpen);
        AccountMenu.add(AccClose);

        AccOpen.addActionListener(this);
        AccClose.addActionListener(this);
        desktop.setBackground(Color.YELLOW);
        getContentPane().add(desktop, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == ( JMenuItem)AccOpen) {
            OpenAccount oc = new OpenAccount();
            desktop.add(oc);
            oc.show();
        }

        if (e.getSource() == ( JMenuItem)AccClose) {
            CloseAccount cc = new CloseAccount();
            desktop.add(cc);
            cc.show();
        }
    }

}

/**
 * OpenAccount
 */
class OpenAccount extends JInternalFrame implements ActionListener {
    private JPanel JP = new JPanel();
    private JLabel lbl;
    private JButton btnOk;

    OpenAccount () {
        super("Open new Account", false, true, false, true);
        setSize(500, 400);
        setLocation((softaid.MainWindowWidht - this.getSize().width) / 2, (softaid.MainWindowHeight - this.getSize().height) / 2);
        lbl = new JLabel("Open your Account Window: ");
        lbl.setForeground(Color.blue);
        lbl.setBounds(15, 15, 200, 120);
        btnOk = new JButton("OK");
        btnOk.setBounds(50, 175, 100, 25);
        btnOk.addActionListener(this);
        JP.setLayout(null);
        JP.add(lbl);
        JP.add(btnOk);

        getContentPane().add(JP, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == btnOk) {
            JOptionPane.showMessageDialog(this, "Hy ini Frame kedua ..");
        }
    }
    
}

/**
 * CloseAccount
 */
class CloseAccount extends JInternalFrame implements ActionListener {
    private JPanel JP = new JPanel();
    private JLabel lbl;
    private JButton btnOk;

    CloseAccount() {
        super("Close Account", false, true, false, true);
        setSize(500, 400);
        setLocation((softaid.MainWindowWidht - this.getSize().width) / 2, (softaid.MainWindowHeight - this.getSize().height) / 2);
        lbl = new JLabel("Open your Account Window: ");
        lbl.setForeground(Color.RED);
        lbl.setBounds(15, 15, 200, 120);
        btnOk = new JButton("OK");
        btnOk.setBounds(50, 175, 100, 25);
        btnOk.addActionListener(this);
        JP.setLayout(null);
        JP.add(lbl);
        JP.add(btnOk);

        getContentPane().add(JP, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (obj == btnOk) {
            JOptionPane.showMessageDialog(this, "Bye bye ..");
        }
    }
    
}

/**
 * win4
 */
class win4 {

    public static void main(String[] args) {
        new softaid();
    }
}