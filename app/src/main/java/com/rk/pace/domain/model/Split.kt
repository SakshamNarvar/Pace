package com.rk.pace.domain.model

data class Split(
    val kmIndex: Int,
    val paceSeconds: Int,
    val isKM: Boolean = true
)
