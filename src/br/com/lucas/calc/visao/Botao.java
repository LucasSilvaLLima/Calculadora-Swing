package br.com.lucas.calc.visao;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	
	public Botao(String texto, Color cor) {
		setText(texto);
		setFont(new Font("calculator", Font.PLAIN, 40));
		setOpaque(true);
		setBackground(cor);
		setForeground(Color.WHITE);
		setBorder(BorderFactory.createLineBorder(Color.WHITE));
	}
}
