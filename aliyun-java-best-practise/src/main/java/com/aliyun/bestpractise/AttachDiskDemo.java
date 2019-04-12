package com.aliyun.bestpractise;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.AttachDiskRequest;
import com.aliyuncs.ecs.model.v20140526.AttachDiskResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 为ECS挂载数据盘
 */
public class AttachDiskDemo {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "RegionId",
                "accessKeyId",
                "accessKeySecret");
        IAcsClient client = new DefaultAcsClient(profile);
        AttachDiskRequest request = new AttachDiskRequest();
        request.setDiskId("需要挂载的云盘ID");
        request.setInstanceId("被挂载的ECS实例ID");
        AttachDiskResponse response;
        try {
            response =  client.getAcsResponse(request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
