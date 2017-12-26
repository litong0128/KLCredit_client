package com.lakala.config;

/**
 * 配置文件
 * @author wushaolin
 *
 */
public class Config {
	//考拉验证平台api接入测试环境地址（外网）
	public final static String KOALA_GATEWAY_NEW="http://1.202.150.5:9080/as/authentication.do?_t=json";
	
	//考拉验证平台api接入测试环境地址（内网）
//	public final static String KOALA_GATEWAY_NEW="http://10.5.19.26:9080/as/authentication.do?_t=json";
	
	//考拉验证平台api接入测试环境地址（生产）
	//public final static String KOALA_GATEWAY_NEW="https://access.kaolazhengxin.com:8453/authentication.do?_t=json";
	
	//客户号
	public final static String CUSTOMERID = "201703150000000001";
	
	//客户rsa私钥
	public final static String RSA_PRIVATE_KEY = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAKSag7TwM3gA03fQoJ75IaY6AmkVyOlZpTvi4EudH1fHMi8cStXbPhfYdjPK2bMCo9RxtnSadUju5CTzHS1+lHknJfY9L6OKPt/gzFzw/eHMerYeHNAPZTWqS6nR+0a9zZFRMFYyhhlcQ4z2Nj+/dj1waAI68EBb5Dmm4qe9KZ/BAgMBAAECgYAO7dS0PHTulWSYoVtwD7h1kx1U2pz2TSMnY1Rkh0OoenCaxT4kV1YyY3eVCvjju4GQax/ZQ4kPrFsU3tfuoGRm01t8l8X0NotYxCJZgCImOm9T/S29pZKljVIaJ5xfG96q9x7PWfva3stpNIv3UxPLcszv1KoZWy8GJkC2S4h2gQJBANTE8OC21uQ7xQM9v1my0M1B0cD9/OVt2YIkPNUqo9ZCgqdIply76qN2v7F5Sx3ldbZLiu8cGoDdyIYWNEXnI10CQQDGDEOVjq3KNXBWA905w2J1Kcy9hQjFWGNkzz5mT3xN+FRbnayzMl8wbr1ry0KKWK6iqk6SCJrGVfmv1ecNMSu1AkEAhAmLaghNJumogzBodOOxDA+SeW+k50PaPRb74VVKwwYXSnSdOOMs4zAoGZyp7u2ctPoASA5qrBn1/K/+1HpxyQJACOu0f6AVo+4USUuTQ27RmIVxe3fqlTkOARR0sxcRelGdOyM3DDtQnlXeomRdcu3br+gL8fgBQL3OqWTxK17zoQJAfpE+H98F5fUK4IL6L1VsPpp6UiUUtArgy40DDW/lwiZpvtuESQFaKl7/Ka0OFg9oL+aw4V/9qv452HHShldceQ==";
    
	//考拉rsa公钥
	public final static String KOALA_RSA_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCd3C/wwY3FvACUsI4oVzS8i1yBClXubMIbLIC0Z7xpH/pbB//Dkbu+SgMUs7rLocb4Y7g72ZjO4A20910kUg7aJJa/ua2mEJbM/FLLARmSc1PPwt2rwmj5ScEUuedD8VkyLcMtrUe7W0xwL5xplmuL4Ln4BSQ4VIjNlFR29qYjDQIDAQAB";
    
	//考拉des密钥
	public final static String KOALA_DES_KEY = "qC03Kj15";
	
	//字符集编码
	public final static String CHARSET = "UTF-8";
	
	//rsa算法
	public final static String RSA_ALGORITHM = "RSA";
	
	//考拉交易成功响应码
	public final static String SUCC_RETCODE = "000000";
	
}
