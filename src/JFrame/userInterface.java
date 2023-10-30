package JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class userInterface extends JFrame {

    public userInterface(){
        initJFrame();
        this.setVisible(true);
    }

    public void initJFrame(){
        this.setSize(600, 500);
        this.setTitle("KWIC(Key Word In Context)索引系统教学程序");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        //创建按钮
        JButton button1 = new JButton("主程序-子程序");
        JButton button2 = new JButton("面向对象");
        JButton button3 = new JButton("事件系统");
        JButton button4 = new JButton("管道-过滤");

        button1.setBounds(200,50,150,50);
        button2.setBounds(200,150,150,50);
        button3.setBounds(200,250,150,50);
        button4.setBounds(200,350,150,50);
        //设置点击事件
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame b1 = new buttonUnit1();
                b1.setVisible(true);

                File file = new File("E:\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\code\\Exper2\\src\\")});
                    Class<?> myClass = classLoader.loadClass("Demo1.demo1");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame b2 = new buttonUnit2();
                b2.setVisible(true);

                File file = new File("E:\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\code\\Exper2\\src\\")});
                    Class<?> myClass = classLoader.loadClass("Demo2.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }


        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame b3 = new buttonUnit3();
                b3.setVisible(true);

                File file = new File("E:\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\code\\Exper2\\src\\")});
                    Class<?> myClass = classLoader.loadClass("Demo3.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame b4 = new buttonUnit4();
                b4.setVisible(true);

                File file = new File("E:\\output.txt");
                try {
                    Desktop.getDesktop().open(file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                try {
                    // 动态加载类
                    URLClassLoader classLoader = new URLClassLoader(new URL[]{new URL("file:///D:\\code\\Exper2\\src\\")});
                    Class<?> myClass = classLoader.loadClass("Demo4.Main");
                    // 调用类的静态方法
                    Method method = myClass.getMethod("main", String[].class);
                    String[] args = new String[]{};
                    method.invoke(null, (Object) args);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });



        add(button1);
        add(button2);
        add(button3);
        add(button4);
    }
}
