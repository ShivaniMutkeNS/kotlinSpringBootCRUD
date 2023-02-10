package com.example.transaction.controller

import com.example.transaction.entity.Transaction
import com.example.transaction.repository.TransactionRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by hendisantika on 6/30/17.
 */
@RestController
@RequestMapping("TransactionalAPI")
class TransactionController(val repository: TransactionRepo) {


    @GetMapping("/save")
    fun save(): String {
        repository.save(Transaction(1,452,78945))
        repository.save(Transaction(2,452,78945))

        return "Done"
    }

    @RequestMapping("/findAll")
    fun findAll() = repository.findAll()

    @RequestMapping("/findById/{id}")
    fun findById(@PathVariable id: Long) = repository.findById(id)//{}

    @RequestMapping("findByAccountId/{accountId}")
    fun findByAccountId(@PathVariable accountId: Long)
            = repository.findByAccountId(accountId)


}