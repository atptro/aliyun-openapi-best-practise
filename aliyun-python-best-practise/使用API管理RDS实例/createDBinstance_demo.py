from aliyunsdkcore.client import AcsClient
from aliyunsdkrds.request.v20140815.CreateDBInstanceRequest import CreateDBInstanceRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = CreateDBInstanceRequest()
request.set_PayType("Postpaid")
request.set_SecurityIPList("10.23.12.27/25")
request.set_DBInstanceNetType("Internet")
request.set_DBInstanceStorage("20")
request.set_DBInstanceClass("rds.mysql.t1.small")
request.set_EngineVersion("5.6")
request.set_Engine("MySQL")
response = client.do_action_with_exception(request)
print(response)
