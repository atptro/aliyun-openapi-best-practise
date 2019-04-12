from aliyunsdkcore.client import AcsClient
from aliyunsdkecs.request.v20140526.RunInstancesRequest import RunInstancesRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = RunInstancesRequest()
request.set_LaunchTemplateId('创建实例的模板ID')
response = client.do_action_with_exception(request)
print(response)
