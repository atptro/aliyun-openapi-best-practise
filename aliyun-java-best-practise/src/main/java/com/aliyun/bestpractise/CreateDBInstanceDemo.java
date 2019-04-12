package com.aliyun.bestpractise;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.rds.model.v20140815.*;

/**
 * 使用API创建RDS实例
 */
public class CreateDBInstanceDemo {

    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("<regionId>", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CreateDBInstanceRequest request = new CreateDBInstanceRequest();
        request.setPayType("<payType>");
        request.setSecurityIPList("<securityIPList>");
        request.setDBInstanceNetType("<dBInstanceNetType>");
        // your dBInstanceStorage
        request.setDBInstanceStorage(0);
        request.setDBInstanceClass("<dBInstanceClass>");
        request.setEngineVersion("<engineVersion>");
        request.setEngine("<engine>");

        try {
            CreateDBInstanceResponse response = client.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
