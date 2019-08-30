package cn.orchard.pojo;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;
/**
 * 企业信息
 * @author Riyas
 *
 */
public class EnterpriseInformation {
	@ApiModelProperty(hidden = true)
	private int id;//id
	@ApiModelProperty(hidden = true)
	private String number;//编号
	private String enterpriseName;//公司名称
	private String product;//主营产品
	private String moblePhone;//手机号码
	private String model;//模式
	private long registeredCapital;//注册资本
	private String registeredAddress;//注册地址
	private int numberOfEmployees;//员工人数
	private Date setUpTheTime;//成立时间
	private int phone;//电话号码
	private String business;//经营方向
	private String home;//首页
	private String fax;//传真
	private String zipCode;//邮编
	private String email;//邮箱
	private String address;//公司地址
	private String contact;//联系人
	private String wechat;//微信号
	private String introduction;//公司简介
	private String enterpriseType;//公司类型
	private String businessLocation;//经营地址
	@ApiModelProperty(hidden = true)
	private Date createdTime;//创建时间
	@ApiModelProperty(hidden = true)
	private Date updateTime;//修改时间 
	private String bannerImage;//横幅图片
	private String logoImage;//logo图片
	private String qrCodeImage;//二维码图片
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
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getMoblePhone() {
		return moblePhone;
	}
	public void setMoblePhone(String moblePhone) {
		this.moblePhone = moblePhone;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getRegisteredCapital() {
		return registeredCapital;
	}
	public void setRegisteredCapital(long registeredCapital) {
		this.registeredCapital = registeredCapital;
	}
	public String getRegisteredAddress() {
		return registeredAddress;
	}
	public void setRegisteredAddress(String registeredAddress) {
		this.registeredAddress = registeredAddress;
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	public Date getSetUpTheTime() {
		return setUpTheTime;
	}
	public void setSetUpTheTime(Date setUpTheTime) {
		this.setUpTheTime = setUpTheTime;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	public String getEnterpriseType() {
		return enterpriseType;
	}
	public void setEnterpriseType(String enterpriseType) {
		this.enterpriseType = enterpriseType;
	}
	public String getBusinessLocation() {
		return businessLocation;
	}
	public void setBusinessLocation(String businessLocation) {
		this.businessLocation = businessLocation;
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
	public String getBannerImage() {
		return bannerImage;
	}
	public void setBannerImage(String bannerImage) {
		this.bannerImage = bannerImage;
	}
	public String getLogoImage() {
		return logoImage;
	}
	public void setLogoImage(String logoImage) {
		this.logoImage = logoImage;
	}
	public String getQrCodeImage() {
		return qrCodeImage;
	}
	public void setQrCodeImage(String qrCodeImage) {
		this.qrCodeImage = qrCodeImage;
	}
	@Override
	public String toString() {
		return "Enterprise [id=" + id + ", number=" + number + ", enterpriseName=" + enterpriseName + ", product="
				+ product + ", moblePhone=" + moblePhone + ", model=" + model + ", registeredCapital="
				+ registeredCapital + ", registeredAddress=" + registeredAddress + ", numberOfEmployees="
				+ numberOfEmployees + ", setUpTheTime=" + setUpTheTime + ", phone=" + phone + ", business=" + business
				+ ", home=" + home + ", fax=" + fax + ", zipCode=" + zipCode + ", email=" + email + ", address="
				+ address + ", contact=" + contact + ", wechat=" + wechat + ", introduction=" + introduction
				+ ", enterpriseType=" + enterpriseType + ", businessLocation=" + businessLocation + ", createdTime="
				+ createdTime + ", updateTime=" + updateTime + ", bannerImage=" + bannerImage + ", logoImage="
				+ logoImage + ", qrCodeImage=" + qrCodeImage + "]";
	}
	
}