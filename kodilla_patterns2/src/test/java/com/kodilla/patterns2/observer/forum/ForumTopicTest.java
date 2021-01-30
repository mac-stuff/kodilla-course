package com.kodilla.patterns2.observer.forum;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ForumTopicTest {

    @Test
    public void testUpdate() {
        // Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivonneEscobar= new ForumUser("Ivonne Escobar");
        ForumUser jessieLinkman = new ForumUser("Jessie Linkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivonneEscobar);
        javaHelpForum.registerObserver(jessieLinkman);
        javaToolsForum.registerObserver(jessieLinkman);

        // When
        javaHelpForum.addPost("Hi everyone! Could you help me with for loop?");
        javaHelpForum.addPost("Better try to use while loop in this case.");
        javaToolsForum.addPost("Help pls, my MySQL db doesn't want to work :(");
        javaHelpForum.addPost("Why while? Is it better?");
        javaToolsForum.addPost("When I try to log in I got 'bad credentials' message");
        // Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, ivonneEscobar.getUpdateCount());
        assertEquals(5, jessieLinkman.getUpdateCount());
    }
}
