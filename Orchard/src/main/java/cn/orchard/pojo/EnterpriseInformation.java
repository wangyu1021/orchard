package cn.orchard.pojo;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
/**
 * 企业信息
 * @author Riyas
 *
 */
public class EnterpriseInformation implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1697492630813188263L;
	@ApiModelProperty(hidden = true)
	private int id;//id
	@ApiModelProperty(hidden = true)
	private String number;//编号
	private String name;//公司名称!
	private String product;//主营产品
	private String moble;//手机号码!
	private String model;//模式
	private long capital;//注册资本!
	private String registered_address;//注册地址
	private int number_employees;//员工人数!
	private Date set_time;//成立时间
	private int phone;//电话号码
	private String business;//经营方向
	private String home;//首页
	private String fax;//传真
	private String zip_code;//邮编
	private String email;//邮箱
	private String address;//公司地址
	private String contact;//联系人
	private String wechat;//微信号
	private String introduction;//公司简介
	private String type;//公司类型
	private String business_location;//经营地址
	@ApiModelProperty(hidden = true)
	private Date created_time;//创建时间
	@ApiModelProperty(hidden = true)
	private Date update_time;//修改时间 
	private String banner_image;//横幅图片
	private String logo_image;//logo图片
	private String qr_image;//二维码图片
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getMoble() {
		return moble;
	}
	public void setMoble(String moble) {
		this.moble = moble;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getCapital() {
		return capital;
	}
	public void setCapital(long capital) {
		this.capital = capital;
	}
	public String getRegistered_address() {
		return registered_address;
	}
	public void setRegistered_address(String registered_address) {
		this.registered_address = registered_address;
	}
	public int getNumber_employees() {
		return number_employees;
	}
	public void setNumber_employees(int number_employees) {
		this.number_employees = number_employees;
	}
	public Date getSet_time() {
		return set_time;
	}
	public void setSet_time(Date set_time) {
		this.set_time = set_time;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getBusiness() {
		return business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getZip_code() {
		return zip_code;
	}
	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getWechat() {
		return wechat;
	}
	public void setWechat(String wechat) {
		this.wechat = wechat;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBusiness_location() {
		return business_location;
	}
	public void setBusiness_location(String business_location) {
		this.business_location = business_location;
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
	public String getBanner_image() {
		return banner_image;
	}
	public void setBanner_image(String banner_image) {
		this.banner_image = banner_image;
	}
	public String getLogo_image() {
		return logo_image;
	}
	public void setLogo_image(String logo_image) {
		this.logo_image = logo_image;
	}
	public String getQr_image() {
		return qr_image;
	}
	public void setQr_image(String qr_image) {
		this.qr_image = qr_image;
	}
	@Override
	public String toString() {
		return "EnterpriseInformation [id=" + id + ", number=" + number + ", name=" + name + ", product=" + product
				+ ", moble=" + moble + ", model=" + model + ", capital=" + capital + ", registered_address="
				+ registered_address + ", number_employees=" + number_employees + ", set_time=" + set_time + ", phone="
				+ phone + ", business=" + business + ", home=" + home + ", fax=" + fax + ", zip_code=" + zip_code
				+ ", email=" + email + ", address=" + address + ", contact=" + contact + ", wechat=" + wechat
				+ ", introduction=" + introduction + ", type=" + type + ", business_location=" + business_location
				+ ", created_time=" + created_time + ", update_time=" + update_time + ", banner_image=" + banner_image
				+ ", logo_image=" + logo_image + ", qr_image=" + qr_image + "]";
	}
	
}