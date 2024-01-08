package io.android.startrack.tracker

import io.android.startrack.entities.Error
import io.android.startrack.entities.Event

/**
 * @author ext.nzmitrovich
 */
internal interface Tracker {

    fun reportEvent(event: Event)

    fun reportError(error: Error)
}
