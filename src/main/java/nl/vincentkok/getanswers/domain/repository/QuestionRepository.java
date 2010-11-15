package nl.vincentkok.getanswers.domain.repository;

import nl.vincentkok.getanswers.domain.model.Question;

public interface QuestionRepository {

	Question getObject(String question);
	
	void save(Question q);
	
	void delete(Question q);
}
