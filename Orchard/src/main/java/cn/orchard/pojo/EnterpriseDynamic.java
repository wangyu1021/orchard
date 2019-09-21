package cn.orchard.pojo;

import java.io.Serializable;
import java.util.Date;


import io.swagger.annotations.ApiModelProperty;
/**
 * 企业动态
 * @author Riyas
 *
 */
public class EnterpriseDynamic  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5604261479001154663L;
	@ApiModelProperty(hidden = true)
	private int id;//id
	@ApiModelProperty(hidden = true)
	private String enterprise_number;//企业编号
	private String title;//标题
	private String author;//作者
	private String note;//备注
	private String content;//内容
	@ApiModelProperty(hidden = true)
	private String state;//状态
	@ApiModelProperty(hidden = true)
	private Date created_time;//创建时间 
	@ApiModelProperty(hidden = true)
	private Date update_time;//修改时间 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnterprise_number() {
		return enterprise_number;
	}
	public void setEnterprise_number(String enterprise_number) {
		this.enterprise_number = enterprise_number;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getCreated_time() {
		return created_time;
	}
	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "EnterpriseDynamic [id=" + id + ", enterprise_number=" + enterprise_number + ", title=" + title
				+ ", author=" + author + ", note=" + note + ", content=" + content + ", state=" + state
				+ ", created_time=" + created_time + ", update_time=" + update_time + "]";
	}
	
}
