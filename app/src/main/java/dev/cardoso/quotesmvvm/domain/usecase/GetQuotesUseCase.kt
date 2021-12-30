package dev.cardoso.quotesmvvm.domain.usecase


import dev.cardoso.quotesmvvm.data.model.QuoteModel
import dev.cardoso.quotesmvvm.data.model.QuoteResponse
import dev.cardoso.quotesmvvm.domain.QuoteRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor (var quoteRepositoryImpl: QuoteRepository) {


    suspend fun getQuotes(): Flow<List<QuoteModel>> = quoteRepositoryImpl.getQuotes()

    /*suspend fun getQuotes(token: String,quoteModel: QuoteModel): Flow<QuoteResponse?> {
       return quoteRepositoryImpl.getQuotes(token,quoteModel)
    }*/

}