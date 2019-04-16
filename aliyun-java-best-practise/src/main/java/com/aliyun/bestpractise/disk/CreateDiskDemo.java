package com.aliyun.bestpractise.disk;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.CreateDiskRequest;
import com.aliyuncs.ecs.model.v20140526.CreateDiskResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 为ECS创建数据盘
 */
public class CreateDiskDemo {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "RegionId",
                "accessKeyId",
                "accessKeySecret");
        IAcsClient client = new DefaultAcsClient(profile);
        CreateDiskRequest request = new CreateDiskRequest();
        //设置云盘所在区域
        request.setZoneId("cn-hangzhou-e");
        //设置云盘大小
        request.setSize(40);
        //设置云盘种类
        request.setDiskCategory("cloud_efficiency");
        CreateDiskResponse response;
        try {
            response =  client.getAcsResponse(request);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
