package util;

import java.util.function.Function;

import entities.Produto;

public class ProductUpdate implements Function<Produto, String>{

	@Override
	public String apply(Produto t) {
		
		return t.getNome().toUpperCase();
	}
	


}
