package com.getanswers.applicationservice;

import com.getanswers.domain.model.Question;

public interface AskQuestionApplicationService {

	Question askQuestion(String question);
}
