package bean;

public class T_DCWJXX {

	
	protected int uid;//�û���id
	protected int WJID;//������id
	protected String JGQC;//�޸�
	protected String GKGLBM;//���� 
	protected String TXDZ;
	protected String SZDY;//����
	
	protected String WZ;//�޸�
	protected String DZYX;
	protected String FRDB;
	protected String YZBM;
	protected String LXR;
	
	protected String GDDH;
	protected String YDDH;
	protected String CZ;
	protected String JGSX;//
	
	protected String JGJJ;
	protected String JSXQMC;
	protected int XQSX1;//����
	protected int XQSX2;//����
	protected String JSXQGS;//�޸�
	
	protected String GJZ;
	protected int NTRZJZE;//����
	protected String JSXQJJFS;//����
	protected String HZYXDW;//����
	
	protected String KJHDLX;//�Ķ�
	
	protected String XKFL;    //�������ݱ������ݱ��ж�ȡ
//����Ҫ����	public XKFLBbean XKFLB;
	
	protected String XQJSSSLY;//��ѡ
	protected String XQJSYYHY;
	protected String date;//�����
	
	
	//�����Ƿ����ͨ��
	protected int dession;
	protected String advice;
	
	
	//�ύ����
	public void set1(
			int uid,int WJID,String JGQC,String GKGLBM,String TXDZ,
			String SZDY,String WZ,String DZYX,String FRDB,
			String YZBM,String LXR,String GDDH,String YDDH,String CZ,
			String JGSX,String JGJJ,String JSXQMC, int XQSX1, int XQSX2,
			String JSXQGS,String GJZ,int NTRZJZE,String JSXQJJFS,
			String HZYXDW,String KJHDLX,String XKFL,String XQJSSSLY, 
			String XQJSYYHY
				){
		this.uid = uid;
		this.WJID=WJID;
		this.JGQC=JGQC;
		this.GKGLBM=GKGLBM;
		this.TXDZ=TXDZ;
		
		this.SZDY=SZDY;
		this.WZ=WZ;
		this.DZYX=DZYX;
		this.FRDB=FRDB;
		
		this.YZBM=YZBM;
		this.LXR=LXR;
		this.GDDH=GDDH;
		this.YDDH=YDDH;
		this.CZ=CZ;
		
		this.JGSX=JGSX;
		this.JGJJ= JGJJ;
		this.JSXQMC=JSXQMC;
		this.XQSX1=XQSX1;
		this.XQSX2=XQSX2;
		
		this.JSXQGS=JSXQGS;
		this.GJZ=GJZ;
		this.NTRZJZE=NTRZJZE;
		this.JSXQJJFS=JSXQJJFS;
		
		this.HZYXDW=HZYXDW;
		this.KJHDLX=KJHDLX;
		this.XKFL=XKFL;
		this.XQJSSSLY=XQJSSSLY;
		
		this.XQJSYYHY=XQJSYYHY;
	}
	//��ȡ
	public void set(
			int uid,int WJID,String JGQC,String GKGLBM,String TXDZ,
			String SZDY,String WZ,String DZYX,String FRDB,
			String YZBM,String LXR,String GDDH,String YDDH,String CZ,
			String JGSX,String JGJJ,String JSXQMC, int XQSX1, int XQSX2,
			String JSXQGS,String GJZ,int NTRZJZE,String JSXQJJFS,
			String HZYXDW,String KJHDLX,String XKFL,String XQJSSSLY, 
			String XQJSYYHY,String date,int dession,String advice
				){
		this.uid = uid;
		this.WJID=WJID;
		this.JGQC=JGQC;
		this.GKGLBM=GKGLBM;
		this.TXDZ=TXDZ;
		
		this.SZDY=SZDY;
		this.WZ=WZ;
		this.DZYX=DZYX;
		this.FRDB=FRDB;
		
		this.YZBM=YZBM;
		this.LXR=LXR;
		this.GDDH=GDDH;
		this.YDDH=YDDH;
		this.CZ=CZ;
		
		this.JGSX=JGSX;
		this.JGJJ= JGJJ;
		this.JSXQMC=JSXQMC;
		this.XQSX1=XQSX1;
		this.XQSX2=XQSX2;
		
		this.JSXQGS=JSXQGS;
		this.GJZ=GJZ;
		this.NTRZJZE=NTRZJZE;
		this.JSXQJJFS=JSXQJJFS;
		
		this.HZYXDW=HZYXDW;
		this.KJHDLX=KJHDLX;
		this.XKFL=XKFL;
		this.XQJSSSLY=XQJSSSLY;
		
		this.XQJSYYHY=XQJSYYHY;
		this.date=date;
		

		this.dession=dession;
		this.advice=advice;
		
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getWJID() {
		return WJID;
	}
	public void setWJID(int wJID) {
		WJID = wJID;
	}
	public String getJGQC() {
		return JGQC;
	}
	public void setJGQC(String jGQC) {
		JGQC = jGQC;
	}
	public String getGKGLBM() {
		return GKGLBM;
	}
	public void setGKGLBM(String gKGLBM) {
		GKGLBM = gKGLBM;
	}
	public String getTXDZ() {
		return TXDZ;
	}
	public void setTXDZ(String tXDZ) {
		TXDZ = tXDZ;
	}
	public String getSZDY() {
		return SZDY;
	}
	public void setSZDY(String sZDY) {
		SZDY = sZDY;
	}
	public String getWZ() {
		return WZ;
	}
	public void setWZ(String wZ) {
		WZ = wZ;
	}
	public String getDZYX() {
		return DZYX;
	}
	public void setDZYX(String dZYX) {
		DZYX = dZYX;
	}
	public String getFRDB() {
		return FRDB;
	}
	public void setFRDB(String fRDB) {
		FRDB = fRDB;
	}
	public String getYZBM() {
		return YZBM;
	}
	public void setYZBM(String yZBM) {
		YZBM = yZBM;
	}
	public String getLXR() {
		return LXR;
	}
	public void setLXR(String lXR) {
		LXR = lXR;
	}
	public String getGDDH() {
		return GDDH;
	}
	public void setGDDH(String gDDH) {
		GDDH = gDDH;
	}
	public String getYDDH() {
		return YDDH;
	}
	public void setYDDH(String yDDH) {
		YDDH = yDDH;
	}
	public String getCZ() {
		return CZ;
	}
	public void setCZ(String cZ) {
		CZ = cZ;
	}
	public String getJGSX() {
		return JGSX;
	}
	public void setJGSX(String jGSX) {
		JGSX = jGSX;
	}
	public String getJGJJ() {
		return JGJJ;
	}
	public void setJGJJ(String jGJJ) {
		JGJJ = jGJJ;
	}
	public String getJSXQMC() {
		return JSXQMC;
	}
	public void setJSXQMC(String jSXQMC) {
		JSXQMC = jSXQMC;
	}
	public int getXQSX1() {
		return XQSX1;
	}
	public void setXQSX1(int xQSX1) {
		XQSX1 = xQSX1;
	}
	public int getXQSX2() {
		return XQSX2;
	}
	public void setXQSX2(int xQSX2) {
		XQSX2 = xQSX2;
	}
	public String getJSXQGS() {
		return JSXQGS;
	}
	public void setJSXQGS(String jSXQGS) {
		JSXQGS = jSXQGS;
	}
	public String getGJZ() {
		return GJZ;
	}
	public void setGJZ(String gJZ) {
		GJZ = gJZ;
	}
	public int getNTRZJZE() {
		return NTRZJZE;
	}
	public void setNTRZJZE(int nTRZJZE) {
		NTRZJZE = nTRZJZE;
	}//KJHDLX
	public String getJSXQJJFS() {
		return JSXQJJFS;
	}
	public void setJSXQJJFS(String jSXQJJFS) {
		JSXQJJFS = jSXQJJFS;
	}
	public String getHZYXDW() {
		return HZYXDW;
	}
	public void setHZYXDW(String hZYXDW) {
		HZYXDW = hZYXDW;
	}
	public String getKJHDLX() {
		return KJHDLX;
	}
	public void setKJHDLX(String kJHDLX) {
		KJHDLX = kJHDLX;
	}
	public String getXKFL() {
		return XKFL;
	}
	public void setXKFL(String xKFL) {
		XKFL = xKFL;
	}
	public String getXQJSSSLY() {
		return XQJSSSLY;
	}
	public void setXQJSSSLY(String xQJSSSLY) {
		XQJSSSLY = xQJSSSLY;
	}
	public String getXQJSYYHY() {
		return XQJSYYHY;
	}
	public void setXQJSYYHY(String xQJSYYHY) {
		XQJSYYHY = xQJSYYHY;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getDession() {
		return dession;
	}
	public void setDession(int dession) {
		this.dession = dession;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	
}
