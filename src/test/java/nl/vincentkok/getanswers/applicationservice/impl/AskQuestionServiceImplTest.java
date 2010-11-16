package nl.vincentkok.getanswers.applicationservice.impl;

import nl.vincentkok.getanswers.domain.model.Question;
import nl.vincentkok.getanswers.domain.repository.QuestionRepository;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

/** */
public class AskQuestionServiceImplTest {

	private static final String QUESTION_STRING = "How are you?";
	private AskQuestionServiceImpl m_askQuestionServiceImpl;
	private QuestionRepository m_questionRepository;

	@BeforeMethod
	public void setup() {
		m_askQuestionServiceImpl = new AskQuestionServiceImpl();
		m_questionRepository = mock(QuestionRepository.class);
		m_askQuestionServiceImpl.setQuestionRepository(m_questionRepository);
	}
	
	/** */
	@Test
	public void askNewQuestion() {
		Question newlyAskedQuestion = m_askQuestionServiceImpl.askQuestion(QUESTION_STRING);
		Assert.assertEquals(newlyAskedQuestion.getNrOfTimesAsked(), 1);
		Assert.assertEquals(newlyAskedQuestion.getQuestion(), QUESTION_STRING);
	}
	
	/** */
	@Test
	public void askExistingQuestion() {
		Question questionToReturn = new Question(QUESTION_STRING);
		when(m_questionRepository.getObject(QUESTION_STRING)).thenReturn(questionToReturn);
		
		Question existingQuestion = m_askQuestionServiceImpl.askQuestion(QUESTION_STRING);
		
		Assert.assertEquals(existingQuestion, questionToReturn);
		Assert.assertEquals(existingQuestion.getNrOfTimesAsked(), 2);
		Assert.assertEquals(existingQuestion.getQuestion(), QUESTION_STRING);
	}
}
