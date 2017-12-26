package com.lakala.util;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.lakala.dict.Dict;
import com.lakala.sign.DES;
import com.lakala.sign.RSA;
//import net.sf.json.JSONObject;

public class SignUtil {
	
	/*
	private static String koala_rsa_public_key ;
	private static String koala_des_key ;
	private static String rsa_private_key ;
	static{
		koala_rsa_public_key = ConfigurationManager.getProperty("kl.koala_rsa_public_key");
		koala_des_key = ConfigurationManager.getProperty("kl.koala_des_key");
		rsa_private_key = ConfigurationManager.getProperty("kl.rsa_private_key");
	}
	*/
	
	/**
	 * 加密并签名
	 * @param reqMap
	 * @return 加密和签名后的结果Map
	 */
    public static Map<String,String> getSign(Map<String ,String> reqMap,String koala_des_key,String rsa_private_key){
    	Map<String, String> data = new HashMap<String, String>();
    	JSONObject reqJson = (JSONObject) JSONObject.toJSON(reqMap);
		String reqData = reqJson.toString();
		System.out.println("转json后数据:"+reqData);
		try {
			 DES des=new DES(koala_des_key);
			 reqData=des.encrypt(reqData);
			data.put(Dict.REQDATA, reqData);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		data.put(Dict.SIGN, RSA.sign(reqData, rsa_private_key));
 		return data;	
    }
    
    /**
     * 根据反馈回来的信息，生成签名结果
     * @param Params 通知返回来的参数数组
     * @param sign 比对的签名结果
     * @return 生成的签名结果
     */
	public static Map<String,Object> getSignVeryfy(Map<String, Object> resMap,String koala_des_key,String koala_rsa_public_key) {
		String retData=String.valueOf(resMap.get(Dict.RETDATA));
        //获得签名验证结果
        boolean isSign = RSA.verify(retData,String.valueOf(resMap.get(Dict.SIGN)), koala_rsa_public_key);
        System.out.println("验证考拉签名结果:"+isSign);
        if(isSign){
        	DES des = new DES(koala_des_key);
    		try {
    			retData=des.decrypt(retData);
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		Map<String, Object> data = JSONObject.parseObject(retData);
    		return data;
        }else{
        	System.out.println("验证考拉签名失败");
        	return null;
        }
    }
}
