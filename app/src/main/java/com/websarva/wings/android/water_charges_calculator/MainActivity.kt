package com.websarva.wings.android.water_charges_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //初期化
        initProcess()

    }

    //初期化
    private fun initProcess() {
        //部屋番号コンボボックスに値をセット
        val roomSpinner: Spinner = findViewById(R.id.roomNumber_spinner)
        ArrayAdapter.createFromResource(
            this,
            R.array.roomNumber_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            roomSpinner.adapter = adapter
        }
    }
}

