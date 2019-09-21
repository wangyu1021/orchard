package cn.orchard.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
/**
 * 商品
 * @author Riyas
 *
 */
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7435618781097804398L;
	@ApiModelProperty(hidden = true)
	private int id;
	private String name;
	private String title;
	private double price;
	private int number;
	private String information;
	@ApiModelProperty(hidden = true)
	private Date created_time;
	@ApiModelProperty(hidden = true)
	private String image;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", title=" + title + ", price=" + price + ", number=" + number
				+ ", information=" + information + ", created_time=" + created_time + ", image=" + image + "]";
	}
	
}
