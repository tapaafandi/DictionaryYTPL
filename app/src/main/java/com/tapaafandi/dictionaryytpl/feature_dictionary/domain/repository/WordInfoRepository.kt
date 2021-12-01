package com.tapaafandi.dictionaryytpl.feature_dictionary.domain.repository

import com.tapaafandi.dictionaryytpl.core.util.Resource
import com.tapaafandi.dictionaryytpl.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}