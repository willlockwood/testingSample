package com.willlockwood.takehometemplate.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.willlockwood.takehometemplate.R
import kotlinx.android.synthetic.main.fragment_view_page.*

class PageFragment : Fragment() {

    private lateinit var pageString: String

//    private lateinit var lockwoodVM: LockwoodVM
//    private lateinit var recyclerView: RecyclerView
//    private lateinit var recyclerViewSwipe: RecyclerView
//    private lateinit var adapterLockwood: LockwoodRecyclerAdapter
//    private lateinit var compositeDisposable: CompositeDisposable
//
//    private val lockwoodApiService by lazy { LockwoodApiService.create() }
//    private val lockwoodApiServiceRx by lazy { LockwoodApiService.createRx() }
//
//    private lateinit var swipeContainer: SwipeRefreshLayout

//    private val gson = GsonBuilder().create()
//    private val retrofit = Retrofit.Builder()
//        .baseUrl(MainActivity.BASE_URL)
//        .addConverterFactory(GsonConverterFactory.create(gson))
//        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            pageString = it.getString("pageString")!!
        }

//        compositeDisposable = CompositeDisposable()

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_view_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        writeString()
//        setUpViewModels()
//
//        setUpRecyclerView()
//
//        observeLockwoods()
//
//        apiCallRxJava()
//
//        initSwipeToRefresh()
    }

    private fun writeString() {
        textView.text = pageString
    }

//    private fun observeLockwoods() {
//        lockwoodVM.allLockwoods().observe(viewLifecycleOwner, Observer {
//            it?.let { adapterLockwood.setLockwoods(it) }
//        })
//    }
//
//    private fun setUpViewModels() {
//        lockwoodVM = ViewModelProviders.of(this).get(LockwoodVM::class.java)
//    }
//
//    private fun setUpRecyclerView() {
//        recyclerView = recycler_view
//        recyclerViewSwipe = recycler_view_swipe
//        adapterLockwood = LockwoodRecyclerAdapter(requireContext())
//        recyclerView.adapter = adapterLockwood
//        recyclerViewSwipe.adapter = adapterLockwood
//        adapterLockwood.setOnItemClickListener(object : LockwoodRecyclerAdapter.OnItemClickListener {
//            override fun onItemClick(view: View, position: Int) {
//                Toast.makeText(requireContext(), "Item clicked", Toast.LENGTH_LONG).show()
//            }
//        })
//    }
//
//    private fun initSwipeToRefresh() {
//        swipeContainer = swipe_container
//        swipeContainer.setOnRefreshListener {
//            apiCallRxJava()
//        }
//    }
//
//    fun handleError(throwable: Throwable) {
//        Log.e("PageFragment", "error", throwable)
//        swipeContainer.isRefreshing = false
//    }
//
//    fun handleResponse(response: LockwoodResponse) {
//        val blah = response
//        lockwoodVM.insertLockwoods(
//            response.hits
//        )
//        swipeContainer.isRefreshing = false
//    }
//
//    private fun apiCallRxJava() {
//
//        compositeDisposable.add(lockwoodApiServiceRx.getRxPhotos()
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeOn(Schedulers.io())
//            .subscribe(this::handleResponse) {
//                handleError(it)
//            }
//        )
//
////        val call = lockwoodApiService.getPhotos(MainActivity.photos_per_page, MainActivity.API_KEY)
////        call.enqueue(
////            object : Callback<LockwoodResponse> {
////                override fun onResponse(call: Call<LockwoodResponse>, response: Response<LockwoodResponse>) {
////                    when (response.code()) {
////                        200 -> {
////                            val blah = response
////                            val body = response.body()
////                            val likes = body?.likes
////                            lockwoodVM.insertLockwoods(response.body()?.likes!!)
////                        }
////                        429 -> { }
////                        else -> { }
////                    }
////                }
////                override fun onFailure(call: Call<LockwoodResponse>, t: Throwable) {}
////            }
////        )
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        compositeDisposable.clear()
//    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String) =
            PageFragment().apply {
                arguments = Bundle().apply {
                    putString("pageString", param1)
                }
            }
    }
}
