package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StatisticPanelTest {

    private static StatisticPanel statisticPanel;

    @BeforeAll
    public static void beforeAllTests() {
        statisticPanel = new StatisticPanel();
    }

    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsWhenNumberOfPostsIs0() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(0);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = statisticsMock.postsCount();

        //Then
        assertEquals(0, numberOfPosts);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfPostsIs1000() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(1000);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfPosts = statisticsMock.postsCount();

        //Then
        assertEquals(1000, numberOfPosts);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIs0() {
        // Given
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfComments = statisticsMock.commentsCount();

        //Then
        assertEquals(0, numberOfComments);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIsLowerThanNumbersOfPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(10);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfCommentsPerPost = statisticPanel.averageNumberOfCommentsPerPost;

        //Then
        assertEquals(0.1, averageNumberOfCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfCommentsIsBiggerThanNumbersOfPosts() {
        // Given
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(100);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        double averageNumberOfCommentsPerPost = statisticPanel.averageNumberOfCommentsPerPost;

        //Then
        assertEquals(10.00, averageNumberOfCommentsPerPost);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfUsersIs0() {
        // Given
        List<String> usersNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsers = statisticPanel.numberOfUsers;

        //Then
        assertEquals(0, numberOfUsers);
    }

    @Test
    void testCalculateAdvStatisticsWhenNumberOfUsersIs10() {
        // Given
        List<String> usersNames = new ArrayList<>();
        usersNames.add("Anna");
        usersNames.add("Beata");
        usersNames.add("Celina");
        usersNames.add("Dorota");
        usersNames.add("Eliza");
        usersNames.add("Anna");
        usersNames.add("Beata");
        usersNames.add("Celina");
        usersNames.add("Dorota");
        usersNames.add("Eliza");
        when(statisticsMock.usersNames()).thenReturn(usersNames);
        statisticPanel.calculateAdvStatistics(statisticsMock);

        //When
        int numberOfUsers = statisticPanel.numberOfUsers;

        //Then
        assertEquals(10, numberOfUsers);
    }
}