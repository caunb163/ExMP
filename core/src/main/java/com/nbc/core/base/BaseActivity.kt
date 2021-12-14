package com.nbc.core.base

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

abstract class BaseActivity<ViewBinding: ViewDataBinding, ViewModel: BaseViewModel>: AppCompatActivity() {
    lateinit var viewBinding: ViewBinding

    lateinit var viewModel: ViewModel

    @get:LayoutRes
    abstract val layoutRes: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = DataBindingUtil.setContentView(this,layoutRes)

    }
}