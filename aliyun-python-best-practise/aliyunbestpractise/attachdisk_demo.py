from aliyunsdkcore.client import AcsClient
from aliyunsdkecs.request.v20140526.AttachDiskRequest import AttachDiskRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = AttachDiskRequest()
request.set_InstanceId('ECS实例ID')
request.set_DiskId('数据盘ID')
response = client.do_action_with_exception(request)
print(response)
