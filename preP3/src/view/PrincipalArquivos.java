package view;

import java.io.IOException;

import javax.swing.JOptionPane;

import controller.ArquivoController;

public class PrincipalArquivos {
	
	public static void main(String[] args) {
		
		ArquivoController operacao = new ArquivoController();
		
		String symbol;
		String caminho = "C:\\TEMP";
		String nome = "bct.json";
		
		symbol = JOptionPane.showInputDialog("Digite um simbolo");
		
		try {
			operacao.readFile(caminho, nome, symbol );
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}
	
	
}