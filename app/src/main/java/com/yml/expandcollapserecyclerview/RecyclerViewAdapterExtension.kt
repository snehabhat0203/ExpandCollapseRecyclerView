package com.yml.expandcollapserecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.data.AdapterNotifyType
import com.yml.expandcollapserecyclerview.data.RecyclerviewAdapterModel

/**
 * Extension to handle adapter notification
 */
fun RecyclerView.Adapter<RecyclerView.ViewHolder>.notifyAdapter(recyclerviewAdapterModel: RecyclerviewAdapterModel) {
    recyclerviewAdapterModel.apply {
        when (operationType) {
            AdapterNotifyType.COMPLETE -> notifyDataSetChanged()
            AdapterNotifyType.INSERT -> notifyItemInserted(modifiedPosition)
            AdapterNotifyType.REMOVE -> notifyItemRemoved(modifiedPosition)
            AdapterNotifyType.CHANGED -> notifyItemChanged(modifiedPosition)
            AdapterNotifyType.RANGE_INSERTED -> notifyItemRangeInserted(
                positionStart,
                itemCount
            )
            AdapterNotifyType.RANGE_REMOVED -> notifyItemRangeRemoved(
                positionStart,
                itemCount
            )
            AdapterNotifyType.RANGE_CHANGED -> notifyItemRangeChanged(positionStart, itemCount)
        }
    }
}
