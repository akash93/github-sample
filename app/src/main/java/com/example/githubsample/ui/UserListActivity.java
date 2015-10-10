package com.example.githubsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.githubsample.R;
import com.example.githubsample.model.User;
import com.example.githubsample.util.Constants;

import java.util.ArrayList;
import java.util.List;

public class UserListActivity extends AppCompatActivity {

  private static final String TAG = UserListActivity.class.getSimpleName();

  private List<User> mUserList;

  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_user_list);
    mUserList = new ArrayList<>();
    if(getIntent()!=null){
      Bundle bundle = getIntent().getBundleExtra(Constants.KEY_USER_LIST);
      mUserList = (ArrayList<User>) bundle.getSerializable(Constants.KEY_USER_LIST);
    };
    Toast.makeText(getApplicationContext(),"The size of the user list is "+mUserList.size(),Toast.LENGTH_SHORT).show();
  }
}
