import javax.swing.*;

public class Test extends JFrame{
    public Test(){
        setTitle("Title");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Test();
    }
}
