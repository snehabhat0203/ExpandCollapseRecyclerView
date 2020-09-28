package com.yml.expandcollapserecyclerview

/**
 *OnClick listener are using for passing user click specified component
 */
interface OnClick<T> {
    fun onItemClick(dataModel: Any, pos: Int, tag: String)
}
