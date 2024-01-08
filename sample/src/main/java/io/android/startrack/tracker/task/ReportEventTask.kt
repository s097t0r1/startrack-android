package io.android.startrack.tracker.task

import android.util.JsonWriter
import io.android.startrack.StarTrackConfig
import io.android.startrack.entities.Event
import okhttp3.HttpUrl
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody

internal class ReportEventTask(
    private val httpClient: OkHttpClient,
    private val configuration: StarTrackConfig,
    private val event: Event,
) : Runnable {

    override fun run() {
        val url = HttpUrl.Builder()
            .scheme("https")
            .host(configuration.baseUrl)
            .build()

//        val request = Request.Builder()
//            .url(url)
//            .post()
//            .build()
//
//        httpClient.newCall(request)
    }

    private companion object {
        val MEDIA_TYPE = "application/json; charset=UTF-8".toMediaType()
    }
}
