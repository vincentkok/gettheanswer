package applicationservice.impl;

import applicationservice.AskQuestionApplicationService;

import com.getanswers.domain.model.Question;
import com.getanswers.domain.repository.QuestionRepository;

public class AskQuestionServiceImpl implements AskQuestionApplicationService {

	private QuestionRepository m_questionRepository;
	
	//Check with contract??
	@Override
	public Question askQuestion(String questionToAsk) {
		Question question = m_questionRepository.getObject(questionToAsk);
				
		
		//Just application logic to determine whether there will be a new one.
		//Asked for again is handled by the domain.
		if (question == null) {
			question = new Question(questionToAsk);
		} else {
			question.askedForAgain();
		}
		
		m_questionRepository.save(question);
		return question;
	}
}
