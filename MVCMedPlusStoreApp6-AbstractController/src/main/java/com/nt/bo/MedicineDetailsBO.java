package com.nt.bo;

import lombok.Data;

@Data
public class MedicineDetailsBO {
	private int medId;
	private String medName;
	private String formulaeName;
	private float price;
	private String company;

}
