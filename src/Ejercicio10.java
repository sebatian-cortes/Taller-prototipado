import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class Ejercicio10 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPalabra1;
	private JTextField txtPalabra2;
	JButton btnConcatena;
	JLabel etiTexto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio10 frame = new Ejercicio10();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPalabra1 = new JTextField();
		txtPalabra1.setBounds(10, 40, 199, 36);
		contentPane.add(txtPalabra1);
		txtPalabra1.setColumns(10);
		
		txtPalabra2 = new JTextField();
		txtPalabra2.setColumns(10);
		txtPalabra2.setBounds(225, 40, 199, 36);
		contentPane.add(txtPalabra2);
		
		JLabel lblNewLabel = new JLabel("Texto 1");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(56, 11, 117, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblTexto = new JLabel("Texto 2");
		lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
		lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTexto.setBounds(264, 11, 117, 30);
		contentPane.add(lblTexto);
		
		btnConcatena = new JButton("CONCATENAR");
		btnConcatena.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnConcatena.setBounds(161, 115, 117, 36);
		btnConcatena.addActionListener(this);
		contentPane.add(btnConcatena);
		
		etiTexto = new JLabel("");
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiTexto.setBounds(32, 200, 368, 36);
		contentPane.add(etiTexto);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==btnConcatena) {
			etiTexto.setText(txtPalabra1.getText()+txtPalabra2.getText());
		}
	}
}
