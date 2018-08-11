import java.awt.*;
import javax.swing.*;

/**
 * internalFrame
 */
public class internalFrame extends JFrame{
    
    Container konten = getContentPane();
    JDesktopPane desktop = new JDesktopPane();
    JInternalFrame interFrame = new JInternalFrame("Internal Frame",true, true, true, true);
    private JMenuBar menuBaris = new JMenuBar();
    private JMenu menuNew = new JMenu("New");
    private JMenu menuProject = new JMenu("Project");
    private JMenuItem menuBlankProject = new JMenuItem("Blank Project");

    private JMenuBar menuBar = new JMenuBar();
    private JMenu menuFile = new JMenu("File");
    private JMenu menuSaveAs = new JMenu("Save As");
    private JMenuItem menuPdf = new JMenuItem(".Pdf");

    public internalFrame() {
        super("Internal Frame");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        setJMenuBar(menuBaris);
        menuBaris.add(menuNew);
        menuNew.add(menuProject);
        menuProject.add(menuBlankProject);

        interFrame.setJMenuBar(menuBar);
        menuBar.add(menuFile);
        menuFile.add(menuSaveAs);
        menuSaveAs.add(menuPdf);

        interFrame.setLocation(30, 30);
        interFrame.setSize(400, 200);
        interFrame.setVisible(true);
        interFrame.setBackground(Color.GREEN);
        desktop.add(interFrame);
        desktop.setBackground(Color.YELLOW);
        setContentPane(desktop);
    }

    public static void main(String[] args) {
        new internalFrame();
    }
}