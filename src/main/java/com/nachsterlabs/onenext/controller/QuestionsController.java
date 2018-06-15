package com.nachsterlabs.onenext.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.nachsterlabs.onenext.bean.Questions;
import com.nachsterlabs.onenext.service.QuestionsService;

@RestController
@RequestMapping(value={"/api/questions"})
public class QuestionsController {
	

	    @Autowired
	    QuestionsService questionsService;

	   /* @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<Questions> getUserById(@PathVariable("id") long id) {
	        System.out.println("Fetching User with id " + id);
	        Questions questions = questionsService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        return new ResponseEntity<User>(user, HttpStatus.OK);
	    }
*/
	    @PostMapping(value="/create",headers="Accept=application/json")
	    public ResponseEntity<Void> createUser(@RequestBody Questions questions, UriComponentsBuilder ucBuilder){
	        System.out.println("Creating User "+questions.getQuestion());
	        questionsService.createQuestion(questions);
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/question/{id}").buildAndExpand(questions.getQuestionId()).toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }

	    @GetMapping(value="/get", headers="Accept=application/json")
	    public List<Questions> getAllQuestions() {
	        List<Questions> questions=questionsService.getQuestions();
	        return questions;

	    }

	  /*  @PutMapping(value="/update", headers="Accept=application/json")
	    public ResponseEntity<String> updateUser(@RequestBody User currentUser)
	    {
	        System.out.println("sd");
	        User user = userService.findById(currentUser.getId());
	        if (user==null) {
	            return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
	        }
	        userService.update(currentUser, currentUser.getId());
	        return new ResponseEntity<String>(HttpStatus.OK);
	    }

	    @DeleteMapping(value="/{id}", headers ="Accept=application/json")
	    public ResponseEntity<User> deleteUser(@PathVariable("id") long id){
	        User user = userService.findById(id);
	        if (user == null) {
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        userService.deleteUserById(id);
	        return new ResponseEntity<User>(HttpStatus.NO_CONTENT);
	    }

	    @PatchMapping(value="/{id}", headers="Accept=application/json")
	    public ResponseEntity<User> updateUserPartially(@PathVariable("id") long id, @RequestBody User currentUser){
	        User user = userService.findById(id);
	        if(user ==null){
	            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	        }
	        User usr = userService.updatePartially(currentUser, id);
	        return new ResponseEntity<User>(usr, HttpStatus.OK);
	    }*/

}
