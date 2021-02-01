/**
 * 
 */
package com.list;

import java.util.List;

/**
 * @author Rutuja
 *
 */
public class Product {

	private int pid;
	private String pname;
	private List colors;
	
	
	public List getColors() {
		return colors;
	}
	public void setColors(List colors) {
		this.colors = colors;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	

}
