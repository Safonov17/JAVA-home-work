/**
 * Notebook
 */
public class Notebook {

    int id;
    String BrandName;
    int price;
    int ram;
    int mem;
    String os;
    String color;

    @Override
    public String toString() {
        return String.format("id: %s, bn: %s, price: %d, ram: %d, mem: %d, os: %s, color: %s", id, BrandName, price, ram, mem, os, color);
    }

    @Override
    public boolean equals(Object obj) {
        Notebook t = (Notebook) obj;
        return id ==t.id && BrandName == t.BrandName;
    }

    @Override
    public int hashCode() {
        return id;
    }
}