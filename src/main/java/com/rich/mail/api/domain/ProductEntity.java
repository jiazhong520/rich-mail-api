package com.rich.mail.api.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "product", schema = "champion", catalog = "")
public class ProductEntity {
    private Long id;
    private Timestamp createDate;
    private String createBy;
    private String lastUpdateBy;
    private Timestamp lastUpdateDate;
    private Boolean deleteFlag;
    private String productName;
    private String productImage;
    private BigDecimal price;
    private Long cateGoryId;
    private Integer priceType;
    private Integer status;
    private String productTitle;

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
    @Column(name = "product_name", nullable = true, length = 255)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "product_image", nullable = true, length = 255)
    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "cate_gory_id", nullable = true)
    public Long getCateGoryId() {
        return cateGoryId;
    }

    public void setCateGoryId(Long cateGoryId) {
        this.cateGoryId = cateGoryId;
    }

    @Basic
    @Column(name = "price_type", nullable = true)
    public Integer getPriceType() {
        return priceType;
    }

    public void setPriceType(Integer priceType) {
        this.priceType = priceType;
    }

    @Basic
    @Column(name = "status", nullable = true)
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "product_title", nullable = true, length = 255)
    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (productImage != null ? !productImage.equals(that.productImage) : that.productImage != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (cateGoryId != null ? !cateGoryId.equals(that.cateGoryId) : that.cateGoryId != null) return false;
        if (priceType != null ? !priceType.equals(that.priceType) : that.priceType != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (productTitle != null ? !productTitle.equals(that.productTitle) : that.productTitle != null) return false;

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
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productImage != null ? productImage.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (cateGoryId != null ? cateGoryId.hashCode() : 0);
        result = 31 * result + (priceType != null ? priceType.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (productTitle != null ? productTitle.hashCode() : 0);
        return result;
    }
}
