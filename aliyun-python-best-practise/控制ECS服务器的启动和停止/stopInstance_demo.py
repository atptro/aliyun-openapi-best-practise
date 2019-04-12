from aliyunsdkcore.client import AcsClient
from aliyunsdkecs.request.v20140526.StopInstanceRequest import StopInstanceRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = StopInstanceRequest()
request.set_InstanceId('ECS实例ID')
response = client.do_action_with_exception(request)
print(response)
