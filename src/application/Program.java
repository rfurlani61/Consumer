package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Produto;


public class Program {

	public static void main(String[] args) {
	List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		Function<Produto, String> func = p -> p.getNome().toUpperCase();
		
		// Problema: Fazer um programa que a partir de uma lista de produtos, gere uma nova lista com os nomes de produtos em caixa alta.
		
		// Com implementação explicita da Interface via criação da Classe abstrata e chamada da classe no programa principal
		//List<String> names = list.stream().map(new ProductUpdate()).collect(Collectors.toList());
		
		// • Reference method com método estático
		//List<String> names = list.stream().map(Produto::staticUpperCaseNome).collect(Collectors.toList());
		
		// • Reference method com método não estático
		//List<String> names = list.stream().map(Produto::nonstaticUpperCaseNome).collect(Collectors.toList());
		
		// • Expressão lambda declarada
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		// • Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());
		
		names.forEach(System.out::println); // Reference Method para a função println()
		
		/*
		 * Para imprimir neste caso
		Nota sobre a função map
		• A função "map" (não confunda com a estrutura de dados Map) é uma
		função que aplica uma função a todos elementos de uma stream.
		• Conversões:
		• List para stream: .stream()
		• Stream para List: .collect(Collectors.toList())
		*/
		}

	}


