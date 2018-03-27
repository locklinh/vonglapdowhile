import javax.swing.JFrame;
import javax.swing.JLabel;
//public class Linhxinhgai {
	public class Linhxinhgai{
		  public static void main(String[] args) {
		    JFrame frame = new JFrame("Linh xinh gai");
		    final JLabel label = new JLabel("Linh xinh gái");
		    frame.getContentPane().add(label);

//xau vai l***********

		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    frame.pack();
		    frame.setVisible(true);
		  }
		}

