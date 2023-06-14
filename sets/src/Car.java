import java.util.Objects;

public class Car implements Comparable<Car> {
    private String brand;

    public Car(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car carro = (Car) o;
        return Objects.equals(getBrand(), carro.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }
//Compare to put in order of brand name length
//    @Override
//    public int compareTo(Car o) {
//        if(this.marca.length() < o.getMarca().length()){
//            return -1;
//        }else if(this.marca.length() > o.getMarca().length()){
//            return 1;
//        }
//        return 0;
//    }

    // Compare to put in alphabetical order
    @Override
    public int compareTo(Car o) {
        return this.getBrand().compareTo(o.getBrand());
    }
}
