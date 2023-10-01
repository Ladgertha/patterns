package ru.ladgertha.patterns.bridge

import android.content.Context
import androidx.fragment.app.Fragment

class CatFragment : Fragment() {
    private var transmitter: CatDataTransmitter? = null

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CatDataTransmitter) {
            transmitter = context
        }
    }

    fun someEventHappened() {
        transmitter?.transmit("Some data")
    }
}
