import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class GUIRaumschiff {
	static boolean zielkoordinatenTrue = false;
	final static String ziel = "";
	public static void main(String[]args){



		final Raumschiff raumschiff1 = new Raumschiff("Outlander", 25, 25, false, false);





		JFrame myFrame = new JFrame("Raumschiffkonsole");

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setSize(570, 400);


        JLabel ausgabe = new JLabel("Raumschiffausgabe:");
        ausgabe.setSize(1000, 30);
        ausgabe.setLocation(10, 170);
        myFrame.add(ausgabe);


        final JLabel ausgabetxt = new JLabel("Lorem Ipsum");
        ausgabetxt.setSize(1000, 30);
        ausgabetxt.setLocation(22, 200);
        myFrame.add(ausgabetxt);


        final JLabel ausgabetxt2 = new JLabel("Lorem Ipsum");
        ausgabetxt2.setSize(1000, 30);
        ausgabetxt2.setLocation(22, 220);
        myFrame.add(ausgabetxt2);


        final JLabel ausgabetxt3 = new JLabel("Lorem Ipsum");
        ausgabetxt3.setSize(1000, 30);
        ausgabetxt3.setLocation(22, 240);
        myFrame.add(ausgabetxt3);


        JButton Status = new JButton("Status abfragen");
        Status.setSize(170, 30);
        Status.setLocation(10, 10);
        Status.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ausgabetxt.setText("Name: "+raumschiff1.getname());
				ausgabetxt2.setText("Triebwerke: "+raumschiff1.triebwerke);
				ausgabetxt3.setText("Hyperraumantrieb: "+raumschiff1.gethyperraum());
            }
        });
        myFrame.add(Status);


        JButton triebwerkeStarten = new JButton("Triebwerke");
        triebwerkeStarten.setSize(170, 30);
        triebwerkeStarten.setLocation(200, 10);
        triebwerkeStarten.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	if(raumschiff1.triebwerke){
            		raumschiff1.triebwerke = false;
            		ausgabetxt.setText("Triebwerke deaktiviert!");
            		ausgabetxt2.setText("");
    				ausgabetxt3.setText("");
            	}
            	else if(!raumschiff1.triebwerke){
            		raumschiff1.triebwerke = true;
            		ausgabetxt.setText("Triebwerke aktiviert!");
            		ausgabetxt2.setText("");
    				ausgabetxt3.setText("");
            	}
            }
        });
        myFrame.add(triebwerkeStarten);


        JButton hyperraumsprung = new JButton("Hyperraumsprung");
        hyperraumsprung.setSize(170, 30);
        hyperraumsprung.setLocation(390, 10);
        hyperraumsprung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("");
            }
        });
        myFrame.add(hyperraumsprung);


        JButton zielort = new JButton("Zielort");
        zielort.setSize(170, 30);
        zielort.setLocation(10, 50);
        zielort.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	ausgabetxt.setText("Geben sie einen Zielort ein!");
        		ausgabetxt2.setText("");
				ausgabetxt3.setText("");
            }
        });
        myFrame.add(zielort);


        JButton ausschalten = new JButton("Ausschalten");
        ausschalten.setSize(170, 30);
        ausschalten.setLocation(200, 50);
        ausschalten.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        myFrame.add(ausschalten);


        JButton selbstzerstoerung = new JButton("Selbstzerstörung");
        selbstzerstoerung.setSize(170, 30);
        selbstzerstoerung.setLocation(390, 50);
        selbstzerstoerung.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        myFrame.add(selbstzerstoerung);


        JLabel konsole = new JLabel("Zielcomputer:");
        konsole.setSize(1000, 30);
        konsole.setLocation(10, 90);
        myFrame.add(konsole);


        final JTextField konsoletxt = new JTextField();
        konsoletxt.setSize(550, 30);
        konsoletxt.setLocation(10, 130);
        konsoletxt.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                	konsoletxt.getText();
                	System.out.println(konsoletxt.getText());
                	switch (ziel) {
					case "Erde":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Mars":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Hoth":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Tatooine":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Corouscant":
						zielkoordinatenTrue=true;
						ausgabetxt.setText("Zielort:");
	            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
	    				ausgabetxt3.setText("");
						break;
					case "Todesstern":
						break;
					case "Mond":
						zielkoordinatenTrue=true;
						break;
					default:
						break;
                	}
                	ausgabetxt.setText("Zielort:");
            		ausgabetxt2.setText("'"+konsoletxt.getText()+"'");
    				ausgabetxt3.setText("");
                }
            }
        });
        myFrame.add(konsoletxt);





		myFrame.setVisible(true);
	}
}
