Rate Limitter HLD 
1.fuctional Requirement :Request should be limited as per requirement,Client should be 429 error code if limit is hit ,Client identification should be there as per that rate limit is configured 
2. non functional requirement :high availability and 1 million request per second

Since we would be using http request we can identify client by authorization header , for ip address we can identify by x-forwarded for and for dev we can use x-api-key
algo -we can use time slot based like for particular time make window like in 1 min make 2 window each for 100 request and once limit is hit wait for other window to be created
or we can use token based let suppose we have token bucket and client has token limit of 100 onces the limit is hit wait for the token limit to be renewed again.
or by time frame window log time frame and set the limit onces the window is changes then start the limit again .

we can scale it by redis put in api gateway or load balancer layer since we need 1 million we have to create differend redis instance and for distributive and consistency use consistant hashing and mast slave concept for redis instance replica
and we can use shard and partioning 

when the system is dowm we can use fail open or fail close as per requirement .

for low latency make connection pool for tcp handshake .

Drop box :
client can upload file , sync the file share the file and download the file 

use CDN for downloading and caching the frequent visited data and cdn chooses closest server so low latency .
use api gateway and load balancer and authorizatoion at starting .
dont upload it directly through backend upload direnctly using predefined URL in S3 buckect directly and notify to meta data db no sql cassandra.
for file sync using polling and latest commit changes will be polled first and for local changes file watcher will check and uploaded to s3 if changes done .
for larger files using chunking means break file in chunk and s3 dont send each chuck to meta data its it send whole object so when chuck is uploaded client  get a etag and that tag is send to backend and updated in meta data than we can track the chunk status and till where it is uploaded .
and there is possiblilty there is duplicate upload of same file for that use sha fingerfrint to identify the the content ands store it in meta data .
for security use session based and in data base use encrypter use and by key only content is accessed .
use spearte share list with file and user in separate db .

now same yotube everything same as Dropbox but one extra things is video splitter whihc comes after transcoder where splits the video in different fromat and each fromat has multiple segement nd these segment is stored in manifest file and when video is played and version is selected as per the requirement the segment 1 is dowloaded and played and segment 2 is downloaded in background to avoid buffering and if net is slow 480 pe format  segment is switched automatically .and video splitter updates the manifest url to meta data .





message sending platform:
Data Flow:

1. user opens the whatsapp a websocket(request) goes to backend.

2. Backend service first check whether there is an existing open WS connector present or not. if present: return that, otherwise create a new one.

3. user1 send msg. send(msg, user1, user2)

2. chat service check redis, if user2 is active or not

3. if active it add the websocket server id in the message and push it the respective redis stream (channel)

4. if not service put push to the redis stream (channel) marking it as offline.

5. Send single tick notification to user1 6.

If user2 is online, chat server subscribe to the channel, consume that message and send it to receiver (user2)

7. On receiving user2 sends an acknowledgment event back to the chat server 8. Chat Svc send the delivery/read receipt event into the respective redis stream (channel) of the sender (user1)

9. Message Consumer Svc persist that delivery/read receipt and persist it on Chat DB 18. Incase of group message, Chat Svc check all the members from the group Svc, then check the redis cluster to check all the active online user, if online, then repeat send 3, otherwise repeat step 4

11. Once user comes after sometime, it first pull all the unread msg using the msg svc
