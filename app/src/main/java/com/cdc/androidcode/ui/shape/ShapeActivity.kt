package com.cdc.androidcode.ui.shape
import android.os.Bundle
import com.cdc.androidcode.BaseActivity
import com.cdc.androidcode.R

class ShapeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBackBtn()
        setTitle("shape")
        setContentView(R.layout.activity_shape)
    }
}
