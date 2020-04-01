package com.ashlikun.core.simple

import android.util.Log
import com.ashlikun.core.fragment.BaseFragment

class MainFragment : BaseFragment() {

    override fun getLayoutId(): Int {
        Log.e("MainFragment", "getLayoutId")
        return R.layout.activity_main
    }

    override fun initView() {
        Log.e("MainFragment", "initView")
    }
}
