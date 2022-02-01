package olaMundo;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Janela extends JFrame implements ActionListener {

	JButton botao = new JButton("Clique em mim!");
	Color cor = new Color(255, 0, 89);
	Font f = new Font("SansSerif", Font.BOLD, 20);

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botao) {
			JLabel lable = new JLabel("Olá Mundo!!");
			JButton home = new JButton("Voltar");
			home.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					botao.setVisible(true);
					home.setVisible(false);
					lable.setVisible(false);

				}
			});
			add(home);
			add(lable);
			botao.setVisible(false);
			lable.setBounds(350, 50, 200, 30);
			lable.setVisible(true);
			lable.setFont(f);
			home.setBounds(305, 115, 200, 60);
			home.setVisible(true);
			home.addActionListener(this);
			home.setBackground(cor);

		}
	}

	public Janela() {
		botao.setBounds(305, 115, 200, 60);
		botao.setVisible(true);
		botao.addActionListener(this);
		botao.setBackground(cor);
		add(botao);

		setSize(810, 400);
		setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Janela();
	}

}
