package com.example.mlpaypal

import android.content.Intent
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_main)

        detailCard = findViewById(R.id.detail_card)
        navigationView = findViewById(R.id.navigation)
        profile = findViewById(R.id.user_image_1)

        detailCard.setOnClickListener {
            val intent = Intent(this, CardsActivity::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, PayActivity::class.java)
            startActivity(intent)
        }
    }

    private lateinit var navigationView: BottomNavigationView
    private lateinit var detailCard: TextView
    private lateinit var profile: ImageView

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.dash_board -> {
//                putFragment(HomeFragment.newInstance())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_dashboard -> {
//                putFragment(DashboardFragment.newInstance())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_notifications -> {
//                putFragment(NotificationFragment.newInstance())
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }

}