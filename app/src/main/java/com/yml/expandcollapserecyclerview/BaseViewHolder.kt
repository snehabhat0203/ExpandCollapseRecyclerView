package com.yml.expandcollapserecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * Base view holder class
 * @param view: root view
 */
abstract class BaseViewHolder<T>(view: View, protected var onClick: OnClick<T>) :
    RecyclerView.ViewHolder(view) {
    abstract fun bindData(dataModel: T, position: Int)

    open fun bindPartialData(holder: BaseViewHolder<T>, payload: Any) {
        // NO - OP
    }
}
