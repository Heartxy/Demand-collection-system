package bean;

public class user {

	protected int uid;	//key不能使varchar类型的
	protected String username;
	protected String password; 
	protected String name;
	protected String cid;
	protected int sex;
	protected String province;
	protected String JGQC;//有所改动
	protected String zhuanye;
	protected String hangye;
	protected String jiaoyu;
	protected String zhichen;
	protected String tongxun;
	protected String youbian;
	protected String telephone;
	protected String phone;
	protected String email;
	protected String QQ;
	protected String MSN;
	protected int type;//新增角色

	//登陆
	public void setuser(int uid,String username,String password,String name,String cid,int sex,String province,String JGQC,String zhuanye,String hangye,String jiaoyu,
			String zhichen,String tongxun,String youbian,String telephone,String phone,String email,String qQ,String mSN,int type){
		this.uid=uid;
		this.username = username;
		this.password = password;
		this.name = name;
		this.cid=cid;
		this.sex = sex;
		this.province = province;
		this.JGQC = JGQC;
		this.zhuanye = zhuanye;
		this.hangye = hangye;
		this.jiaoyu = jiaoyu;
		this.zhichen=zhichen;
		this.tongxun = tongxun;
		this.youbian = youbian;
		this.telephone = telephone;
		this.phone = phone;
		this.email = email;
		this.QQ = qQ;
		this.MSN = mSN;
		this.type=type;
	}
	
	//注册
	public void setuser1(String username,String password,String name,String cid,int sex,String province,String JGQC,String zhuanye,String hangye,String jiaoyu,
			String zhichen,String tongxun,String youbian,String telephone,String phone,String email,String qQ,String mSN,int type){
		
		this.username = username;
		this.password = password;
		this.name = name;
		this.cid=cid;
		this.sex = sex;
		this.province = province;
		this.JGQC = JGQC;
		this.zhuanye = zhuanye;
		this.hangye = hangye;
		this.jiaoyu = jiaoyu;
		this.zhichen=zhichen;
		this.tongxun = tongxun;
		this.youbian = youbian;
		this.telephone = telephone;
		this.phone = phone;
		this.email = email;
		this.QQ = qQ;
		this.MSN = mSN;
		this.type=type;
	}
	
	public int getuid() {
		return uid;
	}
	public void setuid(int uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getJGQC() {
		return JGQC;
	}
	public void setJGQC(String JGQC) {
		this.JGQC = JGQC;
	}
	public String getZhuanye() {
		return zhuanye;
	}
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	public String getHangye() {
		return hangye;
	}
	public void setHangye(String hangye) {
		this.hangye = hangye;
	}
	public String getJiaoyu() {
		return jiaoyu;
	}
	public void setJiaoyu(String jiaoyu) {
		this.jiaoyu = jiaoyu;
	}
	public String getZhichen() {
		return zhichen;
	}
	public void setZhichen(String zhichen) {
		this.zhichen = zhichen;
	}
	public String getTongxun() {
		return tongxun;
	}
	public void setTongxun(String tongxun) {
		this.tongxun = tongxun;
	}
	public String getYoubian() {
		return youbian;
	}
	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
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
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		this.QQ = qQ;
	}
	public String getMSN() {
		return MSN;
	}
	public void setMSN(String mSN) {
		this.MSN = mSN;
	}
	public void setType(int a){
		this.type=a;
	}
	public int getType(){
		return type;
	}
	
	
}
