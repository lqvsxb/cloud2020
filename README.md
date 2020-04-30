####zookeeper配置文件
/config 文件夹下配置文件改名为zoo.cfg

# The number of milliseconds of each tick
#tickTime：这个时间是作为 Zookeeper 服务器之间或客户端与服务器之间维持心跳的时间间隔，也就是每个 tickTime 时间就会发送一个心跳。
#默认情况下最小的会话超时时间为两倍的tickTime
tickTime=2000
# The number of ticks that the initial 
# synchronization phase can take
#zookeeper集群中的包含多台server, 其中一台为leader, 集群中其余的server为follower. initLimit参数配置初始化连接时, 
#follower和leader之间的最长心跳时间. 此时该参数设置为5, 说明时间限制为5倍tickTime, 即5*2000=10000ms=10s.
initLimit=5
# The number of ticks that can pass between 
# sending a request and getting an acknowledgement
#该参数配置leader和follower之间发送消息, 请求和应答的最大时间长度. 此时该参数设置为2, 说明时间限制为2倍tickTime, 即4000ms.
syncLimit=2
# the directory where the snapshot is stored.
# do not use /tmp for storage, /tmp here is just 
# example sakes.
#dataDir：顾名思义就是 Zookeeper 保存数据的目录，默认情况下，Zookeeper 将写数据的日志文件也保存在这个目录里。
dataDir=D:\\zookeeper-3.4.8\\data
#dataLogDir：顾名思义就是 Zookeeper 保存日志文件的目录
dataLogDir=D:\\zookeeper-3.4.8\\log
# the port at which the clients will connect
#clientPort：这个端口就是客户端连接 Zookeeper 服务器的端口，Zookeeper 会监听这个端口，接受客户端的访问请求。
clientPort=2181
# the maximum number of client connections.
# increase this if you need to handle more clients
#maxClientCnxns：限制连接到 ZooKeeper 的客户端的数量
#maxClientCnxns=60
#
# Be sure to read the maintenance section of the 
# administrator guide before turning on autopurge.
#
# http://zookeeper.apache.org/doc/current/zookeeperAdmin.html#sc_maintenance
#
# The number of snapshots to retain in dataDir
#autopurge.snapRetainCount=3
# Purge task interval in hours
# Set to "0" to disable auto purge feature
