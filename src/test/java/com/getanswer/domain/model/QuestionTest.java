package com.getanswer.domain.model;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.getanswers.domain.model.Question;

public class QuestionTest {

	private static final String HOW_LONG_IS_A_CHINESE = "How long is a chinese?";

	@Test
	public void createQuestionTest() {
		Question question = new Question(HOW_LONG_IS_A_CHINESE);
		Assert.assertEquals(question.getQuestion(), HOW_LONG_IS_A_CHINESE);
		Assert.assertEquals(question.getNrOfTimesAsked(), 1);
	}
	
	@Test
	public void increaseCountTest() {
		Question question = new Question(HOW_LONG_IS_A_CHINESE);
		question.askedForAgain();
		
		Assert.assertEquals(question.getNrOfTimesAsked(), 2);
	}
	
	//Add count per term
	//Add count per member
	//Different number of general searches and per search term per member status
} 