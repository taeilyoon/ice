package com.tqeil.ice

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import devlight.io.library.ntb.NavigationTabBar
import android.graphics.Color.parseColor
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateView(parent: View?, name: String?, context: Context?, attrs: AttributeSet?): View {
        return super.onCreateView(parent, name, context, attrs)


    }


}
