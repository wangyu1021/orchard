package cn.orchard.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
/**
 * 供求信息
 * @author Riyas
 *
 */
public class TradeLeads implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6404672988902086367L;
	@ApiModelProperty(hidden = true)
	private int id;
	private String title;
	private String author;
	@ApiModelProperty(hidden = true)
	private String status;
	private String content;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String note;
	@ApiModelProperty(hidden = true)
	private Date created_time;
	@ApiModelProperty(hidden = true)
	private Date update_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
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
	@Override
	public String toString() {
		return "TradeLeads [id=" + id + ", title=" + title + ", author=" + author + ", status="
				+ status + ", content=" + content + ", note=" + note + ", created_time=" + created_time
				+ ", update_time=" + update_time + "]";
	}
	
}
