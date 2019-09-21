package cn.orchard.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
/**
 * 在线留言
 * @author Riyas
 *
 */
public class LeaveMessage  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4894893284326853252L;
	@ApiModelProperty(hidden = true)
	private int id;
	private String name;
	private String phone;
	private String email;
	private String content;
	@ApiModelProperty(hidden = true)
	private Date created_time;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "LeaveMessage [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", content="
				+ content + ", created_time=" + created_time + "]";
	}
	
}
