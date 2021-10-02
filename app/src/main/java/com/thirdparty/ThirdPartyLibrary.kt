package com.thirdparty

import android.util.Log

interface ThirdPartyLibrary {
    fun run()

    object Builder {
        fun build(): ThirdPartyLibrary = object : ThirdPartyLibrary {
            override fun run() {
                Log.d("ThirdPartyLibrary", "run")
            }
        }
    }
}
