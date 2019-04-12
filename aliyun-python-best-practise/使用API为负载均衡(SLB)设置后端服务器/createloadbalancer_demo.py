from aliyunsdkcore.client import AcsClient
from aliyunsdkslb.request.v20140515.CreateLoadBalancerRequest import CreateLoadBalancerRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = CreateLoadBalancerRequest()
response = client.do_action_with_exception(request)
print(response)
