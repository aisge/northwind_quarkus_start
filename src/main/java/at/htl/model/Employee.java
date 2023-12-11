package at.htl.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Arrays;

@Entity
@Table(name = "EMPLOYEES", schema = "APP", catalog = "")
public class Employee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EMPLOYEEID", nullable = false)
    private Integer employeeid;
    @Basic
    @Column(name = "LASTNAME", nullable = false, length = 20)
    private String lastname;
    @Basic
    @Column(name = "FIRSTNAME", nullable = false, length = 10)
    private String firstname;
    @Basic
    @Column(name = "TITLE", nullable = true, length = 30)
    private String title;
    @Basic
    @Column(name = "TITLEOFCOURTESY", nullable = true, length = 25)
    private String titleofcourtesy;
    @Basic
    @Column(name = "BIRTHDATE", nullable = true)
    private LocalDate birthdate;
    @Basic
    @Column(name = "HIREDATE", nullable = true)
    private LocalDate hiredate;
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
    @Column(name = "HOMEPHONE", nullable = true, length = 24)
    private String homephone;
    @Basic
    @Column(name = "EXTENSION", nullable = true, length = 4)
    private String extension;
    @Lob
    @Column(name = "PHOTO", nullable = true)
    private byte[] photo;
    @Basic
    @Column(name = "NOTES", nullable = true, length = 600)
    private String notes;
    @Basic
    @Column(name = "PHOTOPATH", nullable = true, length = 255)
    private String photopath;
    @ManyToOne
    @JoinColumn(name = "REPORTSTO", referencedColumnName = "EMPLOYEEID")
    private Employee employeesByReportsto;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleofcourtesy() {
        return titleofcourtesy;
    }

    public void setTitleofcourtesy(String titleofcourtesy) {
        this.titleofcourtesy = titleofcourtesy;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public LocalDate getHiredate() {
        return hiredate;
    }

    public void setHiredate(LocalDate hiredate) {
        this.hiredate = hiredate;
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

    public String getHomephone() {
        return homephone;
    }

    public void setHomephone(String homephone) {
        this.homephone = homephone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPhotopath() {
        return photopath;
    }

    public void setPhotopath(String photopath) {
        this.photopath = photopath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (employeeid != null ? !employeeid.equals(employee.employeeid) : employee.employeeid != null) return false;
        if (lastname != null ? !lastname.equals(employee.lastname) : employee.lastname != null) return false;
        if (firstname != null ? !firstname.equals(employee.firstname) : employee.firstname != null) return false;
        if (title != null ? !title.equals(employee.title) : employee.title != null) return false;
        if (titleofcourtesy != null ? !titleofcourtesy.equals(employee.titleofcourtesy) : employee.titleofcourtesy != null)
            return false;
        if (birthdate != null ? !birthdate.equals(employee.birthdate) : employee.birthdate != null) return false;
        if (hiredate != null ? !hiredate.equals(employee.hiredate) : employee.hiredate != null) return false;
        if (address != null ? !address.equals(employee.address) : employee.address != null) return false;
        if (city != null ? !city.equals(employee.city) : employee.city != null) return false;
        if (region != null ? !region.equals(employee.region) : employee.region != null) return false;
        if (postalcode != null ? !postalcode.equals(employee.postalcode) : employee.postalcode != null) return false;
        if (country != null ? !country.equals(employee.country) : employee.country != null) return false;
        if (homephone != null ? !homephone.equals(employee.homephone) : employee.homephone != null) return false;
        if (extension != null ? !extension.equals(employee.extension) : employee.extension != null) return false;
        if (!Arrays.equals(photo, employee.photo)) return false;
        if (notes != null ? !notes.equals(employee.notes) : employee.notes != null) return false;
        if (photopath != null ? !photopath.equals(employee.photopath) : employee.photopath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = employeeid != null ? employeeid.hashCode() : 0;
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (titleofcourtesy != null ? titleofcourtesy.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (hiredate != null ? hiredate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (postalcode != null ? postalcode.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (homephone != null ? homephone.hashCode() : 0);
        result = 31 * result + (extension != null ? extension.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(photo);
        result = 31 * result + (notes != null ? notes.hashCode() : 0);
        result = 31 * result + (photopath != null ? photopath.hashCode() : 0);
        return result;
    }

    public Employee getEmployeesByReportsto() {
        return employeesByReportsto;
    }

    public void setEmployeesByReportsto(Employee employeesByReportsto) {
        this.employeesByReportsto = employeesByReportsto;
    }
}
