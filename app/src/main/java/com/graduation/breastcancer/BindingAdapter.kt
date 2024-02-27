package com.graduation.breastcancer

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.TextInputLayout

@BindingAdapter("app:Error")
fun bindErrorOnTextField(
    textInputLayout: TextInputLayout, errorMessage: String?
) {
    textInputLayout.error = errorMessage
}