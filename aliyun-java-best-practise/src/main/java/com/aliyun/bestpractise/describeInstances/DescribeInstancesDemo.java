package com.aliyun.bestpractise.describeInstances;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesRequest;
import com.aliyuncs.ecs.model.v20140526.DescribeInstancesResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.profile.DefaultProfile;

/**
 * 监控ECS机器的状态
 */
public class DescribeInstancesDemo {
    public static void main(String[] args) {
        DefaultProfile profile = DefaultProfile.getProfile(
                "RegionId",
                "accessKeyId",
                "accessKeySecret");
        IAcsClient client = new DefaultAcsClient(profile);
        DescribeInstancesRequest request = new DescribeInstancesRequest();
        DescribeInstancesResponse response;
        try {
            response = client.getAcsResponse(request);
            System.out.println(response);
        } catch (ClientException e) {
            e.printStackTrace();
        }
    }
}
