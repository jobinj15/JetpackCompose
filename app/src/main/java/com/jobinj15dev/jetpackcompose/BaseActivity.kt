package com.jobinj15dev.jetpackcompose

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        val rootView: View = findViewById(android.R.id.content)
        rootView.background = resources.getDrawable(R.drawable.kermit,theme)
    }

}