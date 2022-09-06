package me.pisal.abaclone.model.data.account

import me.pisal.abaclone.common.TResult
import me.pisal.abaclone.model.dto.ResponseWrapper
import me.pisal.abaclone.model.entity.Account
import me.pisal.abaclone.model.entity.Money
import java.math.BigDecimal

class AccountRepositoryImpl : AccountRepository {

    override suspend fun list(): TResult<ResponseWrapper<List<Account>>> {
        val accounts = listOf(
            Account(
                id = "000533492",
                title = "Savings Account with ATM facility",
                category = "Savings",
                primary = true,
                accountNo = "000 533 492",
                colorHex = "#52BAD0",
                money = Money(currency = "USD", amount = BigDecimal(1992.5))
            ),
            Account(
                id = "010855111",
                title = "Mobile Savings Account Resident",
                category = "Mobile Savings",
                primary = false,
                accountNo = "010 855 111",
                colorHex = "#925FB1",
                money = Money(currency = "KHR", amount = BigDecimal(122345.12))
            )
        )
        return TResult.Success(
            ResponseWrapper(
                data = accounts
            )
        )
    }
}