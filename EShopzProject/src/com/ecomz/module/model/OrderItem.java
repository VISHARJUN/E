package com.ecomz.module.model;

public class OrderItem {
private String modelId;
private String modelName;
public OrderItem() {
}
public OrderItem(String modelId, String modelName) {
	this.modelId = modelId;
	this.modelName = modelName;
}
public String getModelId() {
	return modelId;
}
public void setModelId(String modelId) {
	this.modelId = modelId;
}
public String getModelName() {
	return modelName;
}
public void setModelName(String modelName) {
	this.modelName = modelName;
}
}
