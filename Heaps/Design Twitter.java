import java.util.*;

class Twitter {

    private static int time = 0;

    class Tweet {
        int id;
        int time;
        Tweet next;

        Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    Map<Integer, Set<Integer>> followMap;
    Map<Integer, Tweet> tweetMap;

    public Twitter() {
        followMap = new HashMap<>();
        tweetMap = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        Tweet t = new Tweet(tweetId, time++);
        t.next = tweetMap.get(userId);
        tweetMap.put(userId, t);
    }

    public List<Integer> getNewsFeed(int userId) {
        PriorityQueue<Tweet> pq = new PriorityQueue<>((a, b) -> b.time - a.time);
        followMap.putIfAbsent(userId, new HashSet<>());
        followMap.get(userId).add(userId);

        for (int followee : followMap.get(userId)) {
            if (tweetMap.containsKey(followee)) {
                pq.add(tweetMap.get(followee));
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!pq.isEmpty() && res.size() < 10) {
            Tweet t = pq.poll();
            res.add(t.id);
            if (t.next != null) pq.add(t.next);
        }
        return res;
    }

    public void follow(int followerId, int followeeId) {
        followMap.putIfAbsent(followerId, new HashSet<>());
        followMap.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followMap.containsKey(followerId) && followeeId != followerId) {
            followMap.get(followerId).remove(followeeId);
        }
    }
}
