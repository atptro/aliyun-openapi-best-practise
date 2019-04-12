using System;
using System.Collections.Generic;
using Aliyun.Acs.Core;
using Aliyun.Acs.Core.Exceptions;
using Aliyun.Acs.Core.Profile;
using Aliyun.Acs.Ecs.Model.V20140526;

namespace EcsDemo
{
    class AttachDiskDemo
    {
        public static void AttachDisk()
        {
            IClientProfile profile = DefaultProfile.GetProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
            DefaultAcsClient client = new DefaultAcsClient(profile);

            var request = new CreateDiskRequest();
            
            //设置云盘所在区域
            request.ZoneId = "cn-hangzhou-e";
            //设置云盘大小
            request.Size = 40;
            //设置云盘种类
            request.DiskCategory = "cloud_efficiency";

            try {
                var response = client.GetAcsResponse(request);
                Console.WriteLine(System.Text.Encoding.Default.GetString(response.HttpResponse.Content));
            }
            catch (ServerException e)
            {
                Console.WriteLine(e);
            }
            catch (ClientException e)
            {
                Console.WriteLine(e);
            }
        }
    }
}