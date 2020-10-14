import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(new Product(499, "TwoMinus Phone", 127));
        productList.add(new Product(50, "Nike Zoom", 123));
        productList.add(new Product(399, "H&M Jeans", 124));
        productList.add(new Product(1999, "Samsung x500", 121));
        productList.add(new Product(9999, "Life Scooter 3000", 120));
        productList.add(new Product(999, "Kanon 200", 122));
        productList.add(new Product(5, "Sled Master 2000", 125));
        productList.add(new Product(500, "OneMinus Phone", 126));

        for(int i = 0; i < productList.size(); i++) {
            productList.get(i).print();
        }
    }
}
