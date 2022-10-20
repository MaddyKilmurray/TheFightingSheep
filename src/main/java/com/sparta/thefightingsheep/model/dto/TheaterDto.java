package com.sparta.thefightingsheep.model.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class TheaterDto extends Dto {
    @Data
    public class Location {
        @Data
        public class Address {
            private String city;
            private String state;
            private String streetOne;
            private String zipCode;

            public Address() {}

            public Address(String city, String state, String streetOne, String zipCode) {
                this.city = city;
                this.state = state;
                this.streetOne = streetOne;
                this.zipCode = zipCode;
            }
        }

        @Data
        public class Geo {
            private List<Double> coordinates;
            private String type = "Point";

            /**
             * This is a dummy setter.
             * The {@code type} property will always be {@code "Point"}.
             * @param type a throwaway {@code type} parameter
             */
            public void setType(String type) {}

            public Geo() {}

            public Geo(List<Double> coordinates) {
                this.coordinates = coordinates;
            }
        }

        private Address address;
        private Geo geo;

        /**
         * Sets the address of the theater.
         * @param city the city the theater is in
         * @param state the state the theater is in
         * @param streetOne the street on which the theater is
         * @param zipCode the theater zip code
         */
        public void setAddress(String city, String state, String streetOne, String zipCode) {
            address = new Address(city, state, streetOne, zipCode);
        }

        /**
         * Sets the address of the theater to null.
         */
        public void setAddressNull() {
            address = null;
        }

        /**
         * Sets the geo of the theater.
         * @param coordinates the coordinates of the theater.
         */
        public void setGeo(List<Double> coordinates) {
            geo = new Geo(coordinates);
        }

        /**
         * Sets the geo of the theater to null.
         */
        public void setGeoNull() {
            address = null;
        }

        public Location() {}

        public Location(String city, String state, String streetOne, String zipCode, List<Double> coordinates) {
            setAddress(city, state, streetOne, zipCode);
            setGeo(coordinates);
        }
    }

    private Integer theaterId;
    private Location location;

    /**
     * Sets the location of the theater.
     * @param city the city the theater is in
     * @param state the state the theater is in
     * @param streetOne the street on which the theater is
     * @param zipCode the theater zip code
     * @param coordinates the coordinates of the theater.
     */
    public void setLocation(String city, String state, String streetOne, String zipCode, List<Double> coordinates) {
        location = new Location(city, state, streetOne, zipCode, coordinates);
    }

    /**
     * Sets the location of the theater to null.
     */
    public void setLocationNull() {
        location = null;
    }

    public TheaterDto() {}

    public TheaterDto(Integer theaterId, String city, String state, String streetOne, String zipCode, List<Double> coordinates) {
        this.theaterId = theaterId;
        setLocation(city, state, streetOne, zipCode, coordinates);
    }

    public TheaterDto(String id, Integer theaterId, String city, String state, String streetOne, String zipCode, List<Double> coordinates) {
        super(id);
        this.theaterId = theaterId;
        setLocation(city, state, streetOne, zipCode, coordinates);
    }
}
