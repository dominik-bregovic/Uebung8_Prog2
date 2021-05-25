import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener {
    JLabel label = new JLabel();
    JPanel DataPanel = new JPanel();
    JPanel ListPanel = new JPanel();
    JButton button = new JButton();


    public Gui(){
        createFrame( 740, 640, "");
        createTextLabel("my Text");
        createDataPanel(350, 0, 340, 300);
        createListPanel(0, 0, 350, 640);
        createButton();

        //super.pack();
    }



    public void createFrame(int width, int height, String title){
        //super.setTitle(title);
        //super.setResizable(false);
        super.setSize(width,height);
        super.setLayout(null);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.getContentPane().setBackground(Color.white);
        super.setVisible(true);
        super.add(DataPanel);
        super.add(ListPanel);

    }

    public void allLabels(){
        createTextLabel("Username:");
        createTextLabel("Email:");
        createTextLabel("Password");

    }

    //Fill in Infos about our users in text
    public void createTextLabel(String text){

        label.setText(text);
        label.setHorizontalTextPosition(JLabel.CENTER);       //positioning text to image
        label.setVerticalTextPosition(JLabel.TOP);            //positioning text to image
        label.setForeground(Color.GREEN);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setBackground(Color.WHITE); //set Background color
        label.setOpaque(true);     //with this Background pixels are changed
        //label.setVerticalAlignment(JLabel.TOP); // set place of label only by BorderLayout
        //label.setHorizontalAlignment(JLabel.LEFT);
        label.setBounds(0,0,250,250);       //set label within frame
    }


    public void createImageLabel(JLabel label){
        ImageIcon image = new ImageIcon("<path to image>");
        label.setIcon(image);      // set the image that i want
        label.setIconTextGap(-25); //set gap of text to image
    }

    public void createDataPanel(int x, int y, int width, int height){
        DataPanel.setBackground(Color.black);
        DataPanel.setBounds(x,y,width,height);
        DataPanel.setLayout(null);
        DataPanel.add(label);
    }

    public void createListPanel(int x, int y, int width, int height){
        ListPanel.setBackground(Color.blue);
        ListPanel.setBounds(x,y,width,height);
        ListPanel.setLayout(null);
        ListPanel.add(label);
    }

    public void createButton(){
        button.setBounds(550, 350, 150,50);
        button.addActionListener(this::actionPerformed);
        super.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            //Action to perform if Button clicked
            System.out.println("hey");
        }
    }
}

