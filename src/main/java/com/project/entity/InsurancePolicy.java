package com.project.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class InsurancePolicy 
{
	@Id
  int pid;
  String ptype;
  double camount;
  double preminum;
  String start_date;
  String end_date;
  @OneToOne
  Client c;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPtype() {
	return ptype;
}
public void setPtype(String ptype) {
	this.ptype = ptype;
}
public double getCamount() {
	return camount;
}
public void setCamount(double camount) {
	this.camount = camount;
}
public double getPreminum() {
	return preminum;
}
public void setPreminum(double preminum) {
	this.preminum = preminum;
}
public String getStart_date() {
	return start_date;
}
public void setStart_date(String start_date) {
	this.start_date = start_date;
}
public String getEnd_date() {
	return end_date;
}
public void setEnd_date(String end_date) {
	this.end_date = end_date;
}
public Client getC() {
	return c;
}
public void setC(Client c) {
	this.c = c;
}
  
  
}
