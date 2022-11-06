package com.example.crimedatabase

import android.app.Application

class CrimeDatabaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}