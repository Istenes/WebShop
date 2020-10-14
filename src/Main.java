public class Main {
    public static void main(String[] args) {
        Product sko = new Product();
        sko.setId(-123);
        sko.setPrice(50);
        sko.setName("Nike Zoom");

        Product jeans = new Product();
        jeans.setId(124);
        jeans.setPrice(399);
        jeans.setName("H&M Jeansaskldfsdfasdfsdafsdafsdfsdaffjslakdfaklsdjfasdfsadfasdfasdfsdafadsfksdfsdafsdfsdfsdfsdaflsadjfksdlfsdfsadfasdfsadfjaslkdjfklsdjf");

        System.out.printf("%s Pris: %d (%d)%n", sko.getName(), sko.getPrice(), sko.getId());
        System.out.printf("%s Pris: %d (%d)%n", jeans.getName(), jeans.getPrice(), jeans.getId());
    }
}
