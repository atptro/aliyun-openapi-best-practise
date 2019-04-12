package com.aliyun.bestpractise;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.StopInstanceRequest;
import com.aliyuncs.ecs.model.v20140526.StopInstanceResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 控制ECS服务器的停止
 */
public class StopInstanceDemo {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "RegionId",
                "accessKeyId",
                "accessKeySecret");
        IAcsClient client = new DefaultAcsClient(profile);
        StopInstanceRequest request = new StopInstanceRequest();
        request.setInstanceId("ECS实例id");
        StopInstanceResponse response;
        try {
            response =  client.getAcsResponse(request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
