package com.mmall.vo;

import java.math.BigDecimal;

/**
 * Created by bystander on 2018/4/1.
 */
public class ProductListVo {

    private Integer id;
    private String name;
    private Integer categorId;
    private String imageHost;
    private String mainImage;
    private BigDecimal price;
    private String subtitle ;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCategorId() {
        return categorId;
    }

    public void setCategorId(Integer categorId) {
        this.categorId = categorId;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public String getMainImage() {
        return mainImage;
    }

    public void setMainImage(String mainImage) {
        this.mainImage = mainImage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
