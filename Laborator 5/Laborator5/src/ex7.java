import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class ex7 {
    static class Product {
        int id;
        String name;
        double price;
        public Product(int id, String name, double price) {
            this.id = id;
            this.name = name;
            this.price = price;
        }
        public String toString() {
            return "Product{id=" + id + ", name='" + name + "', price=" + price + "}";
        }
    }
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Apple", 1.5));
        products.add(new Product(2, "Banana", 1.0));
        products.add(new Product(3, "Orange", 2.0));
        Iterator<Product> itr = products.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return Double.compare(p1.price, p2.price);
            }
        });
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
