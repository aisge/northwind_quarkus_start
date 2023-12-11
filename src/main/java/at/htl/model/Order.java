package at.htl.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "ORDERS", schema = "APP")
public class Order {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ORDERID", nullable = false)
    private Integer orderid;
    @Basic
    @Column(name = "ORDERDATE", nullable = true)
    private LocalDate orderdate;
    @Basic
    @Column(name = "REQUIREDDATE", nullable = true)
    private LocalDate requireddate;
    @Basic
    @Column(name = "SHIPPEDDATE", nullable = true)
    private LocalDate shippeddate;
    @Basic
    @Column(name = "FREIGHT", nullable = true)
    private Integer freight;
    @Basic
    @Column(name = "SHIPNAME", nullable = true, length = 40)
    private String shipname;
    @Basic
    @Column(name = "SHIPADDRESS", nullable = true, length = 60)
    private String shipaddress;
    @Basic
    @Column(name = "SHIPCITY", nullable = true, length = 15)
    private String shipcity;
    @Basic
    @Column(name = "SHIPREGION", nullable = true, length = 15)
    private String shipregion;
    @Basic
    @Column(name = "SHIPPOSTALCODE", nullable = true, length = 10)
    private String shippostalcode;
    @Basic
    @Column(name = "SHIPCOUNTRY", nullable = true, length = 15)
    private String shipcountry;
    @ManyToOne
    @JoinColumn(name = "CUSTOMERID", referencedColumnName = "CUSTOMERID")
    private Customer customersByCustomerid;
    @ManyToOne
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID")
    private Employee employeesByEmployeeid;
    @ManyToOne
    @JoinColumn(name = "TERRITORYID", referencedColumnName = "TERRITORYID")
    private Territory territoriesByTerritoryid;
    @ManyToOne
    @JoinColumn(name = "SHIPVIA", referencedColumnName = "SHIPPERID")
    private Shipper shippersByShipvia;

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }




    public LocalDate getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(LocalDate orderdate) {
        this.orderdate = orderdate;
    }

    public LocalDate getRequireddate() {
        return requireddate;
    }

    public void setRequireddate(LocalDate requireddate) {
        this.requireddate = requireddate;
    }

    public LocalDate getShippeddate() {
        return shippeddate;
    }

    public void setShippeddate(LocalDate shippeddate) {
        this.shippeddate = shippeddate;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress;
    }

    public String getShipcity() {
        return shipcity;
    }

    public void setShipcity(String shipcity) {
        this.shipcity = shipcity;
    }

    public String getShipregion() {
        return shipregion;
    }

    public void setShipregion(String shipregion) {
        this.shipregion = shipregion;
    }

    public String getShippostalcode() {
        return shippostalcode;
    }

    public void setShippostalcode(String shippostalcode) {
        this.shippostalcode = shippostalcode;
    }

    public String getShipcountry() {
        return shipcountry;
    }

    public void setShipcountry(String shipcountry) {
        this.shipcountry = shipcountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderid != null ? !orderid.equals(order.orderid) : order.orderid != null) return false;
        if (orderdate != null ? !orderdate.equals(order.orderdate) : order.orderdate != null) return false;
        if (requireddate != null ? !requireddate.equals(order.requireddate) : order.requireddate != null) return false;
        if (shippeddate != null ? !shippeddate.equals(order.shippeddate) : order.shippeddate != null) return false;
        if (freight != null ? !freight.equals(order.freight) : order.freight != null) return false;
        if (shipname != null ? !shipname.equals(order.shipname) : order.shipname != null) return false;
        if (shipaddress != null ? !shipaddress.equals(order.shipaddress) : order.shipaddress != null) return false;
        if (shipcity != null ? !shipcity.equals(order.shipcity) : order.shipcity != null) return false;
        if (shipregion != null ? !shipregion.equals(order.shipregion) : order.shipregion != null) return false;
        if (shippostalcode != null ? !shippostalcode.equals(order.shippostalcode) : order.shippostalcode != null)
            return false;
        if (shipcountry != null ? !shipcountry.equals(order.shipcountry) : order.shipcountry != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (orderdate != null ? orderdate.hashCode() : 0);
        result = 31 * result + (requireddate != null ? requireddate.hashCode() : 0);
        result = 31 * result + (shippeddate != null ? shippeddate.hashCode() : 0);
        result = 31 * result + (freight != null ? freight.hashCode() : 0);
        result = 31 * result + (shipname != null ? shipname.hashCode() : 0);
        result = 31 * result + (shipaddress != null ? shipaddress.hashCode() : 0);
        result = 31 * result + (shipcity != null ? shipcity.hashCode() : 0);
        result = 31 * result + (shipregion != null ? shipregion.hashCode() : 0);
        result = 31 * result + (shippostalcode != null ? shippostalcode.hashCode() : 0);
        result = 31 * result + (shipcountry != null ? shipcountry.hashCode() : 0);
        return result;
    }

    public Customer getCustomersByCustomerid() {
        return customersByCustomerid;
    }

    public void setCustomersByCustomerid(Customer customersByCustomerid) {
        this.customersByCustomerid = customersByCustomerid;
    }

    public Employee getEmployeesByEmployeeid() {
        return employeesByEmployeeid;
    }

    public void setEmployeesByEmployeeid(Employee employeesByEmployeeid) {
        this.employeesByEmployeeid = employeesByEmployeeid;
    }

    public Territory getTerritoriesByTerritoryid() {
        return territoriesByTerritoryid;
    }

    public void setTerritoriesByTerritoryid(Territory territoriesByTerritoryid) {
        this.territoriesByTerritoryid = territoriesByTerritoryid;
    }

    public Shipper getShippersByShipvia() {
        return shippersByShipvia;
    }

    public void setShippersByShipvia(Shipper shippersByShipvia) {
        this.shippersByShipvia = shippersByShipvia;
    }
}
