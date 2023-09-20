package com.akaishi.springbootlearning.service

import com.akaishi.springbootlearning.model.Data
import com.akaishi.springbootlearning.repository.DataRepository
import org.springframework.stereotype.Service

interface DataService {
    fun getData(): List<Data>
}

@Service
class DefaultDataService(
    private val dataRepository: DataRepository
): DataService {
    override fun getData(): List<Data> {
        val allData = dataRepository.findAll()
        val result = mutableListOf<Data>()
        allData.forEach{
            result.add(Data(
                id = it.id,
                author = it.author,
                quote = it.quote.uppercase()
            ))
        }
        return result
//        return listOf(
//            Data(
//                id = "iddayo",
//                author = "autherdayo",
//                quote = "quotedato"
//            )
//        )
    }
}