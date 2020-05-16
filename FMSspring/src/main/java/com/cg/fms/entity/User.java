package com.cg.fms.entity;

	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	

	@Entity
	
	@Table(name="user_tbl")
	public class User {
		
		@Id
		@Column(name="user_id")
		//@GeneratedValue(strategy = GenerationType.AUTO)
		@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="mygen")
		@SequenceGenerator(name="mygen",sequenceName="user_sequence",allocationSize=1)
		private int uid;
		
		@Column(name="user_name", length=25)
		private String userName;
		
		@Column(name="password", length=25)
		private String password;
		
		@Column(name="phone_no")
		private String phoneNo;

		
		
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		
		
		
	}


