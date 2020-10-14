public class Main {
    public static void main(String[] args) {
        Product sko = new Product(50, "Nike Zoomaslkd fjalsdfjslödafjsdljf aasdlkfj aldskjf slkadj flksadfj sldkj fl dskjflksadj f", 123);
        Product jeans = new Product(399, "H&M Jeans", 124);

        System.out.printf("%s Pris: %d (%d)%n", sko.getName(), sko.getPrice(), sko.getId());
        System.out.printf("%s Pris: %d (%d)%n", jeans.getName(), jeans.getPrice(), jeans.getId());
    }
}
