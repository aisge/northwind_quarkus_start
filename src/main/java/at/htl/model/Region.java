package at.htl.model;


import jakarta.persistence.*;

@Entity
public class Region {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "REGIONID", nullable = false)
    private Integer regionid;
    @Basic
    @Column(name = "REGIONDESCRIPTION", nullable = false, length = 50, columnDefinition = "CHAR(50)")
    private String regiondescription;

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getRegiondescription() {
        return regiondescription;
    }

    public void setRegiondescription(String regiondescription) {
        this.regiondescription = regiondescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Region region = (Region) o;

        if (regionid != null ? !regionid.equals(region.regionid) : region.regionid != null) return false;
        if (regiondescription != null ? !regiondescription.equals(region.regiondescription) : region.regiondescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = regionid != null ? regionid.hashCode() : 0;
        result = 31 * result + (regiondescription != null ? regiondescription.hashCode() : 0);
        return result;
    }
}
