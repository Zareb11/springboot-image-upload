package com.amigoscode.awsimageupload.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.amigoscode.awsimageupload.profile.UserProfile;

@Repository
public class FakeUserProfileDataStore {
	
	private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
	
	
	static {
		USER_PROFILES.add(new UserProfile(UUID.fromString("9514a639-e22b-4839-80f7-5f1fa40579aa"), "janetjones", null));
		USER_PROFILES.add(new UserProfile(UUID.fromString("7a19f053-465e-4336-825d-afcad67e52b9"), "antoniojunior", null));
	}
	
	public List<UserProfile> getUserProfiles()
	{
		return USER_PROFILES;
	}

}
