package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
	List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		Double percAumento = 1.1;
		
		Consumer<Produto> cons = p -> p.setPreco(p.getPreco() * percAumento);
		
		// Problema: como aumentar o preço de cada produto em 10%
		
		// Com implementação explicita da Interface via criação da Classe abstrata e chamada da classe no programa principal
		// list.forEach(new MyConsumer());
		
		
		// • Reference method com método estático
		//list.forEach(Produto::staticVoidUpdate);
		
		// • Reference method com método não estático
		//list.forEach(Produto::nonStaticVoidUpdate);
		
		// • Expressão lambda declarada
		//list.forEach(cons);
		
		// • Expressão lambda inline
		
		list.forEach(p -> p.setPreco(p.getPreco() * percAumento));
		list.forEach(System.out::println); // Reference Method para a função println()
		}

	}


