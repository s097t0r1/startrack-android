package io.android.startrack.tracker

import io.android.startrack.entities.Error
import io.android.startrack.entities.Event
import io.android.startrack.tracker.task.ReportEventTaskFactory
import java.util.concurrent.Executors
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit

internal class ScheduledTracker(
    private val executorService: ScheduledExecutorService,
    private val taskFactory: ReportEventTaskFactory,
) : Tracker {

    override fun reportEvent(event: Event) {
        executorService.schedule(taskFactory.create(event), 1, TimeUnit.SECONDS)
    }

    override fun reportError(error: Error) {
        executorService.schedule(taskFactory.create(error), 1, TimeUnit.SECONDS)
    }
}
