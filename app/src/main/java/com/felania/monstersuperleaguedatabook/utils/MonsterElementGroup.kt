package com.felania.monstersuperleaguedatabook.utils

import java.io.Serializable

/**
 * Created by Krsnik on 8/11/2017.
 */
class MonsterElementGroup( name: String ) : Serializable {

    constructor(        evo3Name: String,
                        fire: MutableMap<Int,  MonsterEvolutionGroup> = hashMapOf(),
                        water: MutableMap<Int, MonsterEvolutionGroup> = hashMapOf(),
                        tree: MutableMap<Int, MonsterEvolutionGroup> = hashMapOf(),
                        light: MutableMap<Int, MonsterEvolutionGroup> = hashMapOf(),
                        dark: MutableMap<Int, MonsterEvolutionGroup> = hashMapOf()) : this(evo3Name)

}