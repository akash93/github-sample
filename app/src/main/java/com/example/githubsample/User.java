package com.example.githubsample;

import java.io.Serializable;

/**
 * Created by akash on 10/10/15.
 */
public class User implements Serializable {

  private String userName;
  private String userProfilePicUrl;
  private int userId;

  public User() {
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getUserProfilePicUrl() {
    return userProfilePicUrl;
  }

  public void setUserProfilePicUrl(String userProfilePicUrl) {
    this.userProfilePicUrl = userProfilePicUrl;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId = userId;
  }
}
