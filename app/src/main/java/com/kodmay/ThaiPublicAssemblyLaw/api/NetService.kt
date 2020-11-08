package com.kodmay.ThaiPublicAssemblyLaw.api

import com.google.gson.GsonBuilder
import com.kodmay.ThaiPublicAssemblyLaw.BuildConfig
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.security.cert.CertificateException
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager

/**
 * Created by layer on 8/25/2017.
 */
class NetService private constructor() {

    companion object {
        private var instance: Retrofit? = null

        @JvmStatic
        fun getRetrofit(): Retrofit {
            if (instance == null) {

                val trustAllCerts = arrayOf<TrustManager>(object : X509TrustManager {
                    @Throws(CertificateException::class)
                    override fun checkClientTrusted(chain: Array<java.security.cert.X509Certificate>, authType: String) {
                    }

                    @Throws(CertificateException::class)
                    override fun checkServerTrusted(chain: Array<java.security.cert.X509Certificate>, authType: String) {
                    }

                    override fun getAcceptedIssuers(): Array<java.security.cert.X509Certificate> {
                        return arrayOf()
                    }
                })

                // Install the all-trusting trust manager
                val sslContext = SSLContext.getInstance("SSL")
                sslContext.init(null, trustAllCerts, java.security.SecureRandom())
                // Create an ssl socket factory with our all-trusting manager
                val sslSocketFactory = sslContext.socketFactory

                val interceptor = HttpLoggingInterceptor()
                        .apply {
                            level = HttpLoggingInterceptor.Level.BODY
                        }


                val client = OkHttpClient.Builder().apply {
                    sslSocketFactory(sslSocketFactory,trustAllCerts[0] as X509TrustManager)
                    networkInterceptors().add(Interceptor { chain ->
                        val original = chain.request()
                        val request = original.newBuilder()
                            .addHeader("Connection", "close")
                            .method(original.method(), original.body())
                            .build()
                        chain.proceed(request)
                    })
                    addInterceptor(interceptor)
                }

                instance = Retrofit.Builder().baseUrl(BuildConfig.HOST)
                        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                        .addConverterFactory(createGsonConverter())
                        .client(client.build())
                        .build()!!
            }
            return instance!!
        }

        private fun createGsonConverter(): GsonConverterFactory {
            val builder = GsonBuilder().serializeNulls()
            return GsonConverterFactory.create(builder.create())
        }
    }
}