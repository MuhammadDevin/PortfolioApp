package com.devinidn.portofilio.binding_adapter

import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.PointerIconCompat.load
import androidx.databinding.BindingAdapter
import coil.load
import com.devinidn.portofilio.data.Portofolio

class BindingAdapterExperience {
}

@BindingAdapter("experienceTitle")
fun TextView.setExperienceTitle(data: Portofolio?) {
    data?.let {
        text = data.title
    }
}

@BindingAdapter("experienceDetail")
fun TextView.setExperienceDetail(data: Portofolio?) {
    data?.let {
        text = data.detail
    }
}

@BindingAdapter("experienceImage")
fun ImageView.setExperienceImage(data: Portofolio) {
    load(data.image) {
        crossfade(1000)
    }
}
