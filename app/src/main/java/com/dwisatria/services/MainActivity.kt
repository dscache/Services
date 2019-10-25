package com.dwisatria.services

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //button facebook
        btn_facebook.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com/dwisatrs"))
            startActivity(i)
        })

        //button instagram
        btn_instagram.setOnClickListener({
            val i = Intent(Intent.ACTION_VIEW,Uri.parse("http://www.instagram.com/iwdstr"))
            startActivity(i)
        })

        //variabel mediaplayer
        var MediaPlayer: MediaPlayer? = MediaPlayer.create(this,R.raw.sadmachine)
        //btn play
        btn_play.setOnClickListener{
            MediaPlayer?.start()
        }

        //btn pause
        btn_pause.setOnClickListener{
            MediaPlayer?.pause()
        }

        //btn stop
        btn_stop.setOnClickListener{
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        }
    }
}
