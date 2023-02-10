package com.example.transaction.entity

import jakarta.persistence.*


/**
 * Created by hendisantika on 6/30/17.
 */
@Entity
@Table(name = "TransactionTable")
data class Transaction(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?,

    @Column(name = "amount")
    var amount: Long,

    @Column(name = "accountId", unique = true, nullable = false)
    val accountId: Long,
) {
   fun mapToViewModel() {

   }
}