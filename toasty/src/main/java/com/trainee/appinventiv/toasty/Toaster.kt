package com.trainee.appinventiv.toasty

import android.content.Context
import android.widget.Toast

class Toaster {
    companion object {
        fun simpleToast(message: String, context: Context) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}