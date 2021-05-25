import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    public Gui(int screenWidth, int screenHeight){
        createFrame(screenWidth, screenHeight);

    }

    public void createFrame(int width, int height){
        this.setTitle("");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setSize(width,height);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.white);
    }

}

