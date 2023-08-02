package io.sentry.replay.android.sandbox

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Base64
import android.util.Log
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import io.sentry.replay.R
import io.sentry.replay.android.InterceptingView

class MainActivity : AppCompatActivity() {
    companion object {
        private const val TAG = "MainActivity"
    }

    class State {
        var count = 0;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var state = State()

        val recordingView = findViewById<InterceptingView>(R.id.recording)
        val txtCounter = findViewById<TextView>(R.id.counter_label)
        findViewById<View>(R.id.increase_counter).setOnClickListener {
            state.count++
            txtCounter.setTextSize(TypedValue.COMPLEX_UNIT_PX, txtCounter.textSize + 6f)
            txtCounter.text = "${state.count}"
        }

        findViewById<View>(R.id.decrease_counter).setOnClickListener {
            state.count--
            txtCounter.setTextSize(TypedValue.COMPLEX_UNIT_PX, txtCounter.textSize - 6f)
            txtCounter.text = "${state.count}"
        }

        findViewById<Button>(R.id.action_replay).setOnClickListener {
            val replay = recordingView.canvasCommandRecorder.getReplay()
            val replayBase64 = String(Base64.encode(replay, Base64.DEFAULT or Base64.NO_WRAP))
            val webpage: Uri = Uri.parse("https://markushi.github.io/session-replay-android/web/")
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
}