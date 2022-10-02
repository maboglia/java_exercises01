package it.itiscastelli.bolloauto4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BolloAutoJFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	// reference relativo all'auto
	Automobile auto;
	private JPanel contentPane;
	private JTextField txtPotenza;
	private JComboBox cboRegione;
	private JLabel lblValoreBollo;
	private JComboBox cboClasse;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BolloAutoJFrame frame = new BolloAutoJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BolloAutoJFrame() {
		setTitle("Calcolo del Bollo Auto");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 196);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblRegione = new JLabel("Regione");
		contentPane.add(lblRegione);
		
		cboRegione = new JComboBox();
		cboRegione.setModel(new DefaultComboBoxModel(new String[] {"Basilicata", "Bolzano", "Friuli", "EmiliaRomagna", "Lazio", "Lombardia", "Molise"}));
		contentPane.add(cboRegione);
		
		JLabel lblClasse = new JLabel("Classe");
		contentPane.add(lblClasse);
		
		cboClasse = new JComboBox();
		cboClasse.setModel(new DefaultComboBoxModel(new String[] {"Euro0", "Euro1", "Euro2", "Euro3", "Euro4", "Euro5"}));
		contentPane.add(cboClasse);
		
		JLabel lblPotenza = new JLabel("Potenza (KW)");
		contentPane.add(lblPotenza);
		
		txtPotenza = new JTextField();
		contentPane.add(txtPotenza);
		txtPotenza.setColumns(10);
		
		lblValoreBollo = new JLabel("Valore del bollo");

		
		
		JButton btnCalcolaBollo = new JButton("Calcola bollo");
		
		contentPane.add(btnCalcolaBollo);
		contentPane.add(lblValoreBollo);
		
		btnCalcolaBollo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				Automobile.Regione regione = Automobile.Regione.valueOf(((String) cboRegione.getSelectedItem()));
				Automobile.Classe classe = Automobile.Classe.valueOf(((String) cboClasse.getSelectedItem()));
			
				//Automobile.Regione regione = Regione.Lombardia;
				//Automobile.Classe classe = Classe.Euro5;
				
				//JOptionPane.showMessageDialog(null, ""+regione.toString());
				//JOptionPane.showMessageDialog(null, ""+classe.toString());
				
				int potenza = Integer.parseInt(txtPotenza.getText());
				
				//JOptionPane.showMessageDialog(null, ""+potenza);
				
				// non importa sapere la targa e il modello, li scelgo a caso
				auto = new Automobile("AX838U","C3 Picasso",classe, potenza, regione);
				
				lblValoreBollo.setText("Valore del bollo: "+auto.bollo() + " Euro");
				//JOptionPane.showMessageDialog(null, ""+auto.bollo());
			}
		});
		
	}

}
