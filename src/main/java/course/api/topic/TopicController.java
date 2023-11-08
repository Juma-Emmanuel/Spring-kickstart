package course.api.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
            new Topic("spring", "spring Framework" , "Spring framework Description"),
            new Topic("java", "java Framework" , "jav framework Description"),
            new Topic("spring", "spring Framework" , "Spring framework Description")
        );
	}

}
