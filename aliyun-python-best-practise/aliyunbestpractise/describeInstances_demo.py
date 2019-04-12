from aliyunsdkcore.client import AcsClient
from aliyunsdkecs.request.v20140526.DescribeInstancesRequest import DescribeInstancesRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = DescribeInstancesRequest()
response = client.do_action_with_exception(request)
print(response)