package com.df.beans;

public class PC implements Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}
	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	@Override
	public String toString() {
		return "PC [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + "]";
	}
	
	
}
