package me.pisal.abaclone.scene.loan

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import me.pisal.abaclone.data.repo.menu.MenusRepository

class NewLoansViewModel(
    private val menusRepository: MenusRepository,
) : ViewModel() {

    fun menus(useCache: Boolean) = liveData {
        /**
         * Return the cached data first
         */
        emit(menusRepository.newLoanMenus(useCache))

        /**
         * Then fetch in the background to update cache
         */
        menusRepository.newLoanMenus(false)
    }
}