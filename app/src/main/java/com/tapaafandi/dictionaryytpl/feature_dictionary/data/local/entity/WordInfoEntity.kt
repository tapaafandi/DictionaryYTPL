package com.tapaafandi.dictionaryytpl.feature_dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.Meaning
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            origin = origin,
            word = word,
             phonetic = phonetic
        )
    }
}
