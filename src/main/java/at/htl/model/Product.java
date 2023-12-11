package at.htl.model;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "PRODUCTS", schema = "APP", catalog = "")
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PRODUCTID", nullable = false)
    private Integer productid;
    @Basic
    @Column(name = "PRODUCTNAME", nullable = false, length = 40)
    private String productname;
    @Basic
    @Column(name = "QUANTITYPERUNIT", nullable = true, length = 20)
    private String quantityperunit;
    @Basic
    @Column(name = "UNITPRICE", nullable = true, precision=9, scale=4)
    private BigDecimal unitprice;
    @Basic
    @Column(name = "UNITSINSTOCK", nullable = true)
    private Integer unitsinstock;
    @Basic
    @Column(name = "UNITSONORDER", nullable = true)
    private Integer unitsonorder;
    @Basic
    @Column(name = "REORDERLEVEL", nullable = true)
    private Integer reorderlevel;
    @Basic
    @Column(name = "DISCONTINUED", nullable = false)
    private Integer discontinued;
    @ManyToOne
    @JoinColumn(name = "SUPPLIERID", referencedColumnName = "SUPPLIERID")
    private Supplier suppliersBySupplierid;
    @ManyToOne
    @JoinColumn(name = "CATEGORYID", referencedColumnName = "CATEGORYID")
    private Category categoriesByCategoryid;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(String quantityperunit) {
        this.quantityperunit = quantityperunit;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Integer getUnitsinstock() {
        return unitsinstock;
    }

    public void setUnitsinstock(Integer unitsinstock) {
        this.unitsinstock = unitsinstock;
    }

    public Integer getUnitsonorder() {
        return unitsonorder;
    }

    public void setUnitsonorder(Integer unitsonorder) {
        this.unitsonorder = unitsonorder;
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public Integer getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(Integer discontinued) {
        this.discontinued = discontinued;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productid != null ? !productid.equals(product.productid) : product.productid != null) return false;
        if (productname != null ? !productname.equals(product.productname) : product.productname != null) return false;
        if (quantityperunit != null ? !quantityperunit.equals(product.quantityperunit) : product.quantityperunit != null)
            return false;
        if (unitprice != null ? !unitprice.equals(product.unitprice) : product.unitprice != null) return false;
        if (unitsinstock != null ? !unitsinstock.equals(product.unitsinstock) : product.unitsinstock != null)
            return false;
        if (unitsonorder != null ? !unitsonorder.equals(product.unitsonorder) : product.unitsonorder != null)
            return false;
        if (reorderlevel != null ? !reorderlevel.equals(product.reorderlevel) : product.reorderlevel != null)
            return false;
        if (discontinued != null ? !discontinued.equals(product.discontinued) : product.discontinued != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productid != null ? productid.hashCode() : 0;
        result = 31 * result + (productname != null ? productname.hashCode() : 0);
        result = 31 * result + (quantityperunit != null ? quantityperunit.hashCode() : 0);
        result = 31 * result + (unitprice != null ? unitprice.hashCode() : 0);
        result = 31 * result + (unitsinstock != null ? unitsinstock.hashCode() : 0);
        result = 31 * result + (unitsonorder != null ? unitsonorder.hashCode() : 0);
        result = 31 * result + (reorderlevel != null ? reorderlevel.hashCode() : 0);
        result = 31 * result + (discontinued != null ? discontinued.hashCode() : 0);
        return result;
    }

    public Supplier getSuppliersBySupplierid() {
        return suppliersBySupplierid;
    }

    public void setSuppliersBySupplierid(Supplier suppliersBySupplierid) {
        this.suppliersBySupplierid = suppliersBySupplierid;
    }

    public Category getCategoriesByCategoryid() {
        return categoriesByCategoryid;
    }

    public void setCategoriesByCategoryid(Category categoriesByCategoryid) {
        this.categoriesByCategoryid = categoriesByCategoryid;
    }
}
