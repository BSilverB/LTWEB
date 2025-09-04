package vn.iotstar.Models;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Category implements Serializable {
	private int cateid;
	private String catename;
	private String icon;
	public int getCateid() {
		return cateid;
	}
	public void setCateid(int cateid) {
		this.cateid = cateid;
	}
	public String getCatename() {
		return catename;
	}
	public void setCatename(String catename) {
		this.catename = catename;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public Category(String catename, String icon) {
		super();
		this.catename = catename;
		this.icon = icon;
	}
	public Category() {
		
	}
	
}
