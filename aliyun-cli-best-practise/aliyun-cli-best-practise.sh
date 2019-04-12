# Before operating cloud products, must configure the profile:
aliyun configure set --profile <profileName> --access-key-id <AccessKeyID> --access-key-secret <AccessKeySecret> --mode AK --region <Region>

# The parameters of the following commands 
# only contain mandatory parameters.

#使用API创建ECS服务器
# RunInstances
$ aliyun ecs RunInstances --LaunchTemplateId <LaunchTemplateId>

#控制ECS服务器的启动和停止
# StartInstance
$ aliyun ecs StartInstance --InstanceId <InstanceId>

# StopInstance
$ aliyun ecs StopInstance --InstanceId <InstanceId>

#监控ECS机器的状态
# DescribeInstances
$ aliyun ecs DescribeInstances

#为ECS创建数据盘并挂载到服务器上
# CreateDisk	
$ aliyun ecs CreateDisk --region <RegionID> --ZoneId <ZoneId>

# AttachDisk
$ aliyun ecs AttachDisk --DiskId <DiskID> --InstanceId <InstanceId>

#使用API管理RDS实例
# CreateDBInstance
$ aliyun rds CreateDBInstance --DBInstanceClass <DBInstanceClass> --DBInstanceNetType <DBInstanceNetType> --DBInstanceStorage <DBInstanceStorage> --Engine <Engine> --EngineVersion <EngineVersion> --PayType <PayType> --SecurityIPList <SecurityIPList>

# DescribeDBInstances
$ aliyun rds DescribeDBInstanceAttribute --DBInstanceId <DBInstanceId>

#使用API为负载均衡(SLB)设置后端服务器
# CreateLoadBalancer
$ aliyun slb CreateLoadBalancer

# AddBackendServers 
$ aliyun slb AddBackendServers --LoadBalancerId <LoadBalancerId>