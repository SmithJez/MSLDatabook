package com.felania.monstersuperleaguedatabook.utils

import com.felania.msldb.MonsterGradeOuterClass
import com.felania.msldb.MonsterStatTypeOuterClass
import com.felania.msldb.MonsterStatWeightTypeOuterClass
import java.io.Serializable

/**
 * Created by SmithJez-PC on 8/20/2017.
 */
class DungeonStageMonsterStatObj

(
        var monsterUid: Int,
        var grade: MonsterGradeOuterClass.MonsterGrade,
        var attack: Float,
        var defence: Float,
        var heal: Float,
        var hp: Float,
        var lev: Int,
        var statType: MonsterStatTypeOuterClass.MonsterStatType,
        var statWeightType: MonsterStatWeightTypeOuterClass.MonsterStatWeightType


) : Serializable