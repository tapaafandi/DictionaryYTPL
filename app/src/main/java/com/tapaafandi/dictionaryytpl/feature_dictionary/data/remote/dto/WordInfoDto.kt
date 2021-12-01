package com.tapaafandi.dictionaryytpl.feature_dictionary.data.remote.dto


import com.google.gson.annotations.SerializedName
import com.tapaafandi.dictionaryytpl.feature_dictionary.data.local.entity.WordInfoEntity
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.WordInfo

data class WordInfoDto(
    @SerializedName("meanings")
    val meanings: List<MeaningDto>,
    @SerializedName("origin")
    val origin: String,
    @SerializedName("phonetic")
    val phonetic: String,
    @SerializedName("phonetics")
    val phonetics: List<PhoneticDto>,
    @SerializedName("word")
    val word: String
) {
    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}