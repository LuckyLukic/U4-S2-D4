package Esercizio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Esercizio {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Customer luca = new Customer(random.nextLong(100), "Luca", 1 );
		
		
		List<Product> myProducts = new ArrayList<>();
		
		myProducts.add(new Product (random.nextLong(100), "Pippo", "Books", 34.40));
		myProducts.add(new Product (random.nextLong(100), "Pluto", "Toys", 12.35));
		myProducts.add(new Product (random.nextLong(100), "Paperino", "Books", 121.90));
		myProducts.add(new Product (random.nextLong(100), "Ciccio", "Books", 130.30));
		myProducts.add(new Product (random.nextLong(100), "Patagarroso", "Computers", 1124.45));
		myProducts.add(new Product (random.nextLong(100), "Baby1", "Baby", 38.45));
		myProducts.add(new Product (random.nextLong(100), "Baby2", "Baby", 47.99));
		myProducts.add(new Product (random.nextLong(100), "Baby3", "Baby", 119.13));
		myProducts.add(new Product (random.nextLong(100), "Boys1", "Boys", 103.75));
		myProducts.add(new Product (random.nextLong(100), "Boys2", "Boys", 87.40));
		myProducts.add(new Product (random.nextLong(100), "Boys3", "Boys", 65.50));
		myProducts.add(new Product (random.nextLong(100), "Boys4", "Boys", 99.99));

		
		
		List<Product> prodottiBaby = myProducts.stream().filter(x -> x.getCategory().equals("Baby")).collect(Collectors.toList());
		
		List<Order> myOrders = new ArrayList<>();
		
	    myOrders.add(new Order(random.nextLong(100), "inevaso", LocalDate.now(), LocalDate.now().plusDays(4), prodottiBaby, luca));
	    myOrders.add(new Order(random.nextLong(100), "evaso", LocalDate.now().minusDays(10), LocalDate.now().minusDays(5), prodottiBaby, luca));
	    myOrders.add(new Order(random.nextLong(100), "inevaso", LocalDate.now().minusDays(2), LocalDate.now().plusDays(2), prodottiBaby, luca));
		
		
		List<Product> librimaggiore100 = myProducts.stream().filter( x -> x.getCategory().equals("Books") && x.getPrice() > 100)
				.collect(Collectors.toList());
		
		List<Product> prodottiBoys = myProducts.stream().filter(x -> x.getCategory().equals("Boys")).map(x -> {
			double sconto = x.getPrice()*0.90;
			x.setPrice(sconto);
			return x;
			}).collect(Collectors.toList());
		
		
		for (Product product: librimaggiore100) {
			System.out.println(product.toString());
			
		}
		
		
		for (Order orders: myOrders) {
			System.out.println(orders.toString());
			
		}
		
		for (Product product: prodottiBoys) {
			System.out.println(product.toString());
			
		}
		
		
	}

}
