package com.aliyun.bestpractise;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.google.gson.Gson;
import com.aliyuncs.slb.model.v20140515.*;

/**
 * 使用API为负载均衡(SLB)设置后端服务器
 */
public class AddBackendServersDemo {

    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("<regionId>", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        AddBackendServersRequest request = new AddBackendServersRequest();
        request.setBackendServers("<backendServers>");
        request.setLoadBalancerId("<loadBalancerId>");

        try {
            AddBackendServersResponse response = client.getAcsResponse(request);
            System.out.println(new Gson().toJson(response));
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
