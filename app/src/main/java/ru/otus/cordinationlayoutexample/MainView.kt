package ru.otus.cordinationlayoutexample

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.Toolbar


class MainView(context: Context, attrs: AttributeSet) : FrameLayout(context, attrs) {
    init {
        LayoutInflater.from(context).inflate(R.layout.main_view, this)
        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.toolbar)
        val activity = context as MainActivity
        activity.setSupportActionBar(toolbar)

    }
}
