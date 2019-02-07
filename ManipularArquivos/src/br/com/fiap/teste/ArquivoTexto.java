package br.com.fiap.teste;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class ArquivoTexto {
	public static void main(String [] args) throws Exception{
		FileWriter arquivo = new FileWriter("d:\\teste.txt");
		PrintWriter dados = new PrintWriter(arquivo);
		
		dados.println(JOptionPane.showInputDialog("Nome do cargo: "));
		dados.println(JOptionPane.showInputDialog("Nivel do cargo: "));
		dados.println(JOptionPane.showInputDialog("Salario do cargo: "));
		dados.close();
		
		FileReader arq = new FileReader("d:\\teste.txt");
		BufferedReader str = new BufferedReader(arq);
		String x = "";
		while(str.ready())
			x+=str.readLine();
		
		System.out.println(x.toUpperCase());
	}
}
