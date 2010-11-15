package nl.vincentkok.getanswers.applicationservice;

import nl.vincentkok.getanswers.domain.model.Question;

public interface AskQuestionApplicationService {

	Question askQuestion(String question);
}
