package com.kodilla.testing.forum.statistics;

public class StatisticPanel {

    public int numberOfUsers;
    public int numberOfPosts;
    public int numberOfComments;
    public double averageNumberOfPostsPerUser;
    public double averageNumberOfCommentsPerUser;
    public double averageNumberOfCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        this.numberOfUsers = statistics.usersNames().size();
        this.numberOfPosts = statistics.postsCount();
        this.numberOfComments = statistics.commentsCount();
        if (numberOfUsers != 0) {
            this.averageNumberOfPostsPerUser = (double) numberOfPosts / numberOfUsers;
            this.averageNumberOfCommentsPerUser = (double) numberOfComments / numberOfUsers;
        } else {
            this.averageNumberOfPostsPerUser = 0;
            this.averageNumberOfCommentsPerUser = 0;
        }
        if (numberOfPosts != 0) {
            this.averageNumberOfCommentsPerPost = (double) numberOfComments / numberOfPosts;
        } else {
            this.averageNumberOfCommentsPerPost = 0;
        }
    }

    public String showStatistics() {
        return "Number Of Users: " + numberOfUsers + "\n" +
                "Number Of Posts: " + numberOfPosts + "\n" +
                "Number Of Comments: " + numberOfComments + "\n" +
                "Average Number Of Posts Per User: " + averageNumberOfPostsPerUser + "\n" +
                "Average Number Of Comments Per User: " + averageNumberOfCommentsPerUser + "\n" +
                "Average Number Of Comments Per Post: " + averageNumberOfCommentsPerPost + "\n";
    }

}
