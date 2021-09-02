package com.example.mvc_pattern_ex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //플로팅 버튼 선언
        val fab = findViewById<FloatingActionButton>(R.id.floatingActionButton)
        fab.setOnClickListener {
            //버튼 클릭했을때
            //데이터 갱신 요청
            //Model에 접근해서 최신 데이터를 요청청
        }
    }
}