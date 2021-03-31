package com.rich.mail.api.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "short_vedio", schema = "champion", catalog = "")
public class ShortVedioEntity {
    private Long id;
    private Timestamp createDate;
    private String createBy;
    private String lastUpdateBy;
    private Timestamp lastUpdateDate;
    private Boolean deleteFlag;
    private String vedioImage;
    private String vedioLink;
    private String vedioTitile;

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
    @Column(name = "create_date", nullable = true)
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "create_by", nullable = true, length = 255)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "last_update_by", nullable = true, length = 255)
    public String getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }

    @Basic
    @Column(name = "last_update_date", nullable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    @Basic
    @Column(name = "delete_flag", nullable = true)
    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Basic
    @Column(name = "vedio_image", nullable = true, length = 255)
    public String getVedioImage() {
        return vedioImage;
    }

    public void setVedioImage(String vedioImage) {
        this.vedioImage = vedioImage;
    }

    @Basic
    @Column(name = "vedio_link", nullable = true, length = 255)
    public String getVedioLink() {
        return vedioLink;
    }

    public void setVedioLink(String vedioLink) {
        this.vedioLink = vedioLink;
    }

    @Basic
    @Column(name = "vedio_titile", nullable = true, length = 255)
    public String getVedioTitile() {
        return vedioTitile;
    }

    public void setVedioTitile(String vedioTitile) {
        this.vedioTitile = vedioTitile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShortVedioEntity that = (ShortVedioEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (vedioImage != null ? !vedioImage.equals(that.vedioImage) : that.vedioImage != null) return false;
        if (vedioLink != null ? !vedioLink.equals(that.vedioLink) : that.vedioLink != null) return false;
        if (vedioTitile != null ? !vedioTitile.equals(that.vedioTitile) : that.vedioTitile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (lastUpdateBy != null ? lastUpdateBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (vedioImage != null ? vedioImage.hashCode() : 0);
        result = 31 * result + (vedioLink != null ? vedioLink.hashCode() : 0);
        result = 31 * result + (vedioTitile != null ? vedioTitile.hashCode() : 0);
        return result;
    }
}
