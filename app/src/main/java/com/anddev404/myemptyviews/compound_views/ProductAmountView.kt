package com.anddev404.myemptyviews.compound_views

import android.content.Context
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.anddev404.myemptyviews.R

class ProductAmountView(context: Context?, attrs: AttributeSet?) : LinearLayout(context, attrs) {

    private var minusImageView: ImageView
    private var plusImageView: ImageView
    private var amountTextView: TextView

    private var amount = 1
    private var minAmount = 1
    private var maxAmount = 99999

    init {
        inflate(context, R.layout.compound_view_product_amount, this)

        minusImageView = findViewById(R.id.minus_button)
        plusImageView = findViewById(R.id.plus_button)
        amountTextView = findViewById(R.id.amount_text_view)

        val typedArray = context?.obtainStyledAttributes(attrs, R.styleable.ProductAmountView)

        typedArray?.let {
            try {

                val amount = typedArray.getInteger(R.styleable.ProductAmountView_amount, 1)
                setAmount(amount)

            } finally {
                typedArray.recycle()
            }
        }
        minusImageView.setOnClickListener {
            amount--
            setAmount(amount)
        }
        plusImageView.setOnClickListener {
            amount++
            setAmount(amount)
        }
    }

    fun setAmount(amount: Int) {
        this.amount = amount
        if (amount < minAmount) this.amount = minAmount
        if (amount > maxAmount) this.amount = maxAmount
        amountTextView.text = "" + this.amount
    }
}