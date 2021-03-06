using System;
using System.Collections.Generic;
using Aliyun.Acs.Core;
using Aliyun.Acs.Core.Exceptions;
using Aliyun.Acs.Core.Profile;
using Aliyun.Acs.Ecs.Model.V20140526;

namespace EcsDemo
{
    class CreateDiskDemo
    {
        public static void CreateDisk()
        {
            IClientProfile profile = DefaultProfile.GetProfile(
              "cn-hangzhou", "<accessKeyId>", "<accessSecret>"
            );
            DefaultAcsClient client = new DefaultAcsClient(profile);

            var request = new RunInstancesRequest();
            request.ImageId = "创建实例的模板ID";
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