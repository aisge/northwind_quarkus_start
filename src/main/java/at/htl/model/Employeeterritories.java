package at.htl.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Employeeterritories implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPLOYEEID", nullable = false)
    private Employee employeesByEmployeeid;

    @Id
    @ManyToOne
    @JoinColumn(name = "TERRITORYID", referencedColumnName = "TERRITORYID", nullable = false)
    private Territory territoriesByTerritoryid;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employeeterritories that = (Employeeterritories) o;
        return Objects.equals(employeesByEmployeeid, that.employeesByEmployeeid) && Objects.equals(territoriesByTerritoryid, that.territoriesByTerritoryid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeesByEmployeeid, territoriesByTerritoryid);
    }
}
