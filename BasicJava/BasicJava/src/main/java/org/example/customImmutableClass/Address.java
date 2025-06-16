package org.example.customImmutableClass;

public class Address implements Cloneable{
    private  String street;
    private  String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setStreet(String street){
        this.street =street;
    }
}
