package com.tapaafandi.dictionaryytpl.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.Phonetic

data class PhoneticDto(
    @SerializedName("audio")
    val audio: String,
    @SerializedName("text")
    val text: String
) {
    fun toPhonetic(): Phonetic {
        return Phonetic(
            audio = audio,
            text = text
        )
    }
}