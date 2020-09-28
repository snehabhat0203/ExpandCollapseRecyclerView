package com.yml.expandcollapserecyclerview.data


import androidx.databinding.BindingAdapter
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.ExpandCollapseAnimationListener
import com.yml.expandcollapserecyclerview.ExpandCollapsibleAdapter
import com.yml.expandcollapserecyclerview.OnClick
import com.yml.expandcollapserecyclerview.notifyAdapter

/**
 * Home owner resource binding adapter : Using for binding home view components
 */
object ResourcesDataBindingAdapter {
    /**
     * setRecyclerViewProperties method using for setting item list and click listener homeOwner list and
     * whenever data change is happening time in homeOwner list, this method will notify to adapter
     * @param recyclerView : Home owner resource recycler view instance
     * @param data : setRecyclerViewProperties
     * @param onItemClickListener : Item click listener
     */
    @BindingAdapter(
        "resourceItemList",
        "resourceItemClick",
        "expandCollapseAnimationListener",
    )
    @JvmStatic
    fun <T> setRecyclerViewProperties(
        recyclerView: RecyclerView,
        data: LiveData<RecyclerviewAdapterModel>,
        onItemClickListener: OnClick<T>,
        expandCollapseAnimationListener: ExpandCollapseAnimationListener? = null,
    ) {
        @Suppress("UNCHECKED_CAST")
        var adapter = recyclerView.adapter as? ExpandCollapsibleAdapter<T>
        if (adapter == null && data.value != null) {
            adapter =
                ExpandCollapsibleAdapter(
                    data.value?.uiList!!,
                    onItemClickListener,
                    expandCollapseAnimationListener
                )
            recyclerView.adapter = adapter
            recyclerView.setHasFixedSize(true)
        }
        data.value?.apply {
            adapter?.notifyAdapter(this)
        }
    }

}
