package calculator;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import java.util.StringTokenizer;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(34, 22, 364, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		final JButton btndiv = new JButton("/");
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btndiv.getText();
				textField.setText(EnterNumber);
			}
		});
		btndiv.setBounds(309, 80, 85, 43);
		frame.getContentPane().add(btndiv);
		
		final JButton btnmult = new JButton("*");
		btnmult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btnmult.getText();
				textField.setText(EnterNumber);
			}
		});
		btnmult.setBounds(220, 80, 79, 43);
		frame.getContentPane().add(btnmult);
		
		final JButton btnmoins = new JButton("-");
		btnmoins.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btnmoins.getText();
				textField.setText(EnterNumber);
			}
		});
		btnmoins.setBounds(125, 80, 85, 43);
		frame.getContentPane().add(btnmoins);
		
		final JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btnplus.getText();
				textField.setText(EnterNumber);
			}
		});
		btnplus.setBounds(34, 80, 85, 43);
		frame.getContentPane().add(btnplus);
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(309, 133, 85, 43);
		frame.getContentPane().add(btn4);
		
		final JButton bnt3 = new JButton("3");
		bnt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + bnt3.getText();
				textField.setText(EnterNumber);
			}
		});
		bnt3.setBounds(220, 133, 85, 43);
		frame.getContentPane().add(bnt3);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(125, 133, 85, 43);
		frame.getContentPane().add(btn2);
		
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(34, 133, 85, 43);
		frame.getContentPane().add(btn1);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(309, 190, 85, 43);
		frame.getContentPane().add(btn8);
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(220, 190, 85, 43);
		frame.getContentPane().add(btn7);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(125, 190, 85, 43);
		frame.getContentPane().add(btn6);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(34, 190, 85, 43);
		frame.getContentPane().add(btn5);
		
		JButton btnegal = new JButton("=");
		btnegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String enternum = textField.getText();
			float total = 0;
			//controle d'erreur flush 
			System.out.flush();
			//faire un split a la chaine enternum par le séparateur + 
			StringTokenizer plus = new StringTokenizer(enternum,"+");
			//controle d'iteration renvoyant un booleen indiquant si il reste encore des elements "has more token"
			while(plus.hasMoreTokens()) {
				//"plus val" contient la valeur du prochain element 
				String plusVal = plus.nextToken();
				//1ere exception: eviter le number format exception 
				try {
					//convertir l'element de type string en float
					total+=Float.parseFloat(plusVal);
					System.out.println("addition de : "+plusVal);
				}catch(NumberFormatException plusError)// eviter le NumberFormatException
				{
					System.out.println("passer a la soustraction");
					//faire un split par le separateur '-'
					StringTokenizer moin = new StringTokenizer(plusVal,"-");
					//la variable firstValSub prend true s il exite le premier element pour la soustraction
					boolean firstValSub = true;
					while(moin.hasMoreTokens()) {
						//countMinus compter combier d element il y a dans l operation de soustraction
						int countMinus = moin.countTokens();
						//minusVal contient la valeur du prochain element
						String minusVal = moin.nextToken();
						try {
							if(firstValSub) {
								//le premier element de la soustraction = faux 'n existe pas ' 
								firstValSub = false;
								// alors on ajoute au total =0 la valeur du deuxieme element a soustraire
								total+=Float.parseFloat(minusVal);
								System.out.println("1ere valeur dans la soustraction: "+minusVal);
							}else {
								// sinon si le premier element existe on ajoute le resultat de la soustraction au total 
								total-=Float.parseFloat(minusVal);
								System.out.println("valeur a soustraire: "+minusVal);
							}
						}catch(NumberFormatException minusError) {
							boolean totalchanged = false;
							System.out.println("passer a la multiplication");
							float TotalMultipDiv = 0;
							StringTokenizer times = new StringTokenizer(minusVal,"*");
							boolean firstValMultip = true;
							while(times.hasMoreTokens()) {
								String timesVal = times.nextToken();
								try {
									if(firstValMultip) {
										TotalMultipDiv+=Float.parseFloat(timesVal);
										System.out.println("valeur a multiplier: "+timesVal);
										firstValMultip = false;
									}else {
										TotalMultipDiv*=Float.parseFloat(timesVal);
										System.out.println("le nombre de fois: "+timesVal);
									}
								}catch(NumberFormatException timesError) {
									System.out.println("passer a la division");
									StringTokenizer division = new StringTokenizer(timesVal,"/");
									boolean firstValDiv = true;
									while(division.hasMoreTokens()) {
										String divisionVal = division.nextToken();
										if(firstValDiv) {
											TotalMultipDiv+=Float.parseFloat(divisionVal);
											System.out.println("valeur a diviser : "+divisionVal);
											firstValDiv = false;
										}else {
											TotalMultipDiv/=Float.parseFloat(divisionVal);
											System.out.println("le quotient : "+divisionVal);
										}
									}
								}
							}
							if(countMinus==1 && total!=0 || totalchanged) {
								System.out.println("faire le total de la soustraction: " +total+" et total de division ou de multiplication: "+TotalMultipDiv);
								total-=TotalMultipDiv;
								totalchanged = true;
							}else {
								System.out.println("faire le total de l'addition: " +total +" et total de la division ou de la multiplication: "+TotalMultipDiv);
								total+=TotalMultipDiv;
								totalchanged = true;
							}	
						}
					}
				}
			}
			textField.setText(""+total);
			}
	});
			
	
		btnegal.setBounds(309, 243, 85, 43);
		frame.getContentPane().add(btnegal);
		
		final JButton btnpoint = new JButton(".");
		btnpoint.addActionListener(new ActionListener()) 
			public void actionPerformed(ActionEvent e) {
				Window btnpoint;
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btnpoint.getText();
				textField.setText(EnterNumber);
			
		;
		btnpoint.setBounds(220, 243, 85, 43);
		frame.getContentPane().add(btnpoint);
		
		final JButton btnzero = new JButton("0");
		btnzero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btnzero.getText();
				textField.setText(EnterNumber);
			}
		});
		btnzero.setBounds(125, 243, 85, 43);
		frame.getContentPane().add(btnzero);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//passer la valeur a l'adresse memoire du bouton 
				String  EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(34, 243, 85, 43);
		frame.getContentPane().add(btn9);
		
		JButton btnclear = new JButton("clear");
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);

			}
		});
		btnclear.setBounds(176, 298, 85, 43);
		frame.getContentPane().add(btnclear);
	}
}
