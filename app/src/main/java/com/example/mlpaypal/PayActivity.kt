package com.example.mlpaypal

import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_pay)

        menu1 = findViewById(R.id.menu_1)
        menu2 = findViewById(R.id.menu_2)
        menu3 = findViewById(R.id.menu_3)
        editLayout1 = findViewById(R.id.edit_card_layout_1)
        editLayout2 = findViewById(R.id.edit_card_layout_2)
        editLayout3 = findViewById(R.id.edit_card_layout_3)
        exitEdit1 = findViewById(R.id.exit_1)
        exitEdit2 = findViewById(R.id.exit_2)
        exitEdit3 = findViewById(R.id.exit_3)

        menu1.setOnClickListener {
            menu1.visibility = View.GONE
            editLayout1.visibility = View.VISIBLE
        }

        menu2.setOnClickListener {
            menu2.visibility = View.GONE
            editLayout2.visibility = View.VISIBLE
        }

        menu3.setOnClickListener {
            menu3.visibility = View.GONE
            editLayout3.visibility = View.VISIBLE
        }

        exitEdit1.setOnClickListener {
            menu1.visibility = View.VISIBLE
            editLayout1.visibility = View.GONE
        }

        exitEdit2.setOnClickListener {
            menu2.visibility = View.VISIBLE
            editLayout2.visibility = View.GONE
        }

        exitEdit3.setOnClickListener {
            menu3.visibility = View.VISIBLE
            editLayout3.visibility = View.GONE
        }

    }

    private lateinit var menu1: ImageView
    private lateinit var menu2: ImageView
    private lateinit var menu3: ImageView
    private lateinit var exitEdit1: ImageView
    private lateinit var exitEdit2: ImageView
    private lateinit var exitEdit3: ImageView
    private lateinit var editLayout1: RelativeLayout
    private lateinit var editLayout2: RelativeLayout
    private lateinit var editLayout3: RelativeLayout

}