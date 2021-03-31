package com.rich.mail.api.domain;

import javax.persistence.*;

@Entity
@Table(name = "casbin_rule", schema = "champion", catalog = "")
public class CasbinRuleEntity {
    private Long id;
    private String ptype;
    private String v0;
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private String v5;

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ptype", nullable = true, length = 100)
    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    @Basic
    @Column(name = "v0", nullable = true, length = 100)
    public String getV0() {
        return v0;
    }

    public void setV0(String v0) {
        this.v0 = v0;
    }

    @Basic
    @Column(name = "v1", nullable = true, length = 100)
    public String getV1() {
        return v1;
    }

    public void setV1(String v1) {
        this.v1 = v1;
    }

    @Basic
    @Column(name = "v2", nullable = true, length = 100)
    public String getV2() {
        return v2;
    }

    public void setV2(String v2) {
        this.v2 = v2;
    }

    @Basic
    @Column(name = "v3", nullable = true, length = 100)
    public String getV3() {
        return v3;
    }

    public void setV3(String v3) {
        this.v3 = v3;
    }

    @Basic
    @Column(name = "v4", nullable = true, length = 100)
    public String getV4() {
        return v4;
    }

    public void setV4(String v4) {
        this.v4 = v4;
    }

    @Basic
    @Column(name = "v5", nullable = true, length = 100)
    public String getV5() {
        return v5;
    }

    public void setV5(String v5) {
        this.v5 = v5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CasbinRuleEntity that = (CasbinRuleEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (ptype != null ? !ptype.equals(that.ptype) : that.ptype != null) return false;
        if (v0 != null ? !v0.equals(that.v0) : that.v0 != null) return false;
        if (v1 != null ? !v1.equals(that.v1) : that.v1 != null) return false;
        if (v2 != null ? !v2.equals(that.v2) : that.v2 != null) return false;
        if (v3 != null ? !v3.equals(that.v3) : that.v3 != null) return false;
        if (v4 != null ? !v4.equals(that.v4) : that.v4 != null) return false;
        if (v5 != null ? !v5.equals(that.v5) : that.v5 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (ptype != null ? ptype.hashCode() : 0);
        result = 31 * result + (v0 != null ? v0.hashCode() : 0);
        result = 31 * result + (v1 != null ? v1.hashCode() : 0);
        result = 31 * result + (v2 != null ? v2.hashCode() : 0);
        result = 31 * result + (v3 != null ? v3.hashCode() : 0);
        result = 31 * result + (v4 != null ? v4.hashCode() : 0);
        result = 31 * result + (v5 != null ? v5.hashCode() : 0);
        return result;
    }
}
