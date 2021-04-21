import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ButtonGroup;

public class telaCad_1 extends JFrame {

		private JLabel labelTitle = null;
		private JLabel labelName = null;
		private JTextField txtName = null;
		private JLabel labelEmail = null;
		private JTextField txtEmail = null;
		private JLabel labelGender = null;
		private JRadioButton rdbGenderFC = null;
		private JRadioButton rdbGenderMC = null;
		private JRadioButton rdbGenderFT = null;
		private JRadioButton rdbGenderMT = null;
		private JRadioButton rdbGenderNB = null;
		private JLabel labelMotherName = null;
		private JTextField txtMotherName = null;
		private JLabel labelAge = null;
		private JTextField txtAge = null;
		private JButton btnRegister = null;
		
		private ButtonGroup typeGender = null;
		
		public telaCad_1() {
			
			setSize(500,400);
			setLocation(20,20);
			setLayout(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			labelTitle = new JLabel("Cadastro de Alunos");
			labelTitle.setBounds(138, 10, 225, 23);
			labelTitle.setFont(new Font("Calibri", Font.BOLD, 20));
			
			labelName = new JLabel("Name");
			labelName.setBounds(100,50,100,20);
			
			txtName = new JTextField(10);
			txtName.setBounds(150, 50, 225, 25);
			
			labelEmail = new JLabel("Email");
			labelEmail.setBounds(100,85,100,20);
			
			txtEmail = new JTextField(10);
			txtEmail.setBounds(150,85,225,25);
			
			labelGender = new JLabel("Gender");
			labelGender.setBounds(100,120,100,20);
			
			rdbGenderFC = new JRadioButton("Mulher cis");
			rdbGenderFC.setBounds(150,120,150,20);
			rdbGenderMC = new JRadioButton("Homem cis");
			rdbGenderMC.setBounds(150,145,150,20);
			rdbGenderFT = new JRadioButton("Mulher Trans");
			rdbGenderFT.setBounds(150,170,150,20);
			rdbGenderMT = new JRadioButton("Homem Trans");
			rdbGenderMT.setBounds(150,195,150,20);
			rdbGenderNB = new JRadioButton("Não Binário");
			rdbGenderNB.setBounds(150,220,150,20);
			
			labelMotherName = new JLabel("Mother's Name");
			labelMotherName.setBounds(100,255,100,20);
			
			txtMotherName = new JTextField(10);
			txtMotherName.setBounds(200,255,175,25);
			
			labelAge = new JLabel("Age");
			labelAge.setBounds(100,290,100,20);
			
			txtAge = new JTextField(10);
			txtAge.setBounds(150,290,225,25);
			
			btnRegister = new JButton();
			btnRegister.setText("Register");
			//btnRegister.setLayout(null);
			btnRegister.setBounds(220, 335, 100, 25);
			
			typeGender = new ButtonGroup();
			
			typeGender.add(rdbGenderFC);
			typeGender.add(rdbGenderMC);
			typeGender.add(rdbGenderFT);
			typeGender.add(rdbGenderMT);
			typeGender.add(rdbGenderNB);
			
			
			add(labelTitle);
			add(labelName);
			add(txtName);
			add(labelEmail);
			add(txtEmail);
			add(labelGender);
			add(rdbGenderFC);
			add(rdbGenderMC);
			add(rdbGenderFT);
			add(rdbGenderMT);
			add(rdbGenderNB);
			add(labelMotherName);
			add(txtMotherName);
			add(labelAge);
			add(txtAge);
			add(btnRegister);
		}
}


