package com.rich.mail.api.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "custom_user", schema = "champion", catalog = "")
public class CustomUserEntity {
    private Long id;
    private String phone;
    private Timestamp createDate;
    private String createBy;
    private Timestamp lastUpdateDate;
    private String lastUpdateBy;
    private Integer deleteFlag;
    private String userName;
    private String userPass;
    private String iconLink;
    private String bInfo;
    private String payPass;
    private Long parentId;

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
    @Column(name = "phone", nullable = true, length = 11)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    @Basic
    @Column(name = "user_name", nullable = true, length = 255)
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_pass", nullable = true, length = 255)
    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    @Basic
    @Column(name = "icon_link", nullable = true, length = 255)
    public String getIconLink() {
        return iconLink;
    }

    public void setIconLink(String iconLink) {
        this.iconLink = iconLink;
    }

    @Basic
    @Column(name = "b_info", nullable = true, length = 255)
    public String getbInfo() {
        return bInfo;
    }

    public void setbInfo(String bInfo) {
        this.bInfo = bInfo;
    }

    @Basic
    @Column(name = "pay_pass", nullable = true, length = 255)
    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    @Basic
    @Column(name = "parent_id", nullable = true)
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomUserEntity that = (CustomUserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (lastUpdateDate != null ? !lastUpdateDate.equals(that.lastUpdateDate) : that.lastUpdateDate != null)
            return false;
        if (lastUpdateBy != null ? !lastUpdateBy.equals(that.lastUpdateBy) : that.lastUpdateBy != null) return false;
        if (deleteFlag != null ? !deleteFlag.equals(that.deleteFlag) : that.deleteFlag != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userPass != null ? !userPass.equals(that.userPass) : that.userPass != null) return false;
        if (iconLink != null ? !iconLink.equals(that.iconLink) : that.iconLink != null) return false;
        if (bInfo != null ? !bInfo.equals(that.bInfo) : that.bInfo != null) return false;
        if (payPass != null ? !payPass.equals(that.payPass) : that.payPass != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (lastUpdateDate != null ? lastUpdateDate.hashCode() : 0);
        result = 31 * result + (lastUpdateBy != null ? lastUpdateBy.hashCode() : 0);
        result = 31 * result + (deleteFlag != null ? deleteFlag.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPass != null ? userPass.hashCode() : 0);
        result = 31 * result + (iconLink != null ? iconLink.hashCode() : 0);
        result = 31 * result + (bInfo != null ? bInfo.hashCode() : 0);
        result = 31 * result + (payPass != null ? payPass.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        return result;
    }
}
