import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Product {
	
	public String name;
	public BigDecimal price;
	public Tax tax;
	
	Product(String name, BigDecimal price, Tax tax){
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	
	public static void main (String[]args) {
		List<Product> shopping = List.of(
                new Product("Clothes", new BigDecimal("15.90"), Tax.NORMAL),
                new Product("Bread", new BigDecimal("1.5"), Tax.SUPERREDUCED),
                new Product("Meat", new BigDecimal("13.99"), Tax.REDUCED),
                new Product("Cheese", new BigDecimal("3.59"), Tax.SUPERREDUCED),
                new Product("Coke", new BigDecimal("1.89"), Tax.REDUCED),
                new Product("Whiskey", new BigDecimal("19.90"), Tax.NORMAL));
	
		//66.08
		System.out.println(calcularPrecioFinal(shopping));
		//3 C
		System.out.println(filtrarPorC(shopping));
	}
	
	public static String filtrarPorC (List<Product>shopping) {
		
		//String lista = shopping.stream().filter(x -> x.name.startsWith("C")).sorted().toString();
		
		//String lista = shopping.stream().filter(x -> x.name.startsWith("C")).sorted().map.collect;
		
		//LOS DOS DE ARRIBA SON MIS INTENTOS, QUE NO SE POR QUÉ NO ME FUNCIONABA EL SEGUNDO.
		
		/*
		String lista = shopping.stream()
	            .filter(x -> x.name.startsWith("C"))
	            .map
	            .collect;
		*/
		
		 String lista = shopping.stream()
	                .filter(x -> x.name.startsWith("C"))
	                .sorted((x,y) -> x.name.compareToIgnoreCase(y.name))
	                .map(x-> x.name)
	                .collect(Collectors.joining(","));
		 
		return lista;
	}
	
	public static double calcularPrecioFinal(List<Product>shopping) {
		//BigDecimal precioFinal = shopping.stream().map(x -> x.price).reduce(BigDecimal.ZERO, BigDecimal::add);
		//precioFinal = shopping.stream().map(x -> x.tax.getPercent()).;
		
		double precioFinal = shopping.stream().mapToDouble(x -> x.price.doubleValue()+(x.tax.percent*x.price.doubleValue()/100))
				.sum();
		
		return precioFinal;
	}

}

enum Tax {
    SUPERREDUCED(4), REDUCED(10), NORMAL(21);
    
    public int percent;
    
    private Tax(int percent) {
        this.percent = percent;
    }

   public int getPercent() {
        return percent;
    }
}
