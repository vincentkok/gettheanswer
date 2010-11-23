package nl.vincentkok.getanswer.domain.model;

import nl.vincentkok.getanswers.domain.model.Question;

import org.testng.Assert;
import org.testng.annotations.Test;


public class QuestionTest {

	private static final String HOW_LONG_IS_A_CHINESE = "How long is a chinese?";

	@Test
	public void createQuestionTest() {
		Question question = new Question(HOW_LONG_IS_A_CHINESE);
		Assert.assertEquals(question.getQuestion(), HOW_LONG_IS_A_CHINESE);
		Assert.assertEquals(question.getNrOfTimesAsked(), 0);
	}
	
	@Test
	public void askQuestionTest() {
		Question question = new Question(HOW_LONG_IS_A_CHINESE);
		question.ask();
		
		Assert.assertEquals(question.getNrOfTimesAsked(), 1);
	}
	
	//Add count per term
	//Add count per member
	//Different number of general searches and per search term per member status
} 