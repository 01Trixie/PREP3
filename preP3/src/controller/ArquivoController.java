package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivoController {

	public ArquivoController() {
		super();
	}

	public void readFile(String caminho, String nome, String symbol) throws IOException {

		File arq = new File(caminho, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);

			InputStreamReader leitor = new InputStreamReader(fluxo);

			BufferedReader buffer = new BufferedReader(leitor);

			String linha = buffer.readLine();

			while (linha != null) {

				String[] vetLinha = linha.split(symbol);
				for (int i = 0; i < vetLinha.length; i++) {
					if (vetLinha[i].contains("lastPrice")) {
						System.out.println(vetLinha[i]);
					}
//					if(linha.contains("]")) {
//						break;
//					}
					linha = buffer.readLine();
				}
			}

			fluxo.close();
			leitor.close();
			buffer.close();

		} else {
			throw new IOException("Arquivo inválido.");
		}

	}

}