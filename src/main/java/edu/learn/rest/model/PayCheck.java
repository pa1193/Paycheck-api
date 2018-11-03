package edu.learn.rest.model;

public class PayCheck {
	private float taxRate;
	private float estimatedYearlySalary;
	private float weeklySalary;
	private float regularPay;
	private float overTimePay;
	private float taxesPaid;
	public PayCheck(float taxRate, float estimatedYearlySalary, float weeklySalary, float regularPay, float overTimePay,
			float taxesPaid) {
		super();
		this.taxRate = taxRate;
		this.estimatedYearlySalary = estimatedYearlySalary;
		this.weeklySalary = weeklySalary;
		this.regularPay = regularPay;
		this.overTimePay = overTimePay;
		this.taxesPaid = taxesPaid;
	}

public float getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(float taxRate) {
		this.taxRate = taxRate;
	}
	public float getEstimatedYearlySalary() {
		return estimatedYearlySalary;
	}
	public void setEstimatedYearlySalary(float estimatedYearlySalary) {
		this.estimatedYearlySalary = estimatedYearlySalary;
	}
	public float getWeeklySalary() {
		return weeklySalary;
	}
	public void setWeeklySalary(float weeklySalary) {
		this.weeklySalary = weeklySalary;
	}
	public float getRegularPay() {
		return regularPay;
	}
	public void setRegularPay(float regularPay) {
		this.regularPay = regularPay;
	}
	public float getOverTimePay() {
		return overTimePay;
	}
	public void setOverTimePay(float overTimePay) {
		this.overTimePay = overTimePay;
	}
	public float getTaxesPaid() {
		return taxesPaid;
	}
	public void setTaxesPaid(float taxesPaid) {
		this.taxesPaid = taxesPaid;
	}
	//private float overTimeHours;
//private float overTimePay;
//private float weeklySalary;
//private float estimatedYearlySalary;
//private float taxRate;
//private float taxesPaid;
//public PayCheck(float overTimeHours, float overTimePay, float weeklySalary, float estimatedYearlySalary, float taxRate,
//		float taxesPaid) {
//	super();
//	this.overTimeHours = overTimeHours;
//	this.overTimePay = overTimePay;
//	this.weeklySalary = weeklySalary;
//	this.estimatedYearlySalary = estimatedYearlySalary;
//	this.taxRate = taxRate;
//	this.taxesPaid = taxesPaid;
//}
//public float getOverTimeHours() {
//	return overTimeHours;
//}
//public void setOverTimeHours(float overTimeHours) {
//	this.overTimeHours = overTimeHours;
//}
//public float getOverTimePay() {
//	return overTimePay;
//}
//public void setOverTimePay(float overTimePay) {
//	this.overTimePay = overTimePay;
//}
//public float getWeeklySalary() {
//	return weeklySalary;
//}
//public void setWeeklySalary(float weeklySalary) {
//	this.weeklySalary = weeklySalary;
//}
//public float getEstimatedYearlySalary() {
//	return estimatedYearlySalary;
//}
//public void setEstimatedYearlySalary(float estimatedYearlySalary) {
//	this.estimatedYearlySalary = estimatedYearlySalary;
//}
//public float getTaxRate() {
//	return taxRate;
//}
//public void setTaxRate(float taxRate) {
//	this.taxRate = taxRate;
//}
//public float getTaxesPaid() {
//	return taxesPaid;
//}
//public void setTaxesPaid(float taxesPaid) {
//	this.taxesPaid = taxesPaid;
//}
//
	
}
