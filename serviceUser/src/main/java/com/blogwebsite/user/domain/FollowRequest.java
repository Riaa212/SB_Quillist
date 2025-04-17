package com.blogwebsite.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//follow request { userid-other user sided which user sent to other user }
//				{  }
// follow request sent to the user 
//request sent from one to other user 

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FollowRequest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String status; //sent, followed,pending
	
	private Integer requestuserId;
}
