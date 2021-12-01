package com.tapaafandi.dictionaryytpl.feature_dictionary.data.local

import androidx.room.TypeConverter
import com.google.gson.reflect.TypeToken
import com.tapaafandi.dictionaryytpl.feature_dictionary.data.util.JsonParser
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.Meaning

class Converters(
    private val jsonParser: JsonParser
) {
    @TypeConverter
    fun fromMeaningJson(json: String): List<Meaning> {
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object : TypeToken<ArrayList<Meaning>>() {}.type
        ) ?: emptyList()
    }

    fun toMeaningsJson(meanings: List<Meaning>): String {
        return jsonParser.toJson(
            meanings,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: "[]"
    }
}