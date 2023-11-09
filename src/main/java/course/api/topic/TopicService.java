package course.api.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>( Arrays.asList(

                new Topic("spring", "spring Framework" , "Spring framework Description"),
                new Topic("java", "java Framework" , "jav framework Description"),
                new Topic("python", "django Framework" , "django framework Description")
        ));
    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    int r = 20;
}
