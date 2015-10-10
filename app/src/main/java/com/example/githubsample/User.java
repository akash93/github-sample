package com.example.githubsample;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by akash on 10/10/15.
 */
public class User implements Serializable {

  private static final String TAG = User.class.getSimpleName();

  private String userName;
  private String userProfilePicUrl;
  private int userId;

  public User() {
  }

  public User(JSONObject userObject) throws JSONException{
      userName = userObject.getString(Constants.KEY_USER_NAME);
      userProfilePicUrl = userObject.getString(Constants.KEY_USER_PROFILE_PIC_URL);
      userId = userObject.getInt(Constants.KEY_USER_ID);
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
