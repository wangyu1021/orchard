package cn.orchard.pojo;

import java.io.Serializable;
/**
 * 联系人
 * @author Riyas
 *
 */
public class Contact implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2623670157360367435L;
	private int id;
	private String name;
	private String contact;
	private String phone;
	private String url;
	private String address;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", contact=" + contact + ", phone=" + phone + ", url=" + url
				+ ", address=" + address + "]";
	}
	
}
