from aliyunsdkcore.client import AcsClient
from aliyunsdkecs.request.v20140526.CreateDiskRequest import CreateDiskRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = CreateDiskRequest()
request.set_ZoneId('cn-hangzhou-e')  # 设置云盘所在区域
request.set_Size(40)  # 设置云盘大小
request.set_DiskCategory("cloud_efficiency")  # 设置云盘种类
response = client.do_action_with_exception(request)
print(response)
