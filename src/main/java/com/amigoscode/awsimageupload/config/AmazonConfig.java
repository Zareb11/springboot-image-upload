package com.amigoscode.awsimageupload.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

@Configuration
public class AmazonConfig {
	
	@Bean
	public AmazonS3 s3()
	{
		AWSCredentials awsCredentials = new BasicAWSCredentials(
				"AKIAYG2YHJQOJZ4HAZ5I",
				"FXbMsJ+x2hiqAtFPn8KCSRMPWB0tE5w+EqnJimwo"
				);
		
		return AmazonS3ClientBuilder
				.standard()
				.withRegion(Regions.EU_WEST_1)
				.withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
				.build();
	}

}
