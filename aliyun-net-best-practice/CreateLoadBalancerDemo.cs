using System;
using System.Collections.Generic;
using Aliyun.Acs.Core;
using Aliyun.Acs.Core.Exceptions;
using Aliyun.Acs.Core.Profile;
using Aliyun.Acs.Slb.Model.V20140515;

namespace SlbDemo
{
    class CreateLoadBalancerDemo
    {
        public static void CreateLoadBalancer()
        {
            IClientProfile profile = DefaultProfile.GetProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
            DefaultAcsClient client = new DefaultAcsClient(profile);

            var request = new CreateLoadBalancerRequest();
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