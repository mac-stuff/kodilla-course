package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @Test
    void testDefaultSharingStrategies() {

        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Silver");
        User kelly = new ZGeneration("Kelly Sanders");

        //When
        String stevenSharePost = steven.sharePost();
        System.out.println("Steven share post on: " + stevenSharePost);
        String johnSharePost = john.sharePost();
        System.out.println("John share post on: " + johnSharePost);
        String kellySharePost = kelly.sharePost();
        System.out.println("Kelly share post on: " + kellySharePost);

        //Then
        assertEquals("Facebook", stevenSharePost);
        assertEquals("Snapchat", johnSharePost);
        assertEquals("Twitter", kellySharePost);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenSharePost = steven.sharePost();
        System.out.println("Steven share post on: " + stevenSharePost);
        steven.setSocialPublisher(new SnapchatPublisher());
        stevenSharePost = steven.sharePost();
        System.out.println("Steven now share post on: " + stevenSharePost);

        //Then
        assertEquals("Snapchat", stevenSharePost);
    }
}