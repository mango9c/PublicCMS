package org.publiccms.entities.cms;

import static org.publiccms.common.database.CmsUpgrader.IDENTIFIER_GENERATOR;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * CmsTagType generated by hbm2java
 */
@Entity
@Table(name = "cms_tag_type")
public class CmsTagType implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "ID")
    private Integer id;
    @GeneratorColumn(title = "站点", condition = true)
    @JsonIgnore
    private int siteId;
    @GeneratorColumn(title = "名称", condition = true, like = true)
    private String name;
    @GeneratorColumn(title = "标签个数")
    private int count;

    public CmsTagType() {
    }

    public CmsTagType(int siteId, String name, int count) {
        this.siteId = siteId;
        this.name = name;
        this.count = count;
    }

    @Id
    @GeneratedValue(generator = "cmsGenerator")
    @GenericGenerator(name = "cmsGenerator", strategy = IDENTIFIER_GENERATOR)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "site_id", nullable = false)
    public int getSiteId() {
        return this.siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "count", nullable = false)
    public int getCount() {
        return this.count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}