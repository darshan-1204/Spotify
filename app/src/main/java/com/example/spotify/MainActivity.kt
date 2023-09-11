package com.example.spotify

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.spotify.Api.ApiClient
import com.example.spotify.Api.ApiInterface
import com.example.spotify.Api.SpotifyModel
import com.example.spotify.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadApi()


    }

    fun loadApi(){
        var query = "Arijit Singh"
        var apiInterface = ApiClient.getApiClient().create(ApiInterface::class.java)
        apiInterface.search(query,"multi",0,10,5).enqueue(object : Callback<SpotifyModel>{
            override fun onResponse(call: Call<SpotifyModel>, response: Response<SpotifyModel>) {
                if (response.isSuccessful){
                    var data = response.body()
                    Log.e(TAG, "onResponse: =========$data")
                }
            }

            override fun onFailure(call: Call<SpotifyModel>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }
}
