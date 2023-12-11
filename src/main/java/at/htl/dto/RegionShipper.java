package at.htl.dto;

public class RegionShipper {
    private String regionDescription;
    private String companyName;
    private long count;

    public RegionShipper(String regionDescription, String companyName, long count) {
        setRegionDescription(regionDescription);
        this.companyName = companyName;
        this.count = count;
    }

    public String getRegionDescription() {
        return regionDescription;
    }

    public void setRegionDescription(String regionDescription) {
        this.regionDescription = (regionDescription != null) ? regionDescription.trim() : null;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
