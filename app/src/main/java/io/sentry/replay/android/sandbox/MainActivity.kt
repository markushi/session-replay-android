package io.sentry.replay.android.sandbox

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import io.sentry.replay.R
import io.sentry.replay.android.ViewRecorder

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    private val viewRecorder: ViewRecorder = ViewRecorder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.action_replay).setOnClickListener {
            val replay = viewRecorder.canvasCommandRecorder.getReplay()
            val replayBase64 = String(Base64.encode(replay, Base64.DEFAULT or Base64.NO_WRAP))
            val webpage: Uri = Uri.parse("http://localhost:8000/")
                .buildUpon()
                .appendQueryParameter("payload", replayBase64).build()

            val intent = Intent(Intent.ACTION_VIEW, webpage)
            try {
                startActivity(intent)
            } catch (e: Exception) {
                Log.e(TAG, "failed to launch website", e)
            }
        }
    }

    override fun onResume() {
        super.onResume()
        viewRecorder.setView(findViewById(R.id.recording))
    }

    override fun onPause() {
        super.onPause()
        viewRecorder.setView(null)
    }
}