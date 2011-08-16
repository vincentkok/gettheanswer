package nl.vincentkok.getanswers.domain.model;


/**
 * 
 * TODO: What will go in what
 * 
 *  - Question
 *  - Answer
 *  - Member (Free, Silver, Gold)
 *  - Search on Ansers
 *  - Rewards for giving answers
 *  - 
 *  
 *  * Value objects -> Hoe deal with an collection and removing one. Basiaccly how to persist?
 *  * Aggregates
 *  
 *  
 *  * Explicit constraints -> max 255 size question
 *  * Strategy == Policy -> Only gold member can search on where can I find gold
 *  ** Silver member can search only once a day
 * 	* Specification -> all top questions ..
 *  * Listen to searches. I'm interested in searches..
 * 
 * 
 * 
 *  * Intention revealing interface
 *  * Side Effect Free functions
 *  * Assertions
 *  
 *  * Start with test
 * 
 * @author vkok
 *
 */
public class Question {
	
	private final long m_id;
	
	private final String m_question;
	
	private int m_nrOfTimesAsked;

	public Question(String question) {
		super();
		m_id = 1;
		m_question = question;
		m_nrOfTimesAsked = 0;
	}

	public long getId() {
		return m_id;
	}

	public String getQuestion() {
		return m_question;
	}

	public int getNrOfTimesAsked() {
		return m_nrOfTimesAsked;
	}
	
	public void ask() {
		m_nrOfTimesAsked++;
	}
}
