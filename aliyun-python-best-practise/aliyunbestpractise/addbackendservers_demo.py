from aliyunsdkcore.client import AcsClient
from aliyunsdkslb.request.v20140515.AddBackendServersRequest import AddBackendServersRequest

client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = AddBackendServersRequest()
request.set_LoadBalancerId('SLB实例ID')
request.set_BackendServers([{"ServerId": "ECS实例ID", "Weight": "100"}, ])
response = client.do_action_with_exception(request)
print(response)
