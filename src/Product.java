public class Product {
    public final int NAME_MAX_LENGTH = 55;

    private int price;
    private String name;
    private int id;

    public Product(int price, String name, int id) {
        this.price = price;
        setName(name);
        setId(id);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= NAME_MAX_LENGTH) {
            name = name.substring(0, NAME_MAX_LENGTH);
        }

        this.name = name;
    }

    private void setId(int newId) {
        // The database of products must have an ID that is positive
        if(newId > 0) {
            id = newId;
        }
    }

    public int getId() {
        return id;
    }
}
