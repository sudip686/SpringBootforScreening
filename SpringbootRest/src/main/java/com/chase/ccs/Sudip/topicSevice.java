package com.chase.ccs.Sudip;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class topicSevice {
	@Autowired
	private TopicRepository topicRepository;

	public List<Topic> getAllTopic() {
		List<Topic> topics = new ArrayList<>();

		topicRepository.findAll().forEach(topics::add);
		return topics;
	}

	public Topic getTopicbyID(long id) {
		return topicRepository.findOne(id);

	}

	public void createTopic(Topic topic) {
		topicRepository.save(topic);

	}

	public void updateTopic(long id, Topic topic) {
		topicRepository.save(topic);

	}
	public void deleteTopic(long id) {
		topicRepository.delete(id);

	}
}
