package com.educandoweb.course.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	//contruindo um construtor para enumerações
	private int code;
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//para ficar visível a aplicação
	public int getCode() {
		return code;
	}
	//método estático para converter valor numérico em tipo enumarado
	public static OrderStatus valueOf(int code) {
		for(OrderStatus value: OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Inválid OrderStatus code!");
	}
}
