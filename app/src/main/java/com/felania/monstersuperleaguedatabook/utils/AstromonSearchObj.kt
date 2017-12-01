package com.felania.monstersuperleaguedatabook.utils

import com.felania.msldb.MsgDictItemOuterClass.MsgDictItem
import java.io.Serializable


class AstromonSearchObj (
        var evo1: String,
        var evo2: String,
        var evo3: String,
        var dict: MsgDictItem) : Serializable

