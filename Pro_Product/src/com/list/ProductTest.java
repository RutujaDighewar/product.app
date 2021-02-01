/**
 * 
 */
package com.list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * @author Rutuja
 *
 */
public class ProductTest {
	List colors = null;
	List products = null;

	Scanner sc = new Scanner(System.in);

	public void addColor() {
		colors = new ArrayList();
		System.out.println("Enter number of color");
		int num = sc.nextInt();
		for (int i = 0; i < num; i++) {
			Color color = new Color();
			System.out.println("Enter color id");
			color.setCid(sc.nextInt());
			System.out.println("Enter color name");
			color.setCname(sc.next());
			colors.add(color);
		}
	}

	public void displayColor() {
		if (!colors.isEmpty()) {
			for (Object obj : colors) {
				Color c = (Color) obj;
				System.out.println(c.getCid() + " " + c.getCname());
			}
		}
	}

	public void addProduct() {
		products = new ArrayList();
		System.out.println();
		System.out.println("Enter number of products");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Product product = new Product();
			System.out.println("Enter product id");
			product.setPid(sc.nextInt());
			System.out.println("Enter Product name");
			product.setPname(sc.next());
			displayColor();
			List cs = new ArrayList();
			System.out.println("How many color");
			int nn = sc.nextInt();
			for (int j = 0; j < nn; j++) {
				System.out.println("assign color id to product");
				int cid = sc.nextInt();
				for (Object o : colors) {
					Color c = (Color) o;
					if (c.getCid() == cid) {
						cs.add(c); // allocation
					}
				}
			}
			product.setColors(cs); // has-a
			products.add(product);

		}

	}

	public void displayProduct() {
		if(!products.isEmpty()) {
			for(Object ob : products) {
				Product p=(Product) ob;
				System.out.println(p.getPid()+" "+p.getPname());
				if(!p.getColors().isEmpty()) {
					for(Object o : p.getColors()) {
						Color c=(Color) o;
						System.out.println(c.getCid()+" "+c.getCname());
						
					}
				}
			}
		}
		
	}

	public static void main(String[] args) {
		ProductTest pt = new ProductTest();
		pt.addColor();
		pt.displayColor();
		pt.addProduct();
		pt.displayProduct();

	}

}
