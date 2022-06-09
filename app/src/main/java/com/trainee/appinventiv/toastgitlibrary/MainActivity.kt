package com.trainee.appinventiv.toastgitlibrary
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.trainee.appinventiv.toasty.Toaster

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toaster.simpleToast("Hello",this)
    }
}