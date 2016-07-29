package com.welink.commons.vo;

import java.util.Date;

public class MikuCsadEvaluateVO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Long userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.csad_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Long csadId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.csad_user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Long csadUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.csad_name
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private String csadName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.evaluate_note
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private String evaluateNote;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.evaluate_level
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Byte evaluateLevel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.version
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Long version;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.date_created
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Date dateCreated;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miku_mine_recentlycontact_log.last_updated
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    private Date lastUpdated;
    
    private String userNickName;
    
    private String emUserName;
    
    private String emUserPw;
    
    private String emCsadName;
    
    private String emCsadPw;
    
    private String userPicUrl;
    
    private String csadPicUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.id
     *
     * @return the value of miku_mine_recentlycontact_log.id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.id
     *
     * @param id the value for miku_mine_recentlycontact_log.id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.user_id
     *
     * @return the value of miku_mine_recentlycontact_log.user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.user_id
     *
     * @param userId the value for miku_mine_recentlycontact_log.user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.em_user_name
     *
     * @return the value of miku_mine_recentlycontact_log.em_user_name
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public String getEmUserName() {
        return emUserName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.em_user_name
     *
     * @param emUserName the value for miku_mine_recentlycontact_log.em_user_name
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setEmUserName(String emUserName) {
        this.emUserName = emUserName == null ? null : emUserName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.csad_id
     *
     * @return the value of miku_mine_recentlycontact_log.csad_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Long getCsadId() {
        return csadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.csad_id
     *
     * @param csadId the value for miku_mine_recentlycontact_log.csad_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setCsadId(Long csadId) {
        this.csadId = csadId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.csad_user_id
     *
     * @return the value of miku_mine_recentlycontact_log.csad_user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Long getCsadUserId() {
        return csadUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.csad_user_id
     *
     * @param csadUserId the value for miku_mine_recentlycontact_log.csad_user_id
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setCsadUserId(Long csadUserId) {
        this.csadUserId = csadUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.csad_name
     *
     * @return the value of miku_mine_recentlycontact_log.csad_name
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public String getCsadName() {
        return csadName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.csad_name
     *
     * @param csadName the value for miku_mine_recentlycontact_log.csad_name
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setCsadName(String csadName) {
        this.csadName = csadName == null ? null : csadName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.evaluate_note
     *
     * @return the value of miku_mine_recentlycontact_log.evaluate_note
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public String getEvaluateNote() {
        return evaluateNote;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.evaluate_note
     *
     * @param evaluateNote the value for miku_mine_recentlycontact_log.evaluate_note
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setEvaluateNote(String evaluateNote) {
        this.evaluateNote = evaluateNote == null ? null : evaluateNote.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.evaluate_level
     *
     * @return the value of miku_mine_recentlycontact_log.evaluate_level
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Byte getEvaluateLevel() {
        return evaluateLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.evaluate_level
     *
     * @param evaluateLevel the value for miku_mine_recentlycontact_log.evaluate_level
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setEvaluateLevel(Byte evaluateLevel) {
        this.evaluateLevel = evaluateLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.version
     *
     * @return the value of miku_mine_recentlycontact_log.version
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Long getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.version
     *
     * @param version the value for miku_mine_recentlycontact_log.version
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.date_created
     *
     * @return the value of miku_mine_recentlycontact_log.date_created
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.date_created
     *
     * @param dateCreated the value for miku_mine_recentlycontact_log.date_created
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miku_mine_recentlycontact_log.last_updated
     *
     * @return the value of miku_mine_recentlycontact_log.last_updated
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public Date getLastUpdated() {
        return lastUpdated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miku_mine_recentlycontact_log.last_updated
     *
     * @param lastUpdated the value for miku_mine_recentlycontact_log.last_updated
     *
     * @mbggenerated Wed Apr 20 17:38:01 CST 2016
     */
    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

	public String getEmUserPw() {
		return emUserPw;
	}

	public void setEmUserPw(String emUserPw) {
		this.emUserPw = emUserPw;
	}

	public String getEmCsadName() {
		return emCsadName;
	}

	public void setEmCsadName(String emCsadName) {
		this.emCsadName = emCsadName;
	}

	public String getEmCsadPw() {
		return emCsadPw;
	}

	public void setEmCsadPw(String emCsadPw) {
		this.emCsadPw = emCsadPw;
	}

	public String getUserPicUrl() {
		return userPicUrl;
	}

	public void setUserPicUrl(String userPicUrl) {
		this.userPicUrl = userPicUrl;
	}

	public String getCsadPicUrl() {
		return csadPicUrl;
	}

	public void setCsadPicUrl(String csadPicUrl) {
		this.csadPicUrl = csadPicUrl;
	}

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}
}