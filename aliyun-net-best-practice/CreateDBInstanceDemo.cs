using System;
using System.Collections.Generic;
using Aliyun.Acs.Core;
using Aliyun.Acs.Core.Exceptions;
using Aliyun.Acs.Core.Profile;
using Aliyun.Acs.Rds.Model.V20140815;

namespace RdsDemo
{
    class CreateDBInstanceDemo
    {
        public static void CreateDBInstance()
        {
            IClientProfile profile = DefaultProfile.GetProfile("cn-hangzhou", "<accessKeyId>", "<accessSecret>");
            DefaultAcsClient client = new DefaultAcsClient(profile);

            var request = new CreateDBInstanceRequest();
            request.Engine = "<engine>";
            request.EngineVersion = "<engineVersion>";
            request.DBInstanceClass = "<dBInstanceClass>";
            request.DBInstanceStorage = 2; // dBInstanceStorage should be modify to int
            request.DBInstanceNetType = "<dBInstanceNetType>";
            request.SecurityIPList = "<securityIPList>";
            request.PayType = "<payType>";
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