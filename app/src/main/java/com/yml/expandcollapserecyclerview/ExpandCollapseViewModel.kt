package com.yml.expandcollapserecyclerview

import android.content.Context
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yml.expandcollapserecyclerview.data.*

class ExpandCollapseViewModel : ViewModel(), OnClick<BaseUiData> {
    private val recyclerviewAdapterModel = RecyclerviewAdapterModel(mutableListOf())
    private val _mutableLiveData = MutableLiveData<RecyclerviewAdapterModel>()
    val liveData: LiveData<RecyclerviewAdapterModel>
        get() = _mutableLiveData

    fun fetchData(context: Context) {

        recyclerviewAdapterModel.uiList.addAll(
            listOf(
                ExternalLinkOneUiData(
                    layoutFile = R.layout.viewholder_result_external_link_one,
                    content = "In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts. ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    buttonOneActionData = "https://medium.com/@shrutisaxena0617/precision-vs-recall-386cf9f89488",
                    headerTitle = "item ",
                    buttonOneLabel = "button"
                ),
                PhoneTwoUiData(
                    layoutFile = R.layout.viewholder_result_phone_two,
                    buttonOneLabel = "yes",
                    buttonOneActionData = "asd",
                    buttonTwoLabel = "no",
                    buttonTwoActionData = "asdasd",
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts."
                ),
                ExternalLinkOneUiData(
                    layoutFile = R.layout.viewholder_result_external_link_one,
                    content = "In context blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts. ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    buttonOneActionData = "https://medium.com/@shrutisaxena0617/precision-vs-recall-386cf9f89488",
                    headerTitle = "item ",
                    buttonOneLabel = "button"
                ),
                PhoneThreeUiData(
                    layoutFile = R.layout.viewholder_result_phone_three,
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts.",
                    linkLabel = "here",
                    linkActionData = "asd",
                    buttonActionData = "asd",
                    buttonLabel = "Ok"
                ),
                ExternalLinkOneUiData(
                    layoutFile = R.layout.viewholder_result_external_link_one,
                    content = "In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts. ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    buttonOneActionData = "https://medium.com/@shrutisaxena0617/precision-vs-recall-386cf9f89488",
                    headerTitle = "item ",
                    buttonOneLabel = "button"
                ),
                PhoneThreeUiData(
                    layoutFile = R.layout.viewholder_result_phone_three,
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts.",
                    linkLabel = "here",
                    linkActionData = "asd",
                    buttonActionData = "asd",
                    buttonLabel = "Ok"
                ),
                PhoneTwoUiData(
                    layoutFile = R.layout.viewholder_result_phone_two,
                    buttonOneLabel = "yes",
                    buttonOneActionData = "asd",
                    buttonTwoLabel = "no",
                    buttonTwoActionData = "asdasd",
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts."
                ),
                ExternalLinkOneUiData(
                    layoutFile = R.layout.viewholder_result_external_link_one,
                    content = "In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts. ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    buttonOneActionData = "https://medium.com/@shrutisaxena0617/precision-vs-recall-386cf9f89488",
                    headerTitle = "item ",
                    buttonOneLabel = "button"
                ),
                PhoneThreeUiData(
                    layoutFile = R.layout.viewholder_result_phone_three,
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts.",
                    linkLabel = "here",
                    linkActionData = "asd",
                    buttonActionData = "asd",
                    buttonLabel = "Ok"
                ),

                ExternalLinkOneUiData(
                    layoutFile = R.layout.viewholder_result_external_link_one,
                    content = "In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts. ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    buttonOneActionData = "https://medium.com/@shrutisaxena0617/precision-vs-recall-386cf9f89488",
                    headerTitle = "item ",
                    buttonOneLabel = "button"
                ),
                PhoneTwoUiData(
                    layoutFile = R.layout.viewholder_result_phone_two,
                    buttonOneLabel = "yes",
                    buttonOneActionData = "asd",
                    buttonTwoLabel = "no",
                    buttonTwoActionData = "asdasd",
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts."
                ),
                PhoneThreeUiData(
                    layoutFile = R.layout.viewholder_result_phone_three,
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts.",
                    linkLabel = "here",
                    linkActionData = "asd",
                    buttonActionData = "asd",
                    buttonLabel = "Ok"
                ),
                PhoneTwoUiData(
                    layoutFile = R.layout.viewholder_result_phone_two,
                    buttonOneLabel = "yes",
                    buttonOneActionData = "asd",
                    buttonTwoLabel = "no",
                    buttonTwoActionData = "asdasd",
                    headerTitle = "item ",
                    stateDrawable = ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!,
                    content = "\"In this blog, I will focus on the challenges pertaining to model evaluation I came across while implementing a machine log analytics classification algorithm. Specifically, I will demonstrate the meaning of model evaluation metrics — precision and recall through real life examples, and explain the trade-offs involved. Though, my learnings are derived from my experience in the log analytics project, I will try to give generic examples to explain all the concepts."
                )
            )
        )

        _mutableLiveData.value = recyclerviewAdapterModel
    }

    override fun onItemClick(dataModel: Any, pos: Int, tag: String) {
        //
    }

    fun updateData(dataModel: Any, pos: Int, context: Context) {
        when (dataModel) {
            is PhoneThreeUiData -> handlePhoneThreeViewUpdation(pos, dataModel, context)
            is PhoneTwoUiData -> handlePhoneTwoViewUpdation(pos, dataModel, context)
            is ExternalLinkOneUiData -> handleExternalLinkOneUpdation(pos, dataModel, context)
        }

        _mutableLiveData.value = recyclerviewAdapterModel
    }

    private fun handlePhoneThreeViewUpdation(
        pos: Int,
        card: PhoneThreeUiData,
        context: Context
    ): Boolean {
        card.isExpanded = !card.isExpanded
        card.stateDrawable = getExpandStateImage(card.isExpanded, context)
        recyclerviewAdapterModel.operationType = AdapterNotifyType.CHANGED
        recyclerviewAdapterModel.modifiedPosition = pos
        return card.isExpanded
    }

    /**
     * Method to handle the phone type 2 expansion and collapse
     */
    private fun handlePhoneTwoViewUpdation(
        pos: Int,
        card: PhoneTwoUiData,
        context: Context
    ): Boolean {
        card.isExpanded = !card.isExpanded
        card.stateDrawable = getExpandStateImage(card.isExpanded, context)
        recyclerviewAdapterModel.operationType = AdapterNotifyType.CHANGED
        recyclerviewAdapterModel.modifiedPosition = pos
        return card.isExpanded
    }

    private fun handleExternalLinkOneUpdation(
        pos: Int,
        card: ExternalLinkOneUiData,
        context: Context
    ): Boolean {
        card.isExpanded = !card.isExpanded
        card.stateDrawable = getExpandStateImage(card.isExpanded, context)
        recyclerviewAdapterModel.operationType = AdapterNotifyType.CHANGED
        recyclerviewAdapterModel.modifiedPosition = pos
        return card.isExpanded
    }

    private fun getExpandStateImage(expanded: Boolean, context: Context): Drawable {
        return if (expanded) {
            ContextCompat.getDrawable(context, R.drawable.ic_minus_blue)!!
        } else {
            ContextCompat.getDrawable(context, R.drawable.ic_plus_blue)!!
        }
    }
}