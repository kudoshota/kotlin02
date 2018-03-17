package com.example.marbl.kotlin02

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var isTextVisible = false

        button.setOnClickListener{
            if(isTextVisible == false) {    // テキストが非表示の場合は表示する
                text.visibility = View.VISIBLE
                isTextVisible = true
            }
            else{   // // テキストが表示している場合は非表示にする
                text.visibility = View.INVISIBLE
                isTextVisible = false
            }
        }
    }
}
