package Challenge37.graphDataStructure;
import java.util.Objects;

public class Vertex <T>{

    T value;
    int weight = 0;
    public Vertex() {
    }

    public Vertex(T value) {
        this.value = value;
    }

    public Vertex(T value, int weight) {
        this.value = value;
        this.weight = weight;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex<?> vertex = (Vertex<?>) o;
        return Objects.equals(value, vertex.value);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "value=" + value +
                ", weight=" + weight +
                '}';
    }
}
