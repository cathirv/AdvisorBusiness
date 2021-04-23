package es.cr.advisorbusiness.commons

import android.app.Application
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.ktx.Firebase

class ADVBApplication: Application() {

    private lateinit var firebaseAnalytics: FirebaseAnalytics

    override fun onCreate() {
        super.onCreate()
        initAnalytics()
    }

    fun initAnalytics() {
        firebaseAnalytics = Firebase.analytics
    }
}
