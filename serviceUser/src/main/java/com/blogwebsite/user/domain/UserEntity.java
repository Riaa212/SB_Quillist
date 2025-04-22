package com.blogwebsite.user.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")
public class UserEntity implements Serializable
{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String userName;
	private String password;
	private String email;
	
	@CreationTimestamp
	private Date createdAt;
	
	@UpdateTimestamp
	private Date updateAt;
	
//	private byte[] profilePhoto;
	
	private String otp;
	
	private String role;
	
	@Lob
	private String bio;
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="follow_id")
//	private Followers followers;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="followRequest_id")
	private FollowRequest followRequest;
	
	
//	private Integer totalRequest;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="user_id")
	//private List<BlogEntity> blog;
}
