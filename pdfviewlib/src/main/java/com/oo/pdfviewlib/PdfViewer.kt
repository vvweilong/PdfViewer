package com.oo.pdfviewlib

import android.content.Context
import android.graphics.pdf.PdfRenderer
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

/**
 *
 * create by 朱晓龙 2020/2/17 11:44 PM
 * 加载显示 pdf
 *
 * */
class PdfViewer:ViewGroup {
    private val recyclerView: RecyclerView
    private var pdfAdapter:PdfAdapter?=null
    private var pdfRenderer:PdfRenderer?=null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    )
    init {
        recyclerView = RecyclerView(context)
    }
    inner class PdfAdapter(val renderer: PdfRenderer):RecyclerView.Adapter<RecyclerView.ViewHolder>(){

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
           return  PdfPageViewHolder(ImageView(parent.context))
        }

        override fun getItemCount(): Int {
            return renderer.pageCount
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        }

    }
    inner class PdfPageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }



    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }
}