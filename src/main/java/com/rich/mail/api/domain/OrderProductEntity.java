package com.rich.mail.api.domain;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
@Table(name = "order_product", schema = "champion", catalog = "")
public class OrderProductEntity {
    private Long id;
    private Timestamp createDate;
    private String createBy;
    private Timestamp lastUpdateDate;
    private String lastUpdateBy;
    private Boolean deleteFlag;
    private Long productId;
    private Integer prodcutCount;
    private BigDecimal productPrice;
    private Long orderId;

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
    @Column(name = "last_update_date", nullable = true)
    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
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
    @Column(name = "prodcut_count", nullable = true)
    public Integer getProdcutCount() {
        return prodcutCount;
    }

    public void setProdcutCount(Integer prodcutCount) {
        this.prodcutCount = prodcutCount;
    }

    @Basic
    @Column(name = "product_price", nullable = true, precision = 2)
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    @Basic
    @Column(name = "order_id", nullable = true)
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderProductEntity that = (OrderProductEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;
        if (prodcutCount != null ? !prodcutCount.equals(that.prodcutCount) : that.prodcutCount != null) return false;
        if (productPrice != null ? !productPrice.equals(that.productPrice) : that.productPrice != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdateBy != null ? lastUpdateBy.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        result = 31 * result + (prodcutCount != null ? prodcutCount.hashCode() : 0);
        result = 31 * result + (productPrice != null ? productPrice.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        return result;
    }
}
