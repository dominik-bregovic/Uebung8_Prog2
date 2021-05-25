import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    JTextField text = new JTextField();
    JPanel dataPanel = new JPanel();
    JPanel accountsPanel = new JPanel();
    JButton button = new JButton();


    public Gui(){
        createFrame( 750, 650, "");

        //createDataPanel(350, 200, 340, 300);
        //createListPanel(0, 200, 350, 640);
        createButton();

        //super.pack();
    }



    public void createFrame(int width, int height, String title){
        //super.setTitle(title);
        //super.setResizable(false);
        super.setSize(width,height);
        super.setLayout(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //super.getContentPane().setBackground(Color.white);
        super.setVisible(true);
        super.add(createHeader(new JPanel(),0,0, 750, 50));
        super.add(createHeadLines(new JPanel(),0,50,375, 50, "List of current users"));
        super.add(createHeadLines(new JPanel(),375,50,375, 50, "Register new user"));
        super.add(createTextLines(new JPanel(), 500, 200, 250, 50));
        super.add(createTextLines(new JPanel(), 500, 250, 250, 50));
        // here password textfield
        super.add(createTextLines(new JPanel(), 500, 300, 250, 50));
        super.add(createInfoForTextLines(new JPanel(),300, 200, 250, 50, "Username:"));
        super.add(createInfoForTextLines(new JPanel(),300, 250, 250, 50, "E-mail:"));
        super.add(createInfoForTextLines(new JPanel(),300, 300, 250, 50, "Password:"));
        super.add(createInfoForTextLines(new JPanel(),300, 350, 250, 50, "Admin:"));
        super.add(dataPanel);
        super.add(accountsPanel);

    }

    //Fill in Infos about our users in text
    public JLabel createLabel(JLabel label,String text, int fontsize){

        label.setText(text);
        label.setHorizontalTextPosition(JLabel.CENTER);       //positioning text to image
        label.setVerticalTextPosition(JLabel.CENTER);            //positioning text to image
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN, fontsize));
        label.setBackground(Color.WHITE); //set Background color
        label.setOpaque(true);     //with this Background pixels are changed
        //label.setVerticalAlignment(JLabel.TOP); // set place of label only by BorderLayout
        //label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,750,100);       //set label within frame

        return label;
    }

    public JPanel createHeader(JPanel panel, int x, int y, int width, int height){
        panel.setBackground(Color.WHITE);
        panel.setBounds(x, y, width, height);
        panel.add(createLabel(new JLabel(),"Fancy User Management", 30));
        return panel;
    }

    public JPanel createHeadLines(JPanel panel, int x, int y, int width, int height, String text){
        panel.setBackground(Color.WHITE);
        panel.setBounds(x, y, width, height);
        panel.add(createLabel(new JLabel(),text, 20));
        return panel;
    }

    public JPanel createInfoForTextLines(JPanel panel, int x, int y, int width, int height, String text) {
        panel.setBackground(Color.WHITE);
        panel.setBounds(x, y, width, height);
        panel.add(createLabel(new JLabel(),text, 20));
        return panel;
    }

    public JPanel createTextLines(JPanel panel, int x, int y, int width, int height){
        panel.setBackground(Color.WHITE);
        panel.setBounds(x, y, width, height);
        panel.add(createTextField(new JTextField(), 200, 20));
        return panel;
    }

    public JTextField createTextField(JTextField text, int width, int height){

        text.setPreferredSize(new Dimension(width, height));
        return text;
    }

    public void createButton(){
        button.setBounds(600, 400, 105,20);
        button.addActionListener(this::actionPerformed);
        button.setText("Create User");
        button.setFocusable(false);
        super.add(button);
    }


    public void createDataPanel(JPanel panel,int x, int y, int width, int height){
        panel.setBounds(x,y,width,height);
        panel.setLayout(null);
       // panel.add(Headerlabel);
    }

    public void createListPanel(int x, int y, int width, int height){
        accountsPanel.setBackground(Color.blue);
        accountsPanel.setBounds(x,y,width,height);
        accountsPanel.setLayout(null);
        //accountsPanel.add(Headerlabel);
    }

    public void createImageLabel(JLabel label){
        ImageIcon image = new ImageIcon("<path to image>");
        label.setIcon(image);      // set the image that i want
        label.setIconTextGap(-25); //set gap of text to image
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            //Action to perform if Button clicked
            //new Action performed class.......
            System.out.println("hey");
        }
    }
}

