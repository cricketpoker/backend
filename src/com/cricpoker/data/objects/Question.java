package com.cricpoker.data.objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * This class hold the database representation 
 * of the question entity
 *
 */
@Entity
@Table(name = "questions")
public class Question {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="question_id")
	private int questionId;
	
	@Column(name="question_txt")
	private String questionText;
	
	@Column(name="question_type")
	private QuestionType questionType;
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="answer_format")
	private String answerFormat;
	
	@Column(name="match_id")
	private int matchId;
	
	@Column(name="bonus_factor")
	private int bonusFactor;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public QuestionType getQuestionType() {
		return questionType;
	}

	public void setQuestionType(QuestionType questionType) {
		this.questionType = questionType;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswerFormat() {
		return answerFormat;
	}

	public void setAnswerFormat(String answerFormat) {
		this.answerFormat = answerFormat;
	}

	public int getMatchId() {
		return matchId;
	}

	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}

	public int getBonusFactor() {
		return bonusFactor;
	}

	public void setBonusFactor(int bonusFactor) {
		this.bonusFactor = bonusFactor;
	}
}
