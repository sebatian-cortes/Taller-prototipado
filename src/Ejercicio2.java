

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

public class Ejercicio2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto1;
	JLabel etiTexto2;
	private JButton btnTraspasa1;
	private JButton btnTraspasa2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio2 frame = new Ejercicio2();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
		
		
	}

	private void iniciarComponentes() {
		txtTexto = new JTextField();
		txtTexto.setBounds(70, 70, 308, 40);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		etiTexto1 = new JLabel("");
		etiTexto1.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiTexto1.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto1.setBounds(10, 149, 188, 26);
		contentPane.add(etiTexto1);
		
		etiTexto2 = new JLabel("");
		etiTexto2.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto2.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiTexto2.setBounds(236, 149, 188, 26);
		contentPane.add(etiTexto2);
		
		JLabel descripcion = new JLabel("ingrese cualquier texto");
		descripcion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		descripcion.setHorizontalAlignment(SwingConstants.CENTER);
		descripcion.setBounds(126, 24, 188, 26);
		contentPane.add(descripcion);		
		
		btnTraspasa1 = new JButton("Traspasa 1");
		btnTraspasa1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTraspasa1.setBounds(42, 216, 144, 34);
		btnTraspasa1.addActionListener(this);
		contentPane.add(btnTraspasa1);
		
		btnTraspasa2 = new JButton("Traspasa 2");
		btnTraspasa2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnTraspasa2.setBounds(247, 216, 144, 34);
		btnTraspasa2.addActionListener(this);
		contentPane.add(btnTraspasa2);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == btnTraspasa1 ) {
			etiTexto1.setText(txtTexto.getText());
    
         }
		
		if ( e.getSource() == btnTraspasa2 ) {
			etiTexto2.setText(txtTexto.getText());
    
         }	
		
	}

}