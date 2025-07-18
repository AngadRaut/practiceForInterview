package org.example.immutableEx;

public final class Address {
        private String street;
        private String city;

        public Address(String street, String city) {
            this.street = street;
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public String getCity() {
            return city;
        }

        @Override
        public String toString() {
            return "{Street: " + street + ", City: " + city + "}";
        }
    }

