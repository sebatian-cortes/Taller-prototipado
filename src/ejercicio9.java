import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ejercicio9 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	JLabel lblNota1, lblNota2, lblNota3,titulo;
	JButton btnCalcular;
	JTextField txtPrimerTrimestre,txtTercerTrimestre,txtSegundoTrimestre;
	JLabel etiNotaFinal,etiResultado;
	double notaF;
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		ejercicio9 frame = new ejercicio9();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public ejercicio9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
       iniciarComponentes();
		
		setTitle("Promedio Notas");
		setSize(475,366);
		setLocationRelativeTo(null);
	}

	private void iniciarComponentes() {

		titulo=new JLabel();	
		titulo.setBounds(99, 11, 247, 20);
		titulo.setText("SISTEMA CONTROL DE NOTAS");
		titulo.setFont(new Font("Tahoma", Font. BOLD, 16));
		
		
		
		txtPrimerTrimestre =new JTextField();
		txtPrimerTrimestre.setBounds(109, 44, 91, 30);
		
		txtSegundoTrimestre =new JTextField();
		txtSegundoTrimestre.setBounds(109, 102, 91, 30);
		
		txtTercerTrimestre =new JTextField();
		txtTercerTrimestre.setBounds(109, 160, 91, 30);
		contentPane.setLayout(null);
		contentPane.add(txtPrimerTrimestre);
		contentPane.add(txtSegundoTrimestre);
		contentPane.add(txtTercerTrimestre);
		
		
		lblNota1=new JLabel();
		lblNota1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNota1.setBounds(37, 47, 48, 22);
		lblNota1.setText("NOTA 1");
		contentPane.add(lblNota1);

		
		lblNota2 = new JLabel();
		lblNota2.setText("NOTA 2");
		lblNota2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNota2.setBounds(37, 105, 48, 22);
		contentPane.add(lblNota2);
		
		lblNota3 = new JLabel();
		lblNota3.setText("NOTA 3");
		lblNota3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNota3.setBounds(37, 163, 48, 22);
		contentPane.add(lblNota3);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCalcular.setBounds(127, 247, 162, 33);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
		
		etiResultado = new JLabel("Resultado: ");
		etiResultado.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiResultado.setBounds(236, 137, 223, 33);
		contentPane.add(etiResultado);
		
		etiNotaFinal = new JLabel("Nota Final: ");
		etiNotaFinal.setFont(new Font("Tahoma", Font.BOLD, 12));
		etiNotaFinal.setBounds(236, 57, 223, 33);
		contentPane.add(etiNotaFinal);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
 
		if (e.getSource()==btnCalcular) {
			notaF= (Integer.parseInt(txtPrimerTrimestre.getText())+Integer.parseInt(txtSegundoTrimestre.getText()) +Integer.parseInt(txtTercerTrimestre.getText()))/3 ;
			
			etiNotaFinal.setText("Nota Final: "+notaF);
			
			if (notaF >=3) {
				etiResultado.setText("Resultado: APROBADO");
				etiResultado.setForeground(Color.GREEN);
				
			}else {
				etiResultado.setText("Resultado: REPROBADO");
				etiResultado.setForeground(Color.RED);
				
			}
		}
	}
}
