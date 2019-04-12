# Before operating cloud products, must configure the profile:
aliyun configure set --profile <profileName> --access-key-id <AccessKeyID> --access-key-secret <AccessKeySecret> --mode AK --region <Region>

# The parameters of the following commands 
# only contain mandatory parameters.

# RunInstances
$ aliyun ecs RunInstances --LaunchTemplateId <LaunchTemplateId>

# StartInstance
$ aliyun ecs StartInstance --InstanceId <InstanceId>

# StopInstance
$ aliyun ecs StopInstance --InstanceId <InstanceId>

# DescribeInstances
$ aliyun ecs DescribeInstances

# CreateDisk	
$ aliyun ecs CreateDisk --region <RegionID> --ZoneId <ZoneId>

# AttachDisk
$ aliyun ecs AttachDisk --DiskId <DiskID> --InstanceId <InstanceId>

# CreateDBInstance
$ aliyun rds CreateDBInstance --DBInstanceClass <DBInstanceClass> --DBInstanceNetType <DBInstanceNetType> --DBInstanceStorage <DBInstanceStorage> --Engine <Engine> --EngineVersion <EngineVersion> --PayType <PayType> --SecurityIPList <SecurityIPList>

# DescribeDBInstances
$ aliyun rds DescribeDBInstanceAttribute --DBInstanceId <DBInstanceId>

# CreateLoadBalancer
$ aliyun slb CreateLoadBalancer

# AddBackendServers
$ aliyun slb AddBackendServers --LoadBalancerId <LoadBalancerId>