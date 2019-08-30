package cn.orchard.pojo;

import java.util.Date;
/**
 * 企业动态
 * @author Riyas
 *
 */
public class EnterpriseDynamic {
	private int id;//id
	private String enterpriseNumber;//企业编号
	private String title;//标题
	private String author;//作者
	private String note;//备注
	private String state;//状态
	private Date createdTime;//创建时间 
	private Date updateTime;//修改时间 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEnterpriseNumber() {
		return enterpriseNumber;
	}
	public void setEnterpriseNumber(String enterpriseNumber) {
		this.enterpriseNumber = enterpriseNumber;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
		return "EnterpriseDynamic [id=" + id + ", enterpriseNumber=" + enterpriseNumber + ", title=" + title
				+ ", author=" + author + ", note=" + note + ", state=" + state + ", createdTime=" + createdTime
				+ ", updateTime=" + updateTime + "]";
	}
	
}
