package com.example.githubsample.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.example.githubsample.R;
import com.example.githubsample.model.User;
import com.example.githubsample.util.VolleyAppController;
import com.example.githubsample.util.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

  private static final String TAG = HomeActivity.class.getSimpleName();

  private Button getUsersBtn;


  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);

    getUsersBtn = (Button) findViewById(R.id.get_all_users_btn);
    getUsersBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        RequestQueue requestQueue = VolleyAppController.getInstance().getRequestQueue();
        String url = Constants.BASE_URL+"/users";
        JsonArrayRequest userRequest = new JsonArrayRequest(Request.Method.GET,
            url, new Response.Listener<JSONArray>() {
          @Override
          public void onResponse(JSONArray response) {
               Bundle bundle = new Bundle();
               ArrayList<User> userList = new ArrayList<User>();
               for (int i = 0 ; i<response.length();i++){
                 try {
                   JSONObject userObject = response.getJSONObject(i);
                   User user = new User(userObject);
                   userList.add(user);
                 } catch (JSONException e) {
                   Log.e(TAG,"Exception occured at index "+i );
                 }
               }
               bundle.putSerializable(Constants.KEY_USER_LIST,userList);


          }
        }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {

          }
        });

      }
    });

  }
}
