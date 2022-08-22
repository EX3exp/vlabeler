package com.sdercolin.vlabeler.model

import androidx.compose.runtime.Immutable
import com.sdercolin.vlabeler.io.Spectrogram
import com.sdercolin.vlabeler.io.Wave

@Immutable
class Sample(
    val info: SampleInfo,
    val wave: Wave,
    val spectrogram: Spectrogram?
)
