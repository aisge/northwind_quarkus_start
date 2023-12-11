package at.htl.model;


import jakarta.persistence.*;

import java.util.Arrays;

@Entity
@Table(name = "CATEGORIES", schema = "APP", catalog = "")
public class Category {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CATEGORYID", nullable = false)
    private Integer categoryid;
    @Basic
    @Column(name = "CATEGORYNAME", nullable = false, length = 15)
    private String categoryname;
    @Basic
    @Column(name = "DESCRIPTION", nullable = true, length = 300)
    private String description;
    @Lob
    @Column(name = "PICTURE", nullable = true)
    private byte[] picture;

    public Integer getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Integer categoryid) {
        this.categoryid = categoryid;
    }

    public String getCategoryname() {
        return categoryname;
    }

    public void setCategoryname(String categoryname) {
        this.categoryname = categoryname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryid != null ? !categoryid.equals(category.categoryid) : category.categoryid != null) return false;
        if (categoryname != null ? !categoryname.equals(category.categoryname) : category.categoryname != null)
            return false;
        if (description != null ? !description.equals(category.description) : category.description != null)
            return false;
        if (!Arrays.equals(picture, category.picture)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryid != null ? categoryid.hashCode() : 0;
        result = 31 * result + (categoryname != null ? categoryname.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
