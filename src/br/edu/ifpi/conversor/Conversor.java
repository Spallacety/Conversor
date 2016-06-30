package br.edu.ifpi.conversor;

import java.util.HashMap;
import java.util.Map;

public class Conversor {

	public long converter(String valor){
		
		int resultado = 0;
		int ultimo = 0;
		
		for (int i = valor.length() - 1; i >=0; i--){
			char letra = valor.charAt(i);
			if(valorDe(letra) < ultimo){
				resultado -= valorDe(letra);
			}
			else{
				resultado += valorDe(letra);
			}
			ultimo = valorDe(letra);
		}
		return resultado;
	}
	
	public int valorDe(char c){
		Map<Character, Integer> tabela = new HashMap<>();

		tabela.put('I', 1);
		tabela.put('V', 5);
		tabela.put('X', 10);
		tabela.put('L', 50);
		tabela.put('C', 100);
		tabela.put('D', 500);
		tabela.put('M', 1000);
		
		if (!tabela.containsKey(c)) throw new IllegalArgumentException("Valor inválido.");
		
		return tabela.get(c);
	}
}
