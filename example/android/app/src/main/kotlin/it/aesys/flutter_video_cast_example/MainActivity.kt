package it.aesys.flutter_cast_video_example

import com.google.android.gms.cast.framework.CastContext
import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine
import io.flutter.plugins.GeneratedPluginRegistrant
import java.lang.Exception

class MainActivity: FlutterFragmentActivity() {
    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        GeneratedPluginRegistrant.registerWith(flutterEngine)
        try {
            CastContext.getSharedInstance(applicationContext)
        } catch (ignored: Exception){}
    }
}
