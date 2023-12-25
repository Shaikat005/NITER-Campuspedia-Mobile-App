package com.niter.nitercampuspedia;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
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

public class teacher extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        setContentView(R.layout.activity_teacher);
        getSupportActionBar().setTitle("Teacher's Room");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);


        String url = "https://shaikat005.000webhostapp.com/Room-207/table.json";
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
                                    String id = jsonObject.getString("Id");
                                    String room_no = jsonObject.getString("room_no");
                                    String teacher_name = jsonObject.getString("teacher_name");
                                    String title = jsonObject.getString("title");
                                    if(room_no.equals("102")){
                                        textView1.append(id+". "+teacher_name+"\n"+title+"\n");
                                    } else if (room_no.equals("104")) {
                                        textView2.append(id+". "+teacher_name+"\n"+title+"\n");
                                    } else if (room_no.equals("209")) {
                                        textView3.append(id+". "+teacher_name+"\n"+title+"\n");
                                    }else if (room_no.equals("211")) {
                                        textView4.append(id+". "+teacher_name+"\n"+title+"\n");
                                    }else if (room_no.equals("305")) {
                                        textView5.append(id+". "+teacher_name+"\n"+title+"\n");
                                    }else if (room_no.equals("201")) {
                                        textView6.append(id+". "+teacher_name+"\n"+title+"\n");
                                    }else if (room_no.equals("301")) {
                                        textView7.append(id+". "+teacher_name+"\n"+title+"\n");
                                    }else if (room_no.equals("207")) {
                                        textView8.append(id+". "+teacher_name+"\n"+title+"\n");
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

                        Toast.makeText(teacher.this, "Network error..!", Toast.LENGTH_SHORT).show();

                    }
                });
        RequestQueue requestQueue = Volley.newRequestQueue(teacher.this);
        requestQueue.add(jsonArrayRequest);

    }
}