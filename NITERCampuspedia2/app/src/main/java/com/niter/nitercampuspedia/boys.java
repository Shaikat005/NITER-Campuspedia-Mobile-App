package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import org.w3c.dom.Text;

public class boys extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boys);
        setContentView(R.layout.activity_boys);
        getSupportActionBar().setTitle("Boys Hostel");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textView=findViewById(R.id.txtview);
        String url = "https://shaikat005.000webhostapp.com/Room-207/bhos.json";

        JsonArrayRequest
                jsonArrayRequest
                = new JsonArrayRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {


                        try {
                            for(int i = 0; i< response.length();i++) {


                                JSONObject jsonObject = response.getJSONObject(i);
                                String id = jsonObject.getString("ID");
                                String notice = jsonObject.getString("Notice");

                                if(id.equals("1")){
                                    textView.append("Notice:1- "+notice + "\n\n");
                                } else if (id.equals("2")) {
                                    textView.append("Notice:2- "+notice + "\n\n");
                                } else if (id.equals("3")) {
                                    textView.append("Notice:3- "+notice + "\n\n");
                                }
                            }
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }


                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                        Toast.makeText(boys.this, "Network error..!", Toast.LENGTH_LONG).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(boys.this);
        requestQueue.add(jsonArrayRequest);
    }
}