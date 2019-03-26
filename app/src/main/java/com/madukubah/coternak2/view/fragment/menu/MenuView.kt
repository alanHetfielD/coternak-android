package com.madukubah.coternak2.view.fragment.menu

import com.madukubah.coternak2.config.base.BasePresenter
import com.madukubah.coternak2.config.base.BaseView
import com.madukubah.coternak2.model.Ad
import com.madukubah.coternak2.model.Category
import com.madukubah.coternak2.model.response.AdsResponse
import com.madukubah.coternak2.model.response.CategoryResponse

interface MenuView {
    interface Presenter : BasePresenter
    {
        fun loadData()
        fun loadCategory( response : CategoryResponse)
        fun loadAds( response : AdsResponse)
    }

    interface MView : BaseView<Presenter>
    {
        fun onLoadCategory( response : List<Category>)
        fun onLoadAds( banners : List<Ad>)
        fun status(isEmpty : Boolean)
    }
}