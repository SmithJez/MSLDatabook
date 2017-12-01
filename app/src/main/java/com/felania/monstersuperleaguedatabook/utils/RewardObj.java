package com.felania.monstersuperleaguedatabook.utils;

import com.felania.msldb.MonsterRuneColorOuterClass;
import com.felania.msldb.MonsterRuneSlotShapeOuterClass;
import com.felania.msldb.MsgItemOuterClass;

import java.io.Serializable;


public class RewardObj implements Serializable {

//    private RewardGradeOuterClass.RewardGrade rewardGrade;
//    private MsgRandomItemOuterClass.MsgRandomItem.DataType rewardType;

//    private MonsterRuneSlotShapeOuterClass.MonsterRuneSlotShape itemShape;
//    private MonsterRuneColorOuterClass.MonsterRuneColor itemColor;

    private String itemShape;
    
    private String itemColor;
    private MsgItemOuterClass.MsgItem itemEgg;
    private MsgItemOuterClass.MsgItem itemRuneStone;
    private int amount;
    private Float chance;

    public RewardObj(MsgItemOuterClass.MsgItem itemRuneStone, int amount, Float chance) {
        this.itemRuneStone = itemRuneStone;
        this.amount = amount;
        this.chance = chance;
    }

    public RewardObj(MsgItemOuterClass.MsgItem itemEgg, Float chance) {
        this.itemEgg = itemEgg;
        this.chance = chance;
    }

    public RewardObj(String itemShape, String itemColor, int amount, Float chance) {
        this.itemShape = itemShape;
        this.itemColor = itemColor;
        this.amount = amount;
        this.chance = chance;
    }


    public MsgItemOuterClass.MsgItem getItemRuneStone() {
        return itemRuneStone;
    }

    public void setItemRuneStone(MsgItemOuterClass.MsgItem itemRuneStone) {
        this.itemRuneStone = itemRuneStone;
    }

    public String getItemShape() {
        return itemShape;
    }

    public void setItemShape(String itemShape) {
        this.itemShape = itemShape;
    }

    public String getItemColor() {
        return itemColor;
    }

    public void setItemColor(String itemColor) {
        this.itemColor = itemColor;
    }

    public MsgItemOuterClass.MsgItem getItemEgg() {
        return itemEgg;
    }

    public void setItemEgg(MsgItemOuterClass.MsgItem itemEgg) {
        this.itemEgg = itemEgg;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Float getChance() {
        return chance;
    }

    public void setChance(Float chance) {
        this.chance = chance;
    }
}
