package com.aliyun.bestpractise.slb;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.slb.model.v20140515.*;

/**
 * 使用API为负载均衡(SLB)设置后端服务器
 */
public class CreateLoadBalancerDemo {

    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile("<regionId>", "<accessKeyId>", "<accessSecret>");
        IAcsClient client = new DefaultAcsClient(profile);

        CreateLoadBalancerRequest request = new CreateLoadBalancerRequest();

        try {
            CreateLoadBalancerResponse response = client.getAcsResponse(request);
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            System.out.println("ErrCode:" + e.getErrCode());
            System.out.println("ErrMsg:" + e.getErrMsg());
            System.out.println("RequestId:" + e.getRequestId());
        }

    }
}
