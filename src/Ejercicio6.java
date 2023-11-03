import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.SwingConstants;
import java.awt.Color;

public class Ejercicio6 extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel etiNombre;
	JButton btnEsquina,btnCentro,btnAgrandar,btnAchicar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio6 frame = new Ejercicio6();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		btnEsquina = new JButton("ESQUINA");
		btnEsquina.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnEsquina.setBounds(10, 133, 108, 36);
		btnEsquina.addActionListener(this);
		btnEsquina.addMouseListener(this);
		contentPane.add(btnEsquina);
		
		btnCentro = new JButton("CENTRO");
		btnCentro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnCentro.setBounds(316, 133, 108, 36);
		btnCentro.addActionListener(this);
		btnCentro.addMouseListener(this);
		contentPane.add(btnCentro);
		
		btnAgrandar = new JButton("AGRANDAR");
		btnAgrandar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAgrandar.setBounds(10, 214, 108, 36);
		btnAgrandar.addActionListener(this);
		btnAgrandar.addMouseListener(this);
		contentPane.add(btnAgrandar);
		
		btnAchicar = new JButton("ACHICAR");
		btnAchicar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnAchicar.setBounds(316, 214, 108, 36);
		btnAchicar.addActionListener(this);
		btnAchicar.addMouseListener(this);
		contentPane.add(btnAchicar);
		
		etiNombre = new JLabel("Sebastian");
		etiNombre.setOpaque(true);
		etiNombre.setBackground(Color.WHITE);
		etiNombre.setHorizontalAlignment(SwingConstants.CENTER);
		etiNombre.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiNombre.setBounds(160, 11, 113, 50);
		contentPane.add(etiNombre); 		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
       
		if (e.getSource()== btnEsquina) {
			etiNombre.setLocation(333, 11);
		}
		if (e.getSource()== btnCentro) {
			etiNombre.setLocation(171, 111);
		}
		if (e.getSource()==btnAchicar) {
			etiNombre.setSize(75, 29);
			etiNombre.setFont(new Font("Tahoma", Font.BOLD, 10));		}
		if (e.getSource()==btnAgrandar) {
			etiNombre.setSize(164, 57);
			etiNombre.setFont(new Font("Tahoma", Font.BOLD, 25));
		}
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
		if (e.getSource()==btnAchicar) {
			
			btnAchicar.setBounds(294, 200, 130, 50);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setBounds(10, 200, 130, 50);
		}
		if (e.getSource()==btnEsquina) {
			btnEsquina.setBounds(10, 133, 130, 50);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setBounds(294, 133, 130, 50);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
if (e.getSource()==btnAchicar) {
			
	btnAchicar.setBounds(316, 214, 108, 36);
		}
		if (e.getSource()==btnAgrandar) {
			btnAgrandar.setBounds(10, 214, 108, 36);
		}
		if (e.getSource()==btnEsquina) {
			btnEsquina.setBounds(10, 133, 108, 36);
		}
		if (e.getSource()==btnCentro) {
			btnCentro.setBounds(316, 133, 108, 36);
		}		
	}

}
