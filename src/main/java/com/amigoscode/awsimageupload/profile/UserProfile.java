package com.amigoscode.awsimageupload.profile;

import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class UserProfile {
	
	private final UUID userProfileId;
	private final String username;
	private String userProfileImageLink; //S3 key
	
	public UserProfile(UUID userProfileId, String username, String userProfileImageLink) {
		//super();
		this.userProfileId = userProfileId;
		this.username = username;
		this.userProfileImageLink = userProfileImageLink;
	}

	public UUID getUserProfileId() {
		return userProfileId;
	}


	public String getUsername() {
		return username;
	}


	public Optional<String> getUserProfileImageLink() {
		return Optional.ofNullable(userProfileImageLink);
	}

	public void setUserProfileImageLink(String userProfileImageLink) {
		this.userProfileImageLink = userProfileImageLink;
	}

	@Override
	public int hashCode() {
		return Objects.hash(userProfileId, userProfileImageLink, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		return Objects.equals(userProfileId, other.userProfileId)
				&& Objects.equals(userProfileImageLink, other.userProfileImageLink)
				&& Objects.equals(username, other.username);
	}
	
	

}
