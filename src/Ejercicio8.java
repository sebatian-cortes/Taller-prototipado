import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Ejercicio8 extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiTexto;
	JButton btnAzul,btnRojo,btnVerde,btnFondoAzul,btnFondoRojo,btnFondoVerde,btnTrasnparente,btnOpaca;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio8 frame = new Ejercicio8();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		btnAzul = new JButton("AZUL");
		btnAzul.setBackground(Color.LIGHT_GRAY);
		btnAzul.setForeground(Color.BLUE);
		btnAzul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAzul.setBounds(10, 74, 113, 44);
		btnAzul.addActionListener(this);
		contentPane.add(btnAzul);
		
	    btnRojo = new JButton("ROJO");
		btnRojo.setForeground(Color.RED);
		btnRojo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnRojo.setBackground(Color.LIGHT_GRAY);
		btnRojo.setBounds(167, 74, 113, 44);
		btnRojo.addActionListener(this);
		contentPane.add(btnRojo);
		
		btnVerde = new JButton("VERDE");
		btnVerde.setForeground(Color.GREEN);
		btnVerde.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnVerde.setBackground(Color.LIGHT_GRAY);
		btnVerde.setBounds(311, 77, 113, 44);
		btnVerde.addActionListener(this);
		contentPane.add(btnVerde);
		
		btnFondoAzul = new JButton("FON AZUL");
		btnFondoAzul.setForeground(Color.BLACK);
		btnFondoAzul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFondoAzul.setBackground(Color.BLUE);
		btnFondoAzul.setBounds(10, 144, 113, 44);
		btnFondoAzul.addActionListener(this);
		contentPane.add(btnFondoAzul);
		
		btnFondoRojo = new JButton("FON ROJO");
		btnFondoRojo.setForeground(Color.BLACK);
		btnFondoRojo.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFondoRojo.setBackground(Color.RED);
		btnFondoRojo.setBounds(167, 144, 113, 44);
		btnFondoRojo.addActionListener(this);
		contentPane.add(btnFondoRojo);
		
		btnFondoVerde = new JButton("F VERDE");
		btnFondoVerde.setForeground(Color.BLACK);
		btnFondoVerde.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnFondoVerde.setBackground(Color.GREEN);
		btnFondoVerde.setBounds(311, 144, 113, 44);
		btnFondoVerde.addActionListener(this);
		contentPane.add(btnFondoVerde);
		
		btnTrasnparente = new JButton("TRASNPARENTE");
		btnTrasnparente.setForeground(Color.LIGHT_GRAY);
		btnTrasnparente.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTrasnparente.setBackground(Color.WHITE);
		btnTrasnparente.setBounds(42, 206, 164, 44);
		btnTrasnparente.addActionListener(this);
		contentPane.add(btnTrasnparente);
		
		btnOpaca = new JButton("OPACA");
		btnOpaca.setForeground(Color.GRAY);
		btnOpaca.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnOpaca.setBackground(Color.WHITE);
		btnOpaca.setBounds(236, 206, 164, 44);
		btnOpaca.addActionListener(this);
		contentPane.add(btnOpaca);
		
		etiTexto = new JLabel("SEBASTIAN");
		etiTexto.setFont(new Font("Tahoma", Font.BOLD, 15));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setOpaque(true);
		etiTexto.setBackground(Color.WHITE);
		etiTexto.setBounds(167, 11, 113, 33);
		contentPane.add(etiTexto);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
     if (e.getSource()== btnAzul) {
	etiTexto.setForeground(Color.BLUE);
      }		

     if (e.getSource()== btnRojo) {
	etiTexto.setForeground(Color.RED);
     }	
     if (e.getSource()== btnVerde) {
    		etiTexto.setForeground(Color.GREEN);
    	}	
     if (e.getSource()== btnFondoAzul) {
    		etiTexto.setBackground(Color.BLUE);
    	}		
     if (e.getSource()== btnFondoRojo) {
    		etiTexto.setBackground(Color.RED);
    	}
     if (e.getSource()== btnFondoVerde) {
 		etiTexto.setBackground(Color.GREEN);
 	}	
     if (e.getSource()==btnTrasnparente) {
		etiTexto.setOpaque(false);
		etiTexto.setForeground(Color.BLACK);
	}
     if (e.getSource()==btnOpaca) {
    	 etiTexto.setOpaque(true);
 		etiTexto.setForeground(Color.BLACK);
 		etiTexto.setBackground(Color.WHITE);

	}
	}
}
