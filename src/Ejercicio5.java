import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

public class Ejercicio5 extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiOcultar, etiPal4, etiPal3,etiPal2,etiPal1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio5 frame = new Ejercicio5();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 353);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		etiPal1 = new JLabel("Hola");
		etiPal1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiPal1.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal1.setBounds(32, 54, 127, 39);
		contentPane.add(etiPal1);
		
		etiPal2 = new JLabel(" Buenas");
		etiPal2.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiPal2.setBounds(199, 54, 127, 39);
		contentPane.add(etiPal2);
		
		etiPal3 = new JLabel("Adios");
		etiPal3.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiPal3.setBounds(363, 54, 127, 39);
		contentPane.add(etiPal3);
		
		etiPal4 = new JLabel("No se que poner");
		etiPal4.setHorizontalAlignment(SwingConstants.CENTER);
		etiPal4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		etiPal4.setBounds(199, 132, 127, 39);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("OCULTAR");
		etiOcultar.setToolTipText("");
		etiOcultar.setOpaque(true);
		etiOcultar.setForeground(Color.BLACK);
		etiOcultar.setBackground(Color.LIGHT_GRAY);
		etiOcultar.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcultar.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiOcultar.setBounds(199, 246, 127, 39);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
       if (e.getSource()== etiOcultar) {
	etiPal1.setVisible(false);
	etiPal2.setVisible(false);
	etiPal3.setVisible(false);
	etiPal4.setVisible(false);
        }		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()== etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		        }		
	}
}
