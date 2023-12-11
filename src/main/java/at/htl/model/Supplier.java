package at.htl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "SUPPLIERS", schema = "APP", catalog = "")
public class Supplier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SUPPLIERID", nullable = false)
    private Integer supplierid;
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
    @Basic
    @Column(name = "HOMEPAGE", nullable = true, length = 200)
    private String homepage;

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
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

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Supplier supplier = (Supplier) o;

        if (supplierid != null ? !supplierid.equals(supplier.supplierid) : supplier.supplierid != null) return false;
        if (companyname != null ? !companyname.equals(supplier.companyname) : supplier.companyname != null)
            return false;
        if (contactname != null ? !contactname.equals(supplier.contactname) : supplier.contactname != null)
            return false;
        if (contacttitle != null ? !contacttitle.equals(supplier.contacttitle) : supplier.contacttitle != null)
            return false;
        if (address != null ? !address.equals(supplier.address) : supplier.address != null) return false;
        if (city != null ? !city.equals(supplier.city) : supplier.city != null) return false;
        if (region != null ? !region.equals(supplier.region) : supplier.region != null) return false;
        if (postalcode != null ? !postalcode.equals(supplier.postalcode) : supplier.postalcode != null) return false;
        if (country != null ? !country.equals(supplier.country) : supplier.country != null) return false;
        if (phone != null ? !phone.equals(supplier.phone) : supplier.phone != null) return false;
        if (fax != null ? !fax.equals(supplier.fax) : supplier.fax != null) return false;
        if (homepage != null ? !homepage.equals(supplier.homepage) : supplier.homepage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = supplierid != null ? supplierid.hashCode() : 0;
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
        result = 31 * result + (homepage != null ? homepage.hashCode() : 0);
        return result;
    }
}
