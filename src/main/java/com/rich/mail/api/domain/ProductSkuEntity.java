package com.rich.mail.api.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "product_sku", schema = "champion", catalog = "")
public class ProductSkuEntity {
    private Long id;
    private Timestamp createDate;
    private String createBy;
    private String lastUpdateBy;
    private Timestamp lastUpdateDate;
    private String deleteFlag;
    private String skuName;
    private Long parentId;
    private BigDecimal skuPrice;
    private String skuImage;

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
    @Column(name = "delete_flag", nullable = true, length = 255)
    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Basic
    @Column(name = "sku_name", nullable = true, length = 255)
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "sku_price", nullable = true, precision = 2)
    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }

    @Basic
    @Column(name = "sku_image", nullable = true, length = 255)
    public String getSkuImage() {
        return skuImage;
    }

    public void setSkuImage(String skuImage) {
        this.skuImage = skuImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductSkuEntity that = (ProductSkuEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (skuName != null ? !skuName.equals(that.skuName) : that.skuName != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (skuPrice != null ? !skuPrice.equals(that.skuPrice) : that.skuPrice != null) return false;
        if (skuImage != null ? !skuImage.equals(that.skuImage) : that.skuImage != null) return false;

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
        result = 31 * result + (skuName != null ? skuName.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (skuPrice != null ? skuPrice.hashCode() : 0);
        result = 31 * result + (skuImage != null ? skuImage.hashCode() : 0);
        return result;
    }
}
