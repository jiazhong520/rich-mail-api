package com.rich.mail.api.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "sys_base_menus", schema = "champion", catalog = "")
public class SysBaseMenusEntity {
    private Long id;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
    private Long menuLevel;
    private String parentId;
    private String path;
    private String name;
    private Byte hidden;
    private String component;
    private Long sort;
    private Byte keepAlive;
    private Byte defaultMenu;
    private String title;
    private String icon;

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
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Basic
    @Column(name = "deleted_at", nullable = true)
    public Timestamp getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt) {
        this.deletedAt = deletedAt;
    }

    @Basic
    @Column(name = "menu_level", nullable = true)
    public Long getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Long menuLevel) {
        this.menuLevel = menuLevel;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 256)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "path", nullable = true, length = 256)
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 256)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "hidden", nullable = true)
    public Byte getHidden() {
        return hidden;
    }

    public void setHidden(Byte hidden) {
        this.hidden = hidden;
    }

    @Basic
    @Column(name = "component", nullable = true, length = 256)
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    @Basic
    @Column(name = "sort", nullable = true)
    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "keep_alive", nullable = true)
    public Byte getKeepAlive() {
        return keepAlive;
    }

    public void setKeepAlive(Byte keepAlive) {
        this.keepAlive = keepAlive;
    }

    @Basic
    @Column(name = "default_menu", nullable = true)
    public Byte getDefaultMenu() {
        return defaultMenu;
    }

    public void setDefaultMenu(Byte defaultMenu) {
        this.defaultMenu = defaultMenu;
    }

    @Basic
    @Column(name = "title", nullable = true, length = 256)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "icon", nullable = true, length = 256)
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SysBaseMenusEntity that = (SysBaseMenusEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;
        if (menuLevel != null ? !menuLevel.equals(that.menuLevel) : that.menuLevel != null) return false;
        if (parentId != null ? !parentId.equals(that.parentId) : that.parentId != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (hidden != null ? !hidden.equals(that.hidden) : that.hidden != null) return false;
        if (component != null ? !component.equals(that.component) : that.component != null) return false;
        if (sort != null ? !sort.equals(that.sort) : that.sort != null) return false;
        if (keepAlive != null ? !keepAlive.equals(that.keepAlive) : that.keepAlive != null) return false;
        if (defaultMenu != null ? !defaultMenu.equals(that.defaultMenu) : that.defaultMenu != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);
        result = 31 * result + (menuLevel != null ? menuLevel.hashCode() : 0);
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (path != null ? path.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (hidden != null ? hidden.hashCode() : 0);
        result = 31 * result + (component != null ? component.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (keepAlive != null ? keepAlive.hashCode() : 0);
        result = 31 * result + (defaultMenu != null ? defaultMenu.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        return result;
    }
}
