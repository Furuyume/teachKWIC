package JFrame;

import javax.swing.*;
import java.awt.*;

/**
 * @author furuyume
 * @Description
 * @DateTime 2023/10/30 9:29
 */
public class buttonUnit3 extends JFrame {
    public buttonUnit3(){
        this.setSize(1000, 500);
        this.setTitle("事件系统");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo((Component)null);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.setAlwaysOnTop(false);
        this.insertImage();
    }

    public void insertImage() {
        ImageIcon icon = new ImageIcon("D:\\code\\teachButton\\src\\b3.png");
        JLabel jLabel = new JLabel(icon);
        this.setLayout((LayoutManager)null);
        jLabel.setBounds(250, 0, icon.getIconWidth(), icon.getIconHeight());
        this.add(jLabel);
    }
}