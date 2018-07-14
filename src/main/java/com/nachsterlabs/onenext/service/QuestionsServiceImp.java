package com.nachsterlabs.onenext.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nachsterlabs.onenext.bean.Questions;
import com.nachsterlabs.onenext.repository.QuestionsRepository;
@Service
@Transactional

public class QuestionsServiceImp implements QuestionsService {
	 @Autowired
	    QuestionsRepository questionsRepository;

	@Override
	public void createQuestion(Questions questions) {
		questionsRepository.save(questions);
	}

	@Override
	public List<Questions> getQuestions() {
		// TODO Auto-generated method stub
		  return (List<Questions>) questionsRepository.findAll();
		
	}

	/*@Override
	public Questions findOne(long id) {
		// TODO Auto-generated method stub
		  
        return questionsRepository.findById(id);
	}*/

	/*@Override
	public Questions update(Questions questions, long l) {
		// TODO Auto-generated method stub
		 return questionsRepository.save(questions);
	}

	@Override
	public void deleteQuestionById(long id) {
		// TODO Auto-generated method stub
		questionsRepository.deleteById(id);
		
	}

	@Override
	public Questions updatePartially(Questions questions, long id) {
		// TODO Auto-generated method stub
		Questions qus = findById(id);
		qus.setArea(questions.getArea());
        return questionsRepository.save(usr);
	}*/

	
}
