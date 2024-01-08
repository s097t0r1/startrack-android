package io.android.startrack

import android.content.Context
import io.android.startrack.entities.Error
import io.android.startrack.entities.Event

interface StarTrack {

    /**
     * Initialize the library
     */
    fun init(context: Context, config: StarTrackConfig)

    /**
     * Send event data
     *
     * @param event a custom event list
     * @see Event
     */
    fun reportEvent(event: Event)

    /**
     * Send error data
     *
     * @param error a custom error
     * @see Error
     */
    fun reportError(error: Error)
}

