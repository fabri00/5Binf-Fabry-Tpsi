import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Counter extends JFrame{
	
	public Counter() {
		
		super("Counter");
		super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JButton agg=new JButton("Aggiungi");
		JButton sott=new JButton("Sottrai");
		JButton canc=new JButton("Azzera");
		JLabel conta=new JLabel("0", JLabel.RIGHT);
		conta.setBorder(null);
		
		super.add(agg);
		super.add(sott);
		super.add(canc);
		super.add(new JLabel(""));
		super.add(conta);
		super.add(new JLabel(""));
		
		super.setLayout(new GridLayout(2,3,10,10));
		super.setSize(400,300);
		super.setResizable(false);
		super.setVisible(true);
		
		
		//***INIZIO GESTIONE AGGIUNGI***
				agg.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent E) {
						Integer appo=(Integer.parseInt(conta.getText())) + 1;
						conta.setText(String.valueOf(appo));
					}
				});
		//***FINE GESTIONE BOTTONE AGGIUNGI***
				
		//***INIZIO GESTIONE SOTTRAI***
				sott.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent E) {
						Integer appo=(Integer.parseInt(conta.getText())) - 1;
						conta.setText(String.valueOf(appo));
					}
				});
		//***FINE GESTIONE BOTTONE SOTTRAI***
				
		//***INIZIO GESTIONE AZZERA***
				canc.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent E) {
						conta.setText("0");
					}
				});
		//***FINE GESTIONE BOTTONE AZZERA***
	}
	
	public static void main(String[] args) {
		new Counter();
	}

}
