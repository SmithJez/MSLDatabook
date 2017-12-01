package com.felania.monstersuperleaguedatabook.activities

import android.app.Application
import android.content.res.Configuration
import android.os.Build
import android.view.ContextThemeWrapper
import java.util.*


/**
 * Created by Krsnik on 7/25/2017.
 */
class LocaleLanguage {

    private var mLocale: Locale? = null

    fun setLocale(locale: Locale) {
        mLocale = locale
        if (mLocale != null) {
            Locale.setDefault(mLocale)
        }
    }

    fun updateConfig(wrapper: ContextThemeWrapper) {
        if (mLocale != null && Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            val configuration = Configuration()
            configuration.setLocale(mLocale)
            wrapper.applyOverrideConfiguration(configuration)
        }
    }

    fun updateConfig(app: Application, configuration: Configuration) {
        if (mLocale != null && Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN_MR1) {
            //Wrapping the configuration to avoid Activity endless loop
            val config = Configuration(configuration)
            config.locale = mLocale
            val res = app.baseContext.resources
            res.updateConfiguration(config, res.displayMetrics)
        }
    }
}