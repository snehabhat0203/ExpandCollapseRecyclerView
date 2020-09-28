package com.yml.expandcollapserecyclerview.data

import android.graphics.drawable.Drawable
import androidx.annotation.LayoutRes
import com.yml.expandcollapserecyclerview.BaseUiData

/**
 * This data class is to hold the external link type 1
 * @param headerTitle holds the link's display data, it's mandatory
 * @param stateDrawable is to set indicator for expand(-) or collapsed(+) default is collapsed
 */
data class ExternalLinkOneUiData(
    var headerTitle: String,
    @LayoutRes val layoutFile: Int,
    var content: String,
    var buttonOneLabel: String,
    var buttonOneActionData: String,
    var stateDrawable: Drawable,
    var isExpanded: Boolean = false,
    var isBottomGapVisible: Boolean = false
) : BaseUiData {
    override fun getUiType(): Int {
        return layoutFile
    }
}
