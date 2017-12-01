package com.felania.monstersuperleaguedatabook.utils

import com.felania.msldb.MsgDictItemOuterClass.MsgDictItem
import java.io.Serializable


class MonsterEvolutionGroup (
        var resName: String,
        var evo1: MsgDictItem,
        var evo2: MsgDictItem,
        var evo3: MsgDictItem ) : Serializable