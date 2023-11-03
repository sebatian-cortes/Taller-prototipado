import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Ejercicio3 extends JFrame implements ActionListener, KeyListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	JLabel etiTexto;
	JButton btnVaciar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio3 frame = new Ejercicio3();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		etiTexto = new JLabel("");
		etiTexto.setFont(new Font("Tahoma", Font.BOLD, 14));
		etiTexto.setHorizontalAlignment(SwingConstants.CENTER);
		etiTexto.setBounds(10, 101, 414, 46);
		contentPane.add(etiTexto);
		
		btnVaciar = new JButton("VACIAR");
		btnVaciar.setForeground(SystemColor.window);
		btnVaciar.setBackground(SystemColor.windowBorder);
		btnVaciar.setBounds(156, 190, 123, 43);
		btnVaciar.addActionListener(this);

		contentPane.add(btnVaciar);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(61, 22, 311, 43);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);	
		txtTexto.addKeyListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ( e.getSource() == btnVaciar  ) {
			etiTexto.setText("");
			txtTexto.setText("");
    
         }		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	
					
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if ( e.getSource() == txtTexto  ) {
			etiTexto.setText(txtTexto.getText());
    
         }			
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
