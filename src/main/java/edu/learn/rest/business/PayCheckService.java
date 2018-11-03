package edu.learn.rest.business;

import javax.swing.JOptionPane;

import edu.learn.rest.model.Developer;
import edu.learn.rest.model.PayCheck;

public class PayCheckService {
	private static float single = .30f;
	private static float married = .32f;
	private static float head = .25f;
	private static float sep = .28f;
	private static float tax = 0.0f;
	private static float taxPaid;
	private static int yearly;
	private static float otHours;
	private static float otPay;
	private static float regPay;
	public PayCheck getPayCheck(float wage, float hours, String s) {
		String states = s;
		if(states.equalsIgnoreCase("S"))tax = single;
		if(states.equalsIgnoreCase("MFJ")) tax = married;
		if(states.equalsIgnoreCase("HH")) tax = head;
		if(states.equalsIgnoreCase("MFS")) tax = sep;
		
		if (hours > 40) {
			 otHours = hours - 40;
			
			 otPay = otHours * 1.5f * wage;
			 
			 regPay = wage * 40;
		}else {
			otHours = 0;
			otPay = 0;
			regPay = wage * hours;
		}
		float weeklySalary = regPay + otPay;
		float yearlySalary = weeklySalary * 52;
		taxPaid = weeklySalary * tax;
//		float otHours = hours > 40 ? hours - 40 : 0;
//		
//		float otPay =  otHours > 0 ? otHours * 1.5f * wage : 0;
//	
//		if(otPay>0) {
//			myMoney = otPay + (40 * wage);
//		}
//		yearly = (int) myMoney * 52;
//		taxPaid = myMoney * tax;
//		PayCheck payCheck = new PayCheck(otHours,otPay,myMoney,yearly,tax,taxPaid);
//		
//		
		PayCheck payCheck = new PayCheck(tax,yearlySalary, weeklySalary, regPay,otPay,taxPaid);
		return payCheck;
	}
	public static Developer getDeveloper() {
		Developer dev = new Developer();
		return dev;
	}

}
