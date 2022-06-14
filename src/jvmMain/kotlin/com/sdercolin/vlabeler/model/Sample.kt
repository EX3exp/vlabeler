package com.sdercolin.vlabeler.model

import com.sdercolin.vlabeler.io.Wave
import java.io.File

class Sample(
    val info: SampleInfo,
    val wave: Wave,
    val spectrogram: Array<DoubleArray>?
)

data class SampleInfo(
    val name: String,
    val file: File,
    val sampleRate: Float,
    val bitDepth: Int,
    val isFloat: Boolean,
    val channels: Int
)