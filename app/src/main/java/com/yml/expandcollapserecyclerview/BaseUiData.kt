package com.yml.expandcollapserecyclerview

/**
 * This interface must be extended by all the ui data classes
 * It's added to support common footer ui in all the adapters
 */
interface BaseUiData {
    fun getUiType(): Int
}
