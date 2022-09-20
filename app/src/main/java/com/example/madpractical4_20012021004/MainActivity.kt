package com.example.madpractical4_20012021004

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//     Browse Button
        val buttonBrowse = findViewById<Button>(R.id.button_browse)
        buttonBrowse.setOnClickListener {
//            val editText1 = findViewById<TextInputEditText>(R.id.edit_text_web_url)
//        val url = editText1.text
            Intent(Intent.ACTION_VIEW).setData(Uri.parse("https://sites.google.com/ganpatuniversity.ac.in/mad/home")).apply { startActivity(this) }
        }

        //  Call Button
        val buttonCall = findViewById<Button>(R.id.button_Call)
        buttonCall.setOnClickListener {
//            val editText2 = findViewById<TextInputEditText>(R.id.edit_text_call_number)
//            val number = editText2.text.toString()
            Intent(Intent.ACTION_DIAL).setData(Uri.parse("tel:9724670034")).apply { startActivity(this) }
        }

//      Contact Button
        val buttoncontact = findViewById<Button>(R.id.button_Contact)
        buttoncontact.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(ContactsContract.Contacts.CONTENT_TYPE).apply { startActivity(this) }
        }

//      Call Log Button
        val buttoncalllog = findViewById<Button>(R.id.button_Call_Log)
        buttoncalllog.setOnClickListener {
            Intent(Intent.ACTION_VIEW).setType(CallLog.Calls.CONTENT_TYPE).apply { startActivity(this) }
        }

//      Gallery Button
        val buttongallery = findViewById<Button>(R.id.button_Gallery)
        buttongallery.setOnClickListener{
            Intent(Intent.ACTION_VIEW).setType("image/*").apply { startActivity(this) }
        }

//      Camera Button
        val buttoncamera = findViewById<Button>(R.id.button_Camera)
        buttoncamera.setOnClickListener {
            Intent(MediaStore.ACTION_IMAGE_CAPTURE).apply { startActivity(this) }
        }

//      Alarm Button
        val buttonalarm = findViewById<Button>(R.id.button_Alarm)
        buttonalarm.setOnClickListener {
            Intent(AlarmClock.ACTION_SHOW_ALARMS).apply { startActivity(this) }

        }
    }
}