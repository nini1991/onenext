package com.nachsterlabs.onenext.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tblQuestionsBank")
public class Questions {
	@Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="iQuestionId")
	  private long questionId;
	@NotNull
	@Column(name="BAreea")
	  private String area;
	@Column(name="vchQuestion")
	@NotNull
	  private String question;
	@Column(name="vchOpt1")
	@NotNull
	  private String opt_1;
	@Column(name="vchOpt2")
	@NotNull
	  private String opt_2;
	@Column(name="vchOpt3")
	@NotNull
	  private String opt_3;
	@Column(name="vchOpt4")
	@NotNull
	  private String opt_4;
	@Column(name="vchCorrectAns")
	@NotNull
	  private String correctAns;
	public long getQuestionId() {
		return questionId;
	}
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getOpt_1() {
		return opt_1;
	}
	public void setOpt_1(String opt_1) {
		this.opt_1 = opt_1;
	}
	public String getOpt_2() {
		return opt_2;
	}
	public void setOpt_2(String opt_2) {
		this.opt_2 = opt_2;
	}
	public String getOpt_3() {
		return opt_3;
	}
	public void setOpt_3(String opt_3) {
		this.opt_3 = opt_3;
	}
	public String getOpt_4() {
		return opt_4;
	}
	public void setOpt_4(String opt_4) {
		this.opt_4 = opt_4;
	}
	public String getCorrectAns() {
		return correctAns;
	}
	public void setCorrectAns(String correctAns) {
		this.correctAns = correctAns;
	}
	
	
	

}
