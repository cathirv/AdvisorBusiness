package es.cr.advisorbusiness

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import es.cr.advisorbusiness.databinding.ActivitySplashBinding
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initSplash()
    }

    private fun initSplash() {
        val timer: Thread = object : Thread() {
            override fun run() {
                try {
                    sleep(2500)
                } catch (exception: InterruptedException) {
                    exception.printStackTrace()
                } finally {
                    startActivity<MainActivity>()
                    finish()
                }
            }
        }
        timer.start()
    }
}
