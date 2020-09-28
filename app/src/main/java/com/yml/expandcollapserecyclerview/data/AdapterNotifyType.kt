package com.yml.expandcollapserecyclerview.data

/**
 * Notify type for the changes in adapter
 */
enum class AdapterNotifyType {
    /**
     * Type mapping to adapter.notifyItemRemoved(modifiedPosition)
     */
    REMOVE,

    /**
     * Type mapping to adapter.notifyItemInserted(modifiedPosition)
     */
    INSERT,

    /**
     * Type mapping to adapter.notifyItemChanged(modifiedPosition)
     */
    CHANGED,

    /**
     * Type mapping to adapter.notifyDataSetChanged()
     */
    COMPLETE,

    /**
     * Type mapping to adapter.notifyItemRangeRemoved(positionStart,itemCount)
     */
    RANGE_REMOVED,

    /**
     * Type mapping to adapter.notifyItemRangeInserted(positionStart,itemCount)
     */
    RANGE_INSERTED,

    /**
     * Type mapping to adapter.notifyItemRangeChanged(positionStart, itemCount)
     */
    RANGE_CHANGED
}
