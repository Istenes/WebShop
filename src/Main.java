public class Main {
    public static void main(String[] args) {
        Product sko = new Product();
        sko.setId(-123);
        sko.price = 50;
        sko.name = "Nike Zoom";

        Product jeans = new Product();
        jeans.setId(124);
        jeans.price = 399;
        jeans.name = "H&M Jeans";

        System.out.printf("%s Pris: %d (%d)%n", sko.name, sko.price, sko.getId());
        System.out.printf("%s Pris: %d (%d)%n", jeans.name, jeans.price, jeans.getId());
    }
}
