package cn.itcast.ssm.po;

import java.util.Date;

public class Items {
   private Integer id;
   private String name;
   private float price;
   private String detail;
   private String pic;
   private Date createtime;
   
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getPic() {
	return pic;
}
public void setPic(String pic) {
	this.pic = pic;
}
public Date getCreatetime() {
	return createtime;
}
public void setCreatetime(Date createtime) {
	this.createtime = createtime;
}

  
public Items() {
	super();
}
public Items(Integer id, String name, float price, String detail, String pic,
		Date createtime) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.detail = detail;
	this.pic = pic;
	this.createtime = createtime;
}
@Override
public String toString() {
	return "Items [id=" + id + ", name=" + name + ", price=" + price
			+ ", detail=" + detail + ", pic=" + pic + ", createtime="
			+ createtime + "]";
}
   
   
   
   
   
}
