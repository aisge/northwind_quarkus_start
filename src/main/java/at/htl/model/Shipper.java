package at.htl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "SHIPPERS", schema = "APP", catalog = "")
public class Shipper {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "SHIPPERID", nullable = false)
    private Integer shipperid;
    @Basic
    @Column(name = "COMPANYNAME", nullable = false, length = 40)
    private String companyname;
    @Basic
    @Column(name = "PHONE", nullable = true, length = 24)
    private String phone;

    public Integer getShipperid() {
        return shipperid;
    }

    public void setShipperid(Integer shipperid) {
        this.shipperid = shipperid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shipper shipper = (Shipper) o;

        if (shipperid != null ? !shipperid.equals(shipper.shipperid) : shipper.shipperid != null) return false;
        if (companyname != null ? !companyname.equals(shipper.companyname) : shipper.companyname != null) return false;
        if (phone != null ? !phone.equals(shipper.phone) : shipper.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shipperid != null ? shipperid.hashCode() : 0;
        result = 31 * result + (companyname != null ? companyname.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
