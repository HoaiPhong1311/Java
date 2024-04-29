
public class Customer {
    private String id, name;
    private int dis;

    public Customer(String id, String name, int dis) {
        this.id = id;
        this.name = name;
        this.dis = dis;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }
}
