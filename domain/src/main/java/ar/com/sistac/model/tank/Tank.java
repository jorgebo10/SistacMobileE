package ar.com.sistac.model.tank;


import java.util.Objects;

public final class Tank {
    private final String cit;
    private final String id;
    private Address address;
    private Layout layout;

    public Tank(String cit, String id) {
        this(cit, id, null ,null);
    }

    public Tank(String cit, String id, Address address, Layout layout) {
        this.cit = cit;
        this.id = id;
        this.address = address;
        this.layout = layout;
    }

    public String getCit() {
        return cit;
    }

    public String getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public Layout getLayout() {
        return layout;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setLayout(Layout layout) {
        this.layout = layout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tank tank = (Tank) o;
        return Objects.equals(cit, tank.cit) &&
                Objects.equals(id, tank.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cit, id);
    }

    @Override
    public String toString() {
        return "Tank{" +
                "cit='" + cit + '\'' +
                ", id='" + id + '\'' +
                ", address=" + address +
                ", layout=" + layout +
                '}';
    }
}
