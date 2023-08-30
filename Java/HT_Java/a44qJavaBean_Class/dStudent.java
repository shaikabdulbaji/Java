package a44qJavaBean_Class;

import java.io.Serializable;

/*
 * asal main difference between pojo and java bean is 
 * adaina application layer nunchi database layer ki povali antea dani network lonunchea pampali
   ala network lonunchi velali antea stream format lo povali.
 * direct ga java object aneadi stram format aavadu dani manam serialization cheasinapudea stream
   aavutundi.
   
 * viti rendinti madyauna similarities enti antea variables ni and methods ni and constructors ni
   veti renti lo same ga maintai chaiyavachu.
 */

public class dStudent implements Serializable{
	
	private int id;
	private String name;
	private double marks;
	
	public dStudent() {
		System.out.println("No-args Constructor");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}

}
