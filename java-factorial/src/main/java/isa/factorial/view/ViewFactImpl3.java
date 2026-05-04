package isa.factorial.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;

public class ViewFactImpl3 extends JFrame implements ViewFactorial {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblResultado;
	private JButton btnCalcular;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFactImpl3 frame = new ViewFactImpl3();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewFactImpl3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel lblNumero = new JLabel("número:");
		panel.add(lblNumero);
		
		textField = new JTextField();
		panel.add(textField);
		textField.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		panel.add(btnCalcular);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		lblResultado = new JLabel("");
		panel_1.add(lblResultado);
		
		JButton btnLimpiar = new JButton("Borrar");
		panel_1.add(btnLimpiar);
		
		this.pack();
		this.setVisible(true);

	}

	@Override
	public int getInput() {
		return Integer.parseInt(textField.getText());
	}

	@Override
	public void setResult(long res) {
		this.lblResultado.setText("Resultado: " + res);
		
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setController(ActionListener ctr) {
		btnCalcular.addActionListener(ctr);
		btnCalcular.setActionCommand("Calcular");
	}

}
