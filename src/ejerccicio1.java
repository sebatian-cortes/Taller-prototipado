

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejerccicio1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	JButton btnOcultarNombre;
	JButton btnVisuNombre;
	JButton btnOcultarCiudad;
	JButton btnVisuCiudad;
	JLabel etiNombre;
	JLabel etiCiudad;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ejerccicio1 frame = new ejerccicio1();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ejerccicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 335);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {
		etiNombre = new JLabel("Sebastian Agudelo Cortes");
		etiNombre.setFont(new Font("Tahoma", Font.BOLD, 18));
		etiNombre.setForeground(new Color(255, 255, 255));
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setBounds(126, 21, 313, 26);
		contentPane.add(etiNombre);
		
		etiCiudad = new JLabel("Calarca");
		etiCiudad.setForeground(new Color(255, 255, 255));
		etiCiudad.setHorizontalAlignment(SwingConstants.CENTER);
		etiCiudad.setFont(new Font("Tahoma", Font.BOLD, 18));
		etiCiudad.setBounds(141, 77, 276, 37);
		contentPane.add(etiCiudad);
		
		btnOcultarNombre = new JButton("Ocultar Nombre");
		btnOcultarNombre.setBackground(Color.BLACK);
		btnOcultarNombre.setForeground(Color.WHITE);
		btnOcultarNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnOcultarNombre.setBounds(41, 161, 190, 37);
		btnOcultarNombre.addActionListener(this);
		contentPane.add(btnOcultarNombre);
		
		btnVisuNombre = new JButton("Visualizar Nombre");	
		btnVisuNombre.setForeground(new Color(0, 0, 128));
		btnVisuNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnVisuNombre.setBackground(SystemColor.activeCaptionBorder);
		btnVisuNombre.setBounds(330, 161, 190, 37);
		btnVisuNombre.addActionListener(this);
		contentPane.add(btnVisuNombre);
		
		btnOcultarCiudad = new JButton("Ocultar Ciudad");
		btnOcultarCiudad.setForeground(new Color(255, 255, 255));
		btnOcultarCiudad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnOcultarCiudad.setBackground(Color.BLACK);
		btnOcultarCiudad.setBounds(41, 230, 190, 37);
		btnOcultarCiudad.addActionListener(this);
		contentPane.add(btnOcultarCiudad);
		
		btnVisuCiudad = new JButton("Ocultar Nombre");
		btnVisuCiudad.setForeground(new Color(0, 0, 128));
		btnVisuCiudad.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		btnVisuCiudad.setBackground(SystemColor.activeCaptionBorder);
		btnVisuCiudad.setBounds(330, 230, 190, 37);
		btnVisuCiudad.addActionListener(this);
		contentPane.add(btnVisuCiudad);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if ( e.getSource() == btnOcultarNombre ) {
			etiNombre.setVisible(false);
    
         }
		
		if ( e.getSource() == btnVisuNombre ) {
			etiNombre.setVisible(true);
    
         }	
		
		if ( e.getSource() == btnOcultarCiudad ) {
			etiCiudad.setVisible(false);
    
         }
		
		if ( e.getSource() == btnVisuCiudad ) {
			etiCiudad.setVisible(true);
    
         }
		
	}
}
