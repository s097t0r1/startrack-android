package io.android.startrack.tracker.task

import io.android.startrack.StarTrackConfig
import io.android.startrack.entities.Error
import io.android.startrack.entities.Event
import okhttp3.OkHttpClient

/**
 * @author ext.nzmitrovich
 */
internal class ReportEventTaskFactory(
    private val httpClient: OkHttpClient,
    private val configuration: StarTrackConfig,
) {

    fun create(event: Event): ReportEventTask {
        return ReportEventTask(httpClient, configuration, event)
    }

    fun create(error: Error): ReportEventTask {
        TODO()
    }
}
