package cn.orchard.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

/**
 * 供应商
 * @author Riyas
 *
 */
public class Supplier {
	@ApiModelProperty(hidden = true)
	private int id;
	private String title;
	@ApiModelProperty(hidden = true)
	private int state;
	private String note;
	@ApiModelProperty(hidden = true)
	private Date createdTime;
	@ApiModelProperty(hidden = true)
	private Date updateTime;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Supplier [id=" + id + ", title=" + title + ", state=" + state + ", note=" + note + ", createdTime="
				+ createdTime + ", updateTime=" + updateTime + "]";
	}
	
	
}
