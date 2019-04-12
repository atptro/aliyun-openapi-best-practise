package com.aliyun.bestpractise;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.StartInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.StartInstanceResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 控制ECS服务器的启动
 */
public class StartInstanceDemo {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "RegionId",
                "accessKeyId",
                "accessKeySecret");
        IAcsClient client = new DefaultAcsClient(profile);
        StartInstanceRequest request = new StartInstanceRequest();
        request.setInstanceId("ECS实例id");
        StartInstanceResponse response;
        try {
            response =  client.getAcsResponse(request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
