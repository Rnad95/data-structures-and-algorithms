package Challenge12.AnimalShleter;

public class Animal {
    protected String type;
    private String desc;
    private String arrivedDate;

    public Animal() {

    }
    public Animal(String type, String desc, String arrivedDate) {
        this.type = type;
        this.desc = desc;
        this.arrivedDate = arrivedDate;
    }

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }

    public String getArrivedDate() {
        return arrivedDate;
    }

    @Override
    public String toString() {
        return
                "type='" + type + '\'' +
                ", desc='" + desc + '\'' +
                ", arrivedDate='" + arrivedDate + '\'' +
                "}"
                ;
    }
}
