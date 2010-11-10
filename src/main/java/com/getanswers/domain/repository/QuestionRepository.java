package com.getanswers.domain.repository;

import com.getanswers.domain.model.Question;

public interface QuestionRepository {

	Question getObject(String question);
	
	void save(Question q);
	
	void delete(Question q);
}
