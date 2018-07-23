package io.javabrains.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicsService {

    private  List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("spring", "spring framework" , "spring framework description"),
                new Topic("java", "core java" , "core java description"),
                new Topic("spring boot", "spring boot framework" , "spring boot framework description"),
                new Topic()));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public Topic getTopic(String topicId) {
        return topics.stream().filter(t -> topicId.equals(t.getId())).findFirst().get();
    }

    public void addTopic(Topic newTopic) {
        topics.add(newTopic);
    }

    public void updateTopic(Topic topic, String topicId) {
        for(int i = 0; i < topics.size(); i++){
            if(topics.get(i).getId().equals(topicId)){
                topics.set(i, topic);
                return;
            }
        }
    }

    public void removeTopic(Topic topic, String topicId) {
        topics.removeIf(t -> t.getId().equals(topicId));
    }
}
