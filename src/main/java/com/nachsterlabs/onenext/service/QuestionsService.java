package com.nachsterlabs.onenext.service;

import java.util.List;

import com.nachsterlabs.onenext.bean.Questions;


public interface QuestionsService {

	
	    public void createQuestion(Questions questions);
	    public List<Questions> getQuestions();
	   // public Questions findOne(long id);
	   // public Questions update(Questions questions, long l);
	   // public void deleteQuestionById(long id);
	  //  public Questions updatePartially(Questions questions, long id);
	
}
