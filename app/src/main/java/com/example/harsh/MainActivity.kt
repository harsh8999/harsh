package com.example.harsh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val context = this
        button.setOnClickListener(){
            if(TName.text.toString().length > 0 && TAge.text.toString().length > 0){
                var user = User(TName.text.toString() , TAge.text.toString().toInt())
                var db = DatabaseHandler(context)
                db.insertData(user)
            }
            else{
                Toast.makeText(context,"Please Fill All Data.",Toast.LENGTH_SHORT).show()
            }
        }

    }
}

