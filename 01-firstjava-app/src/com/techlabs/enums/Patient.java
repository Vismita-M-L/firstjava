package com.techlabs.enums;

public class Patient {

	public static void main(String[] args) {
	}private string name;
	 private BPLevel bpLevel;
	
		Patient()
		{
		
		}
		Patient(string name,BPLevel bpLevel)
		{

	
	    this.name=name;
	    this.bpLevel=bpLevel;
}
		
		public string getName() {
			return name;
		}
		public void setName(string name) {
			this.name = name;
		}
		public BPLevel getBpLevel() {
			return bpLevel;
		}
		public void setBpLevel(BPLevel bpLevel) {
			this.bpLevel = bpLevel;
		}
		public String toString()
		{
		    return "Patient name:"+name+"\n"+"BP Level:"+bpLevel;
		}
	
}



		