package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by bystander on 2018/4/3.
 *
 * 订单
 */
public class OrderVo {
    //订单号
    private Long orderNo;
    //付款
    private BigDecimal payment;
    //付款类型
    private Integer paymentType;
    //付款类型描述
    private String paymentTypeDesc;
    //订单状态
    private Integer status;
    //订单状态描述
    private String statusDesc;
    //订单运费
    private Integer pastage;
    //付款时间
    private String paymentTime;
    //发货时间
    private String sendTime;
    //结束时间
    private String endTime;
    //关闭时间
    private String closeTime;
    //创建时间
    private String createTime;
    //订单的明细
    private List<OrderItemVo> orderItemVoList;
    //图片地址前缀
    private String imageHost;
    //发货地址id
    private Integer shippingId;
    //收款人姓名
    private String receiverName;

    public Long getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Long orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPaymentTypeDesc() {
        return paymentTypeDesc;
    }

    public void setPaymentTypeDesc(String paymentTypeDesc) {
        this.paymentTypeDesc = paymentTypeDesc;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public Integer getPastage() {
        return pastage;
    }

    public void setPastage(Integer pastage) {
        this.pastage = pastage;
    }

    public String getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        this.paymentTime = paymentTime;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<OrderItemVo> getOrderItemVoList() {
        return orderItemVoList;
    }

    public void setOrderItemVoList(List<OrderItemVo> orderItemVoList) {
        this.orderItemVoList = orderItemVoList;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }

    public Integer getShippingId() {
        return shippingId;
    }

    public void setShippingId(Integer shippingId) {
        this.shippingId = shippingId;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }
}
