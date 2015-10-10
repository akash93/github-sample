package com.example.githubsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;

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
               bundle.put
          }
        }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {

          }
        })

      }
    });

  }
}
