package at.htl.model;


import jakarta.persistence.*;

@Entity
@Table(name = "TERRITORIES", schema = "APP", catalog = "")
public class Territory {
    @Id
    @Column(name = "TERRITORYID", nullable = false, length = 20)
    private String territoryid;
    @Basic
    @Column(name = "TERRITORYDESCRIPTION", nullable = false, length = 50, columnDefinition = "CHAR(50)")
    private String territorydescription;
    @ManyToOne
    @JoinColumn(name = "REGIONID", referencedColumnName = "REGIONID", nullable = false)
    private Region regionByRegionid;

    public String getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(String territoryid) {
        this.territoryid = territoryid;
    }

    public String getTerritorydescription() {
        return territorydescription;
    }

    public void setTerritorydescription(String territorydescription) {
        this.territorydescription = territorydescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Territory territory = (Territory) o;

        if (territoryid != null ? !territoryid.equals(territory.territoryid) : territory.territoryid != null)
            return false;
        if (territorydescription != null ? !territorydescription.equals(territory.territorydescription) : territory.territorydescription != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = territoryid != null ? territoryid.hashCode() : 0;
        result = 31 * result + (territorydescription != null ? territorydescription.hashCode() : 0);
        return result;
    }

    public Region getRegionByRegionid() {
        return regionByRegionid;
    }

    public void setRegionByRegionid(Region regionByRegionid) {
        this.regionByRegionid = regionByRegionid;
    }
}
