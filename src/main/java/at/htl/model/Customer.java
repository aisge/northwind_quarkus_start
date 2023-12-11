package at.htl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "CUSTOMERS", schema = "APP", catalog = "")
public class Customer {
    @Id
    @Column(name = "CUSTOMERID", nullable = false, length = 5, columnDefinition = "CHAR(5)")
    private String customerid;
    @Basic
    @Column(name = "COMPANYNAME", nullable = false, length = 40)
    private String companyname;
    @Basic
    @Column(name = "CONTACTNAME", nullable = true, length = 30)
    private String contactname;
    @Basic
    @Column(name = "CONTACTTITLE", nullable = true, length = 30)
    private String contacttitle;
    @Basic
    @Column(name = "ADDRESS", nullable = true, length = 60)
    private String address;
    @Basic
    @Column(name = "CITY", nullable = true, length = 15)
    private String city;
    @Basic
    @Column(name = "REGION", nullable = true, length = 15)
    private String region;
    @Basic
    @Column(name = "POSTALCODE", nullable = true, length = 10)
    private String postalcode;
    @Basic
    @Column(name = "COUNTRY", nullable = true, length = 15)
    private String country;
    @Basic
    @Column(name = "PHONE", nullable = true, length = 24)
    private String phone;
    @Basic
    @Column(name = "FAX", nullable = true, length = 24)
    private String fax;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttitle() {
        return contacttitle;
    }

    public void setContacttitle(String contacttitle) {
        this.contacttitle = contacttitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerid != null ? !customerid.equals(customer.customerid) : customer.customerid != null) return false;
        if (companyname != null ? !companyname.equals(customer.companyname) : customer.companyname != null)
            return false;
        if (contactname != null ? !contactname.equals(customer.contactname) : customer.contactname != null)
            return false;
        if (contacttitle != null ? !contacttitle.equals(customer.contacttitle) : customer.contacttitle != null)
            return false;
        if (address != null ? !address.equals(customer.address) : customer.address != null) return false;
        if (city != null ? !city.equals(customer.city) : customer.city != null) return false;
        if (region != null ? !region.equals(customer.region) : customer.region != null) return false;
        if (postalcode != null ? !postalcode.equals(customer.postalcode) : customer.postalcode != null) return false;
        if (country != null ? !country.equals(customer.country) : customer.country != null) return false;
        if (phone != null ? !phone.equals(customer.phone) : customer.phone != null) return false;
        if (fax != null ? !fax.equals(customer.fax) : customer.fax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerid != null ? customerid.hashCode() : 0;
        result = 31 * result + (companyname != null ? companyname.hashCode() : 0);
        result = 31 * result + (contactname != null ? contactname.hashCode() : 0);
        result = 31 * result + (contacttitle != null ? contacttitle.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (fax != null ? fax.hashCode() : 0);
        return result;
    }
}
