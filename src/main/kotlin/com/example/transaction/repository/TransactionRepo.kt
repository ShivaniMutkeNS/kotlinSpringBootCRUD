package com.example.transaction.repository
import com.example.transaction.entity.Transaction
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

/**
 * Created by hendisantika on 6/30/17.
 */
@Repository
interface TransactionRepo : CrudRepository<Transaction, Long> {
    fun findByAccountId(accountId: Long): Iterable<Transaction>//use list
}