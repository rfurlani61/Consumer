package application;

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import entities.ServiceProduto;


public class Program {

	public static void main(String[] args) {
	List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		ServiceProduto sp = new ServiceProduto();
		Double sum = sp.filteredSum(list);
		
		System.out.println("Sum: " + String.format("%.2f", sum));
		// Problema: Fazer um programa que a partir de uma lista de produtos, clcule a soma dos preços somente dos produtos cujo nome começa com T.
		
		}

	}


