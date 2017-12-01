package com.felania.monstersuperleaguedatabook.activities

import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import com.felania.monstersuperleaguedatabook.R
import com.felania.monstersuperleaguedatabook.utils.CheckState
import com.felania.monstersuperleaguedatabook.utils.Variables
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_language_selection.*
import java.util.*

/**
 * Created by Krsnik on 7/29/2017.
 */
class LanguageSelectionActivity : AppCompatActivity() {

    val context : Context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selection)

//        title = getString(R.string.select_language)


        Get()
    }



    fun Get (){

        gvLanguageSelection.adapter = GridViewAdapter(context )


    }

    fun FinishActivity(lang : String) {


        val locale = Locale(lang)
        Locale.setDefault(locale)
        val resource = context .resources
        val config = resource.configuration

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            config.setLocale(locale)
        } else {
            config.locale = locale
        }

        SaveSetting(Variables.SETTING_LANGUAGE, lang)

        resource.updateConfiguration(config, resource.displayMetrics )

        val intent = baseContext.packageManager.getLaunchIntentForPackage(baseContext.packageName )
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)

        ActivityCompat.finishAffinity(this)


        overridePendingTransition(0, 0)
        startActivity(intent)
    }


    private fun SaveSetting(key: String, value: String) {

        val sharedPreferences = getSharedPreferences(Variables.SETTING_LANGUAGE, Context.MODE_PRIVATE)
        val prefsEditor = sharedPreferences.edit()


        prefsEditor.putString(key, value)

        prefsEditor.apply()

    }





    class GridViewAdapter(ctx: Context) : BaseAdapter() {

        var mLangMap = Variables.langMap
        var mStringMap = Variables.stringMap

        var mCtx : Context = ctx

        val mInflator : LayoutInflater

        init {
            mInflator = LayoutInflater.from(mCtx)
        }


        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val view: View
            val vh: ListRowHolder

            if(convertView == null) {
                view = this.mInflator.inflate(R.layout.lang_child, parent, false)
                vh = ListRowHolder(view)
                view.tag = vh
            } else {
                view = convertView
                vh = view.tag as ListRowHolder

            }

            vh.rb.text = mLangMap[position]

            vh.rb.setOnClickListener {

                val alertDialog = AlertDialog.Builder(mCtx).create()
                alertDialog.setTitle("Language Setting")

                if(android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                    alertDialog.setMessage(Html.fromHtml(
                            "Change language to " + "<b><font color='blue'>" + mLangMap[position] + "</font></b>"
                            + "\nApplication will be restarted afterward.",

                            Html.FROM_HTML_MODE_LEGACY))
                } else {
                    alertDialog.setMessage(Html.fromHtml(
                            "Change language to " + "<b><font color='blue'>" + mLangMap[position] + "</font></b>"
                            + "\nApplication will be restarted afterward."

                            ))
                }
                alertDialog.setCancelable(false)
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        { _, _ ->

                            val s = Variables.stringLangMap[mLangMap[position]]!!
                            
                            (mCtx as LanguageSelectionActivity).FinishActivity(s)

                        })

                alertDialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel",
                        { _, _ ->
                            alertDialog.dismiss()
                        })


                alertDialog.show()

            }



            return view

        }

        override fun getItem(position: Int): String? {
            return mLangMap[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getCount() = mLangMap.size


    }

    class ListRowHolder(row: View) {
        val rb: Button = row.findViewById(R.id.btnLanguage)

    }


}