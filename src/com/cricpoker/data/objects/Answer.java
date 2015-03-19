package com.cricpoker.data.objects;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;

/**
 * This class hold the database representation 
 * of the user's answer entity
 *
 */
@Entity
@Table(name = "user_answers")
public class Answer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_answer_id")
	private int userAnswerId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="question_id")
	private int questionId;
	
	@Column(name="answer")
	private String answer;
	
	@Column(name="answer_time")
	private Date answerDate;
	
	@Column(name="is_current")
	private boolean isCurrent;
	
	@Column(name="is_locked")
	private boolean isLocked;
	
	@Column(name="bet_points")
	private int betPoints;
	
	@Column(name="won_points")
	private int wonPoints;

	public int getUserAnswerId() {
		return userAnswerId;
	}

	public void setUserAnswerId(int userAnswerId) {
		this.userAnswerId = userAnswerId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public DateTime getAnswerDate() {
		return new DateTime(answerDate);
	}

	public void setAnswerDate(DateTime answerDate) {
		this.answerDate = new Date(answerDate.getMillis());
	}

	public boolean isCurrent() {
		return isCurrent;
	}

	public void setCurrent(boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public int getBetPoints() {
		return betPoints;
	}

	public void setBetPoints(int betPoints) {
		this.betPoints = betPoints;
	}

	public int getWonPoints() {
		return wonPoints;
	}

	public void setWonPoints(int wonPoints) {
		this.wonPoints = wonPoints;
	}
	
}
