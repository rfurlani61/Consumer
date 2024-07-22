package util;

import java.util.function.Consumer;

import entities.Produto;

public class MyConsumer implements Consumer<Produto>{

	@Override
	public void accept(Produto t) {
		t.setPreco(t.getPreco() * 1.1);
	}
}
