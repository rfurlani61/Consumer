package entities;

import java.util.List;
import java.util.function.Predicate;

public class ServiceProduto {
	public Double filteredSum(List<Produto> list, Predicate<Produto> criterio) {
		Double sum = 0.0;
		for (Produto p : list) {
			if (criterio.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
	}
}
