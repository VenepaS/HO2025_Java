package com.sparta.VenepaS.Zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ZookeeperTest {

    @Test
 public void testTalk() {
 Zookeeper zk = new Zookeeper("John", "2022-01-01", "Morning");
 assertEquals("Hello, I'm John, your zookeeper today!", zk.talk());
 }

 @Test
 public void testDaysEmployed() {
 Zookeeper zk = new Zookeeper("John", "2022-01-01", "Morning");
 assertTrue(zk.daysEmployed() > 0);
 }
@Test
 public void testDaysEmployed2() {
 Zookeeper zk = new Zookeeper("Mark", "2025-02-01", "Afternoon");
 assertEquals("Afternoon",zk.getShift());
}
}
