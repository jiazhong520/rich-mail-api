package com.rich.mail.api.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product_car", schema = "champion", catalog = "")
public class ProductCarEntity {
    private Long id;
    private String createBy;
    private Timestamp createDate;
    private String lastUpdateBy;
    private Timestamp lastUpdateDate;
    private Boolean deleteFlag;
    private Long productId;
    private Long userId;
    private Integer productCount;

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
    @Column(name = "create_by", nullable = true, length = 255)
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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
    @Column(name = "product_id", nullable = true)
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "user_id", nullable = true)
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "product_count", nullable = true)
    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductCarEntity that = (ProductCarEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (productCount != null ? !productCount.equals(that.productCount) : that.productCount != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (lastUpdateBy != null ? lastUpdateBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (productCount != null ? productCount.hashCode() : 0);
        return result;
    }
}
