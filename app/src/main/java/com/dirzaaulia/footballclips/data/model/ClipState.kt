package com.dirzaaulia.footballclips.data.model

import com.google.android.gms.ads.AdView

data class ClipState(
    val isPlaceholder: Boolean = false,
    val data: Clip,
    val ad: AdView? = null
) {
    companion object {
        fun getClipStatesPlaceholder(): List<ClipState> {
            val clipStates = mutableListOf<ClipState>()
            for (i in 1..20) {
                val clipState = ClipState(isPlaceholder = true, data = Clip())
                clipStates.add(clipState)
            }
            return clipStates.toList()
        }
    }
}