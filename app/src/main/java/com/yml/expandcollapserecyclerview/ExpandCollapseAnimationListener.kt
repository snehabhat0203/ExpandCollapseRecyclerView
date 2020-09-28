package com.yml.expandcollapserecyclerview

import android.view.View

/**
 * Interface to handle expand collapse callback
 */
interface ExpandCollapseAnimationListener {
    fun onExpandableHeaderClicked(
        dataModel: Any,
        pos: Int,
        tag: String,
        viewToBeAnimated: View,
        clickedView: View
    )
}
