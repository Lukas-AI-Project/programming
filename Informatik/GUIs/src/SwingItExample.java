import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingItExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("My Frame");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setSize(600, 400);

        final JLabel myLabel = new JLabel("Bitte Namen eingeben und Enter drücken:");
        myLabel.setSize(320, 60);
        myLabel.setLocation(100, 50);
        myFrame.add(myLabel);

        final JTextField myTextField = new JTextField();
        myTextField.setSize(320, 70);
        myTextField.setLocation(100, 150);
        myTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    myLabel.setText("Guten Tag " + myTextField.getText()+"!");
                }
            }
        });
        myFrame.add(myTextField);

        final String[] namen = new String[]{"Frodo","Legolas","Gandalf","Gimli","Boromir","Sam","Aragon","Pippin","Merry"};

        JButton myButton = new JButton("Zufälliger Name");
        myButton.setSize(300, 100);
        myButton.setLocation(100, 250);
        myButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int rnd = (int)(Math.random()*namen.length);
                myTextField.setText(namen[rnd]);
            }
        });
        myFrame.add(myButton);

        myFrame.setVisible(true);
    }

}
