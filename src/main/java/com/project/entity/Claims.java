package com.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Claims 
{
  @Id
  int cno;
  String cdesc;
  String cdate;
  String cstatus;
  @OneToMany
  List<InsurancePolicy> ip;
public int getCno() {
	return cno;
}
public void setCno(int cno) {
	this.cno = cno;
}
public String getCdesc() {
	return cdesc;
}
public void setCdesc(String cdesc) {
	this.cdesc = cdesc;
}
public String getCdate() {
	return cdate;
}
public void setCdate(String cdate) {
	this.cdate = cdate;
}
public String getCstatus() {
	return cstatus;
}
public void setCstatus(String cstatus) {
	this.cstatus = cstatus;
}
public List<InsurancePolicy> getIp() {
	return ip;
}
public void setIp(List<InsurancePolicy> ip) {
	this.ip = ip;
}
  
  
}
