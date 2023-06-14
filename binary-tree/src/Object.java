import java.util.Objects;

public class Object extends TreeObject<Object> {
    Integer content;

    public Object(Integer content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Object object = o;
        return Objects.equals(content, object.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content);
    }

    @Override
    public int compareTo(Object other) {
        int i  = 0;
        if(this.content > other.content) {
            i = 1;
        } else if(this.content < other.content) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return content.toString();
    }
}
