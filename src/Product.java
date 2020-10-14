public class Product {
    String name;
    private int id;
    int price;

    public void setId(int newId) {
        // The database of products must have an ID that is positive
        if(newId > 0) {
            id = newId;
        }
    }

    public int getId() {
        return id;
    }
}
