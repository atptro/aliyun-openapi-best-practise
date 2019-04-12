from aliyunsdkcore.client import AcsClient
from aliyunsdkrds.request.v20140815.DescribeDBInstancesRequest import DescribeDBInstancesRequest
client = AcsClient('access_key_id', 'access_key_secret', 'region_id')
request = DescribeDBInstancesRequest()
response = client.do_action_with_exception(request)
print(response)
