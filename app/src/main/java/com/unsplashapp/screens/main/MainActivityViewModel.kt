package com.unsplashapp.screens.main

import com.domain.entities.model.ModelApp
import com.domain.entities.model.Root
import com.domain.usecases.GetUnsplashUseCase
import com.unsplashapp.base.BaseViewModel
import com.unsplashapp.base.SingleLiveEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(
    private val getUnsplashUseCase: GetUnsplashUseCase
) : BaseViewModel() {

    val action = SingleLiveEvent<Action>()
    val error = SingleLiveEvent<Errors>()

    fun fetchUnSplashApi() {
        getUnsplashUseCase
            .execute()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess = {
                    readData(it)
                },
                onError = {
                    error.value = Errors.ErrorException(it)
                }
            ).addTo(disposables)
    }

    fun readData(listRoot: List<Root>) {
        val listModel = arrayListOf<ModelApp>()
        listRoot.forEach { root ->
            val repo = ModelApp().apply {
                picture1 = root.urls?.raw
                picture2 = root.urls?.full
                picture3 = root.urls?.regular
                picture4 = root.urls?.small
            }
            listModel.add(repo)
        }
        action.value = Action.DownloadData(listModel)
    }

    sealed class Action {
        data class DownloadData(val modelApp: List<ModelApp>) : Action()
    }

    sealed class Errors {
        data class ErrorException(val exception: Throwable) : Errors()
    }
}