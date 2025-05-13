package com.tcs.training.dto;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class PurchaseDTO {
    private Long id;
    private Long vendorId;
    private String vendorName;
    private Long productId;
    private String productName;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private LocalDate expectedDeliveryDate;
    private String status;
	public PurchaseDTO() {
		super();
	}
	public PurchaseDTO(Long id, Long vendorId, String vendorName, Long productId, String productName, Integer quantity,
			Double unitPrice, Double totalAmount, LocalDate expectedDeliveryDate, String status) {
		super();
		this.id = id;
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
		this.expectedDeliveryDate = expectedDeliveryDate;
		this.status = status;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getVendorId() {
		return vendorId;
	}
	public void setVendorId(Long vendorId) {
		this.vendorId = vendorId;
	}
	public String getVendorName() {
		return vendorName;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public LocalDate getExpectedDeliveryDate() {
		return expectedDeliveryDate;
	}
	public void setExpectedDeliveryDate(LocalDate expectedDeliveryDate) {
		this.expectedDeliveryDate = expectedDeliveryDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
    
    // Getters and setters
}