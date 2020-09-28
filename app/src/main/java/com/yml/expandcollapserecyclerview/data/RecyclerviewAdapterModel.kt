package com.yml.expandcollapserecyclerview.data

import com.yml.expandcollapserecyclerview.BaseUiData

/**
 *  Data class to be used for the recycler view list in view models
 */
class RecyclerviewAdapterModel(
    /**
     * List of the [BaseUiData] to be used to populate the recycler view
     */
    var uiList: MutableList<BaseUiData>,
    /**
     * Field to define the type of notification to be propagated to the adapter
     * by default it is [AdapterNotifyType.COMPLETE]
     */
    var operationType: AdapterNotifyType = AdapterNotifyType.COMPLETE,

    /**
     * Field to define the position that is modified
     */
    var modifiedPosition: Int = -1,

    /**
     * Field to define the start position fo range modification operation in the adapter
     */
    var positionStart: Int = -1,

    /**
     * Field to define the item count when there is range modification operation on the adapter
     */
    var itemCount: Int = -1,

    /**
     * Field to make sure there is time change and livedata is updated properly
     */
    var updatedTime: Long = System.currentTimeMillis()
) {
    /**
     * Method to reset the adapter to notifyDataSetChanged()
     */
    fun resetOperationType() {
        operationType = AdapterNotifyType.COMPLETE
    }
}
