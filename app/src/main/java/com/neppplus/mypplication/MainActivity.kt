package com.neppplus.mypplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar
import androidx.databinding.DataBindingUtil
import com.neppplus.mypplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var nearIcon : ImageView
    lateinit var searchBtn : ImageView
    lateinit var titleTxt : TextView
    lateinit var reviewPageActionBarLayout : LinearLayout
    lateinit var nickNameTxt : TextView
    lateinit var backBtn : ImageView
    lateinit var homeBtn : ImageView
    lateinit var cartBtn : ImageView
    lateinit var settingBtn : ImageView

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val defActionBar = supportActionBar!!
        defActionBar.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        defActionBar.setCustomView(R.layout.custom_action_bar)

        val toolbar = defActionBar.customView.parent as Toolbar
        toolbar.setContentInsetsAbsolute(0,0)

        titleTxt = defActionBar.customView.findViewById(R.id.titleTxt)
        reviewPageActionBarLayout = defActionBar.customView.findViewById(R.id.reviewPageActionBarLayout)
        nickNameTxt = defActionBar.customView.findViewById(R.id.nickNameTxt)
        settingBtn = defActionBar.customView.findViewById(R.id.settingBtn)

        settingBtn.visibility = View.VISIBLE
        settingBtn.setOnClickListener {
            binding.mainDrawerLayout.open()
        }
    }
}