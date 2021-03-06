package com.webapp.project.modules.section.model;
// Generated Oct 4, 2016 12:36:44 AM by Hibernate Tools 4.3.1.Final

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.webapp.project.modules.classes.model.Classes;
import com.webapp.project.modules.teacher.model.Teacher;

/**
 * Section generated by hbm2java
 */
@Entity
@Table(name = "SECTION")
public class Section implements java.io.Serializable {

	private Integer sectionId;
	private String section;
	private String category;
	private Integer capacity;
	 
	
	private Teacher teacher;
	
	
	private Classes classes;
	
	private String note;
	private Date createDate;
	private Date modifyDate;
	private int createUserId;
	private String createUsername;
	private String createUsertype;
		
	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "sectionID", unique = true, nullable = false)
	public Integer getSectionId() {
		return this.sectionId;
	}

	public void setSectionId(Integer sectionId) {
		this.sectionId = sectionId;
	}

	@Column(name = "section", nullable = false, length = 60)
	public String getSection() {
		return this.section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	@Column(name = "category", nullable = false, length = 128)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "note", length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_date", nullable = false, length = 19)
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "modify_date", nullable = false, length = 19)
	public Date getModifyDate() {
		return this.modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	@Column(name = "create_userID", nullable = false)
	public int getCreateUserId() {
		return this.createUserId;
	}

	public void setCreateUserId(int createUserId) {
		this.createUserId = createUserId;
	}

	@Column(name = "create_username", nullable = false, length = 40)
	public String getCreateUsername() {
		return this.createUsername;
	}

	public void setCreateUsername(String createUsername) {
		this.createUsername = createUsername;
	}

	@Column(name = "create_usertype", nullable = true, length = 20)
	public String getCreateUsertype() {
		return this.createUsertype;
	}

	public void setCreateUsertype(String createUsertype) {
		this.createUsertype = createUsertype;
	}

	@ManyToOne
	@JoinColumn(name = "teacherID")
	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@ManyToOne
	@JoinColumn(name = "classesID")
	public Classes getClasses() {
		return classes;
	}

	public void setClasses(Classes classes) {
		this.classes = classes;
	}
	
	@Column(name = "capacity", nullable = true)
	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	
	
	
}
