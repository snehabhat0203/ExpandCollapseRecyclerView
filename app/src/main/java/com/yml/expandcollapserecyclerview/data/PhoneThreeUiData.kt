package com.yml.expandcollapserecyclerview.data

import android.graphics.drawable.Drawable
import androidx.annotation.LayoutRes
import com.yml.expandcollapserecyclerview.BaseUiData

/**
 * This data class is to hold the phone ui type 3
 * @param headerTitle holds the link's display data, it's mandatory
 */
data class PhoneThreeUiData(
    var headerTitle: String,
    @LayoutRes val layoutFile: Int,
    var content: String,
    var buttonLabel: String,
    var buttonActionData: String,
    var linkLabel: String,
    var linkActionData: String,
    var stateDrawable: Drawable,
    var isExpanded: Boolean = false,
    var isBottomGapVisible: Boolean = false
) : BaseUiData{
    override fun getUiType(): Int {
        return layoutFile
    }

}
