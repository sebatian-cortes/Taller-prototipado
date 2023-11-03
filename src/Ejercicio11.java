import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Ejercicio11 extends JFrame implements ActionListener,MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiCinco;
	private JTextField txtNumero;
	JLabel etiUno,etiDos,etiDiez,etiNueve,etiOcho,etiSiete, etiSeis,etiCuatro,etiTres;
	JButton btnBorrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Ejercicio11 frame = new Ejercicio11();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Ejercicio11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		etiUno = new JLabel("0");
		etiUno.setHorizontalAlignment(SwingConstants.CENTER);
		etiUno.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiUno.setBounds(37, 21, 46, 29);
		etiUno.addMouseListener(this);
		contentPane.add(etiUno);
		
		etiDos = new JLabel("1");
		etiDos.setHorizontalAlignment(SwingConstants.CENTER);
		etiDos.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiDos.setBounds(121, 21, 46, 29);
		etiDos.addMouseListener(this);
		contentPane.add(etiDos);
		
		etiTres = new JLabel("2");
		etiTres.setHorizontalAlignment(SwingConstants.CENTER);
		etiTres.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiTres.setBounds(196, 21, 46, 29);
		etiTres.addMouseListener(this);
		contentPane.add(etiTres);
		
		etiCuatro = new JLabel("3");
		etiCuatro.setHorizontalAlignment(SwingConstants.CENTER);
		etiCuatro.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiCuatro.setBounds(269, 21, 46, 29);
		etiCuatro.addMouseListener(this);
		contentPane.add(etiCuatro);
		
		etiCinco = new JLabel("4");
		etiCinco.setHorizontalAlignment(SwingConstants.CENTER);
		etiCinco.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiCinco.setBounds(350, 21, 46, 29);
		etiCinco.addMouseListener(this);
		contentPane.add(etiCinco);
		
		etiSeis = new JLabel("5");
		etiSeis.setHorizontalAlignment(SwingConstants.CENTER);
		etiSeis.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiSeis.setBounds(37, 72, 46, 29);
		etiSeis.addMouseListener(this);
		contentPane.add(etiSeis);
		
		etiSiete = new JLabel("6");
		etiSiete.setHorizontalAlignment(SwingConstants.CENTER);
		etiSiete.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiSiete.setBounds(121, 72, 46, 29);
		etiSiete.addMouseListener(this);
		contentPane.add(etiSiete);
		
		etiOcho = new JLabel("7");
		etiOcho.setHorizontalAlignment(SwingConstants.CENTER);
		etiOcho.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiOcho.setBounds(196, 72, 46, 29);
		etiOcho.addMouseListener(this);
		contentPane.add(etiOcho);
		
	    etiNueve = new JLabel("8");
		etiNueve.setHorizontalAlignment(SwingConstants.CENTER);
		etiNueve.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiNueve.setBounds(269, 72, 46, 29);
		etiNueve.addMouseListener(this);
		contentPane.add(etiNueve);
		
		etiDiez = new JLabel("9");
		etiDiez.setHorizontalAlignment(SwingConstants.CENTER);
		etiDiez.setFont(new Font("Tahoma", Font.BOLD, 17));
		etiDiez.setBounds(350, 72, 46, 29);
		contentPane.add(etiDiez);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(45, 135, 351, 34);
		contentPane.add(txtNumero);
		etiDiez.addMouseListener(this);
		txtNumero.setColumns(10);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnBorrar.setBounds(163, 190, 102, 41);
		btnBorrar.addActionListener(this);
		contentPane.add(btnBorrar);		
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

		if (e.getSource()== etiUno) {
			txtNumero.setText(txtNumero.getText()+"0");
		}
		if (e.getSource()== etiDos) {
			txtNumero.setText(txtNumero.getText()+"1");
		}
		if (e.getSource()== etiTres) {
			txtNumero.setText(txtNumero.getText()+"2");
		}
		if (e.getSource()== etiCuatro) {
			txtNumero.setText(txtNumero.getText()+"3");
		}
		if (e.getSource()== etiCinco) {
			txtNumero.setText(txtNumero.getText()+"4");
		}
		if (e.getSource()== etiSeis) {
			txtNumero.setText(txtNumero.getText()+"5");
		}
		if (e.getSource()== etiSiete) {
			txtNumero.setText(txtNumero.getText()+"6");
		}
		if (e.getSource()== etiOcho) {
			txtNumero.setText(txtNumero.getText()+"7");
		}
		if (e.getSource()== etiNueve) {
			txtNumero.setText(txtNumero.getText()+"8");
			
		}
		if (e.getSource()== etiDiez) {
			txtNumero.setText(txtNumero.getText()+"9");
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==btnBorrar) {
			txtNumero.setText("");
		}
	}

}
