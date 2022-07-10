package com.lux.ex098preferencefragment

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.preference.PreferenceManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SettingFragment 를 동적 추가
        supportFragmentManager.beginTransaction().replace(R.id.container_fragment,SettingFragment()).commit()

        //저장된 설정값들 읽어오기
        loadPreference()
    }

    private fun loadPreference(){
        //SharedPreference 에 저장된 설정값들 가져오기
        val pref:SharedPreferences = PreferenceManager.getDefaultSharedPreferences(this)

        var isMessage:Boolean = pref.getBoolean("message",false)
        var isVibrate:Boolean= pref.getBoolean("vibration",false)

        Toast.makeText(this, "sound message : $isMessage \n vibration message : $isVibrate, ", Toast.LENGTH_SHORT).show()

    }
}