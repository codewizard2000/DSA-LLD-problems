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

