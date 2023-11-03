import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Ejercicio4 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtCiudad;
	private JLabel txtFrase;
	private JButton btnAceptar;
	private JButton btnDesactivar;
	private JButton btnActivar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio4 frame = new Ejercicio4();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 483, 340);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.controlShadow);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		txtNombre = new JTextField();
		txtNombre.setBounds(101, 17, 321, 36);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCiudad = new JTextField();
		txtCiudad.setColumns(10);
		txtCiudad.setBounds(101, 71, 321, 36);
		contentPane.add(txtCiudad);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setBounds(10, 20, 104, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblCiudad = new JLabel("Ciudad:");
		lblCiudad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblCiudad.setBounds(10, 80, 104, 27);
		contentPane.add(lblCiudad);
		
		txtFrase = new JLabel("Frase:");
		txtFrase.setFont(new Font("Tahoma", Font.BOLD, 17));
		txtFrase.setBounds(10, 146, 457, 36);
		contentPane.add(txtFrase);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAceptar.setBounds(23, 221, 115, 41);
		btnAceptar.addActionListener(this);
		contentPane.add(btnAceptar);
		
		btnDesactivar = new JButton("Desactivar");
		btnDesactivar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDesactivar.setBounds(175, 221, 115, 41);
		btnDesactivar.addActionListener(this);
		contentPane.add(btnDesactivar);
		
		btnActivar = new JButton("Activar");
		btnActivar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnActivar.setBounds(329, 221, 115, 41);
		btnActivar.addActionListener(this);
		contentPane.add(btnActivar);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == btnAceptar  ) {
			txtFrase.setText("Frase: Usted se llama "+ txtNombre.getText()+" y vive en "+txtCiudad.getText());
    
         }	
		
		if ( e.getSource() == btnDesactivar  ) {
			txtCiudad.setEnabled(false);
			txtNombre.setEnabled(false);

    
         }	
		
		if ( e.getSource() == btnActivar  ) {
			txtCiudad.setEnabled(true);
			txtNombre.setEnabled(true);

    
         }	
	}
}
