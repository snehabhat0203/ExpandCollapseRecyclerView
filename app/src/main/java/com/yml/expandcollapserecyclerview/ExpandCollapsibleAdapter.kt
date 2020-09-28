package com.yml.expandcollapserecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.yml.expandcollapserecyclerview.data.ExternalLinkOneUiData
import com.yml.expandcollapserecyclerview.data.PhoneThreeUiData
import com.yml.expandcollapserecyclerview.data.PhoneTwoUiData
import com.yml.expandcollapserecyclerview.viewholder.ViewHolderPhoneThree
import com.yml.expandcollapserecyclerview.viewholder.ViewHolderPhoneTwo
import com.yml.expandcollapserecyclerview.viewholder.ViewHolderResultExternalLinkOne

class ExpandCollapsibleAdapter<T>(
    private var list: List<BaseUiData>,
    private var onItemClick: OnClick<T>,
    private var expandCollapseAnimationListener: ExpandCollapseAnimationListener? = null,
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    @Suppress("UNCHECKED_CAST")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val inflater = LayoutInflater.from(parent.context)

        return when (viewType) {
            R.layout.viewholder_result_external_link_one -> {
                ViewHolderResultExternalLinkOne(
                    inflater.inflate(R.layout.viewholder_result_external_link_one, parent, false),
                    onItemClick as OnClick<ExternalLinkOneUiData>,
                    expandCollapseAnimationListener
                )
            }
            R.layout.viewholder_result_phone_three -> {
                ViewHolderPhoneThree(
                    inflater.inflate(R.layout.viewholder_result_phone_three, parent, false),
                    onItemClick as OnClick<PhoneThreeUiData>,
                    expandCollapseAnimationListener
                )
            }
            R.layout.viewholder_result_phone_two -> {

                ViewHolderPhoneTwo(
                    inflater.inflate(R.layout.viewholder_result_phone_two, parent, false),
                    onItemClick as OnClick<PhoneTwoUiData>,
                    expandCollapseAnimationListener
                )
            }
            else -> {
                throw IllegalArgumentException("Wrong type")
            }
        }
    }


    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].getUiType()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ViewHolderPhoneTwo -> holder.bindData(list[position] as PhoneTwoUiData)
            is ViewHolderPhoneThree -> holder.bindData(list[position] as PhoneThreeUiData)
            is ViewHolderResultExternalLinkOne -> holder.bindData(list[position] as ExternalLinkOneUiData)
        }
    }

}