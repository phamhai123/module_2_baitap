package ss12_java_collection_framework.bai_tap;

public class Product {
    private int id = 1;
    private String name = "Sam Sung";
    private double core = 1.0;

    public Product() {

    }

    public Product(int id, String name, double core) {
        super();
        this.id = id;
        this.name = name;
        this.core = core;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCore() {
        return core;
    }

    public void setCore(double core) {
        this.core = core;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", core=" + core +
                '}';
    }
}
