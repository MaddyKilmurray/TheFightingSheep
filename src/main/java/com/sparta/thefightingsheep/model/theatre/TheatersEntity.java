package com.sparta.thefightingsheep.model.theatre;

public class TheatersEntity {
    private String id;
    private Object location;
    private Integer theaterId;
    private Object locationAddress;
    private String locationAddressCity;
    private String locationAddressState;
    private String locationAddressStreet1;
    private String locationAddressZipcode;
    private Object locationGeo;
    private Object locationGeoCoordinates;
    private String locationGeoType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getLocation() {
        return location;
    }

    public void setLocation(Object location) {
        this.location = location;
    }

    public Integer getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(Integer theaterId) {
        this.theaterId = theaterId;
    }

    public Object getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(Object locationAddress) {
        this.locationAddress = locationAddress;
    }

    public String getLocationAddressCity() {
        return locationAddressCity;
    }

    public void setLocationAddressCity(String locationAddressCity) {
        this.locationAddressCity = locationAddressCity;
    }

    public String getLocationAddressState() {
        return locationAddressState;
    }

    public void setLocationAddressState(String locationAddressState) {
        this.locationAddressState = locationAddressState;
    }

    public String getLocationAddressStreet1() {
        return locationAddressStreet1;
    }

    public void setLocationAddressStreet1(String locationAddressStreet1) {
        this.locationAddressStreet1 = locationAddressStreet1;
    }

    public String getLocationAddressZipcode() {
        return locationAddressZipcode;
    }

    public void setLocationAddressZipcode(String locationAddressZipcode) {
        this.locationAddressZipcode = locationAddressZipcode;
    }

    public Object getLocationGeo() {
        return locationGeo;
    }

    public void setLocationGeo(Object locationGeo) {
        this.locationGeo = locationGeo;
    }

    public Object getLocationGeoCoordinates() {
        return locationGeoCoordinates;
    }

    public void setLocationGeoCoordinates(Object locationGeoCoordinates) {
        this.locationGeoCoordinates = locationGeoCoordinates;
    }

    public String getLocationGeoType() {
        return locationGeoType;
    }

    public void setLocationGeoType(String locationGeoType) {
        this.locationGeoType = locationGeoType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TheatersEntity that = (TheatersEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (theaterId != null ? !theaterId.equals(that.theaterId) : that.theaterId != null) return false;
        if (locationAddress != null ? !locationAddress.equals(that.locationAddress) : that.locationAddress != null)
            return false;
        if (locationAddressCity != null ? !locationAddressCity.equals(that.locationAddressCity) : that.locationAddressCity != null)
            return false;
        if (locationAddressState != null ? !locationAddressState.equals(that.locationAddressState) : that.locationAddressState != null)
            return false;
        if (locationAddressStreet1 != null ? !locationAddressStreet1.equals(that.locationAddressStreet1) : that.locationAddressStreet1 != null)
            return false;
        if (locationAddressZipcode != null ? !locationAddressZipcode.equals(that.locationAddressZipcode) : that.locationAddressZipcode != null)
            return false;
        if (locationGeo != null ? !locationGeo.equals(that.locationGeo) : that.locationGeo != null) return false;
        if (locationGeoCoordinates != null ? !locationGeoCoordinates.equals(that.locationGeoCoordinates) : that.locationGeoCoordinates != null)
            return false;
        if (locationGeoType != null ? !locationGeoType.equals(that.locationGeoType) : that.locationGeoType != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (theaterId != null ? theaterId.hashCode() : 0);
        result = 31 * result + (locationAddress != null ? locationAddress.hashCode() : 0);
        result = 31 * result + (locationAddressCity != null ? locationAddressCity.hashCode() : 0);
        result = 31 * result + (locationAddressState != null ? locationAddressState.hashCode() : 0);
        result = 31 * result + (locationAddressStreet1 != null ? locationAddressStreet1.hashCode() : 0);
        result = 31 * result + (locationAddressZipcode != null ? locationAddressZipcode.hashCode() : 0);
        result = 31 * result + (locationGeo != null ? locationGeo.hashCode() : 0);
        result = 31 * result + (locationGeoCoordinates != null ? locationGeoCoordinates.hashCode() : 0);
        result = 31 * result + (locationGeoType != null ? locationGeoType.hashCode() : 0);
        return result;
    }
}
