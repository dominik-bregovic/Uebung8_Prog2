import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {


    public Gui(){
        createFrame(640, 640, "");
        createTextLabel("my Text");
    }



    public void createFrame(int width, int height, String title){
        super.setTitle(title);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setResizable(false);
        super.setSize(width,height);
        super.setVisible(true);
        super.getContentPane().setBackground(Color.white);
    }

  /*  public void allLabels(){
        createTextLabel("Username:");

        createTextLabel("Email:");

        createTextLabel("Password");

    }*/

    public void createTextLabel(String text){
        JLabel label = new JLabel();
        label.setText(text);
        // label.setHorizontalTextPosition(JLabel.RIGHT);       //positioning text to image
        //label.setVerticalTextPosition(JLabel.RIGHT);            //positioning text to image
        label.setForeground(Color.green);
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));
        label.setBackground(Color.black); //set Background color
        label.setOpaque(true);     //with this Background pixels are changed
        label.setVerticalAlignment(JLabel.CENTER); // set place of label
        label.setHorizontalAlignment(JLabel.RIGHT);
        super.add(label);

    }

    public void createImageLabel(JLabel label){
        ImageIcon image = new ImageIcon("<path to image>");
        label.setIcon(image);      // set the image that i want
        label.setIconTextGap(-25); //set gap of text to image
    }

}

